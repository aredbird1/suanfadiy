package blogsuanfa.pailie;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by manwei on 18/12/30
 */
public class KthMinPermutation {

    public static void main(String[] args) {
        String ret = getKthMinPermutation(4, 9);
        System.out.println(ret);
    }

    private static String getKthMinPermutation(int n, int k){

        //list中元素为当前未纳入排列中的元素
        List<Integer> f = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            f.add(i);
        }

        String s = "";
        int jc = 1;
        for(int i = 1; i <= n; i++)
            jc *= i;

        for(int i = 0; i < n-1 && k != 1; i++) {
            jc /= (n-i);
            int cur = k/jc - (k%jc == 0 ? 1 : 0);
            k -= cur*jc;

            s += f.get(cur);
            f.remove(cur);
        }

        for(int i = 0; i < f.size(); i++) {
            s += f.get(i);
        }

        return s;
    }
}
