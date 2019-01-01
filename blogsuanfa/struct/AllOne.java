package blogsuanfa.struct;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by manwei on 19/1/1
 */
public class AllOne {
    Bucket head;
    Bucket tail;
    Map<String, Integer> keyCount;
    Map<Integer, Bucket> countBucket;
    /** Initialize your data structure here. */
    public AllOne() {
        head = new Bucket(Integer.MIN_VALUE);
        tail = new Bucket(Integer.MAX_VALUE);
        head.next = tail;
        tail.pre = head;
        keyCount = new HashMap();
        countBucket = new HashMap();
    }

    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        if(keyCount.containsKey(key)){
            changeKey(key, 1);
        }else{
            keyCount.put(key, 1);
            if(head.next.count != 1){
                addBucketAfter(new Bucket(1), head);
            }
            head.next.keySet.add(key);
            countBucket.put(1, head.next);
        }
    }

    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
        if(keyCount.containsKey(key)){
            int count = keyCount.get(key);
            if(count == 1){
                keyCount.remove(key);
                removeKeyFromBucket(countBucket.get(count), key);
            }else{
                changeKey(key, -1);
            }
        }
    }

    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {
        return tail.pre == head ? "" : tail.pre.keySet.iterator().next();
    }

    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {
        return head.next == tail ? "" : head.next.keySet.iterator().next();
    }
    //字符串个数+1或者-1的处理逻辑
    private void changeKey(String key, int offset){
        int count = keyCount.get(key);
        keyCount.put(key, count + offset);
        Bucket curBucket = countBucket.get(count);
        Bucket newBucket;
        if(countBucket.containsKey(count + offset)){
            newBucket = countBucket.get(count + offset);
        }else{
            newBucket = new Bucket(count + offset);
            countBucket.put(count + offset, newBucket);
            addBucketAfter(newBucket, offset == 1 ? curBucket : curBucket.pre);
        }
        newBucket.keySet.add(key);
        removeKeyFromBucket(curBucket, key);
    }
    //从bucket中删除字符串，注意若bucket无字符串，需要删除bucket
    private void removeKeyFromBucket(Bucket bucket, String key){
        bucket.keySet.remove(key);
        if(bucket.keySet.size() == 0){
            removeBucketFromList(bucket);
            countBucket.remove(bucket.count);
        }
    }
    //当bucket中不包含字符串时，删除bucket
    private void removeBucketFromList(Bucket bucket){
        bucket.pre.next = bucket.next;
        bucket.next.pre = bucket.pre;
        bucket.next = null;
        bucket.pre = null;
    }
    //链表插入节点处理逻辑
    private void addBucketAfter(Bucket newBucket, Bucket preBucket){
        newBucket.next = preBucket.next;
        newBucket.pre = preBucket;
        preBucket.next.pre = newBucket;
        preBucket.next = newBucket;
    }
    private class Bucket{
        int count;
        Set<String> keySet;
        Bucket pre;
        Bucket next;

        public Bucket(int count){
            this.count = count;
            keySet = new HashSet();
        }
    }

}
