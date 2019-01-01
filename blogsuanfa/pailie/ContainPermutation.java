package blogsuanfa.pailie;

import java.util.Arrays;

/**
 * Created by manwei on 18/12/31
 */
public class ContainPermutation {

    public static void main(String[] args) {
        String s1 = "aba";
        String s2 = "eidbaooabao";

        boolean ret = checkInclusion(s1, s2);
        System.out.println(ret);
    }

    public static boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for(char c : s1.toCharArray())
            c1[c-'a']++;

        for(int i=0;i<l2;i++)
        {
            if(i>=l1)
                --c2[s2.charAt(i-l1)-'a'];//先把坐标查过的
            c2[s2.charAt(i)-'a']++;
            if(Arrays.equals(c1, c2))
                return true;
        }
        return false;
    }
}
