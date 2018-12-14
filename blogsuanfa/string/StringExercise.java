package blogsuanfa.string;

import java.util.Arrays;

public class StringExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcd";
		String s2="dabc";
		System.out.println(s1);
		
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		String s3=Arrays.toString(a1);
		String s4=Arrays.toString(a2);
		
		System.out.println(s3);
		System.out.println(s4);
		
		
		

	}

}
