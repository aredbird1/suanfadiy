package test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.LockSupport;

/**
 * Created by manwei on 18/12/19
 */
public class Test {
    public static void main(String[] args) {

        testLockSurport();

//        testMap();
//        testBit();
    }

    private static void testLockSurport() {
        for(int i=0; i<20; i++){
            int value = ThreadLocalRandom.current().nextInt();
            System.out.println(value);
        }
    }

    private static void testMap() {
        Map<String, Integer> map = new HashMap<>();
        ConcurrentMap<String, Integer> cmap = new ConcurrentHashMap<>();
        System.out.println("abc");
    }

    private static void testBit() {
        int rbit = 127;
        int r = ~rbit;
        System.out.println(r);
        int rbit1 = 1;
        int r1 = ~rbit;
        System.out.println(r1);
        int rbit2 = 2;
        int r2 = ~rbit2;
        System.out.println(r2);
    }
}
