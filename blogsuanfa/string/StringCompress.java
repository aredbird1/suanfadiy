package blogsuanfa.string;

import java.util.Arrays;

public class StringCompress {

	/**
	 * @param args
	 */
	
	public String compress(String s){
		if(s==null||s.length()==0) return null;
		
		StringBuilder sb=new StringBuilder();
		if(s.length()==1){
			return sb.append(s.charAt(0)).append(1).toString();
			
		}
		
		int count=1;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i-1)==s.charAt(i)){
				count++;
				continue;
			} 
			else{
				sb.append(s.charAt(i-1)).append(count);
				count=1;
			}
		}
		
		sb.append(s.charAt(s.length()-1)).append(count);
		
		return sb.toString();
	}
	
	public String compressNotInOrder(String s){
		if(s==null||s.length()==0) return null;
		
		StringBuilder sb=new StringBuilder();
		if(s.length()==1){
			return sb.append(s.charAt(0)).append(1).toString();
			
		}
		
		char[] arr=s.toCharArray();
		Arrays.sort(arr);
		System.out.println(arr);
		
		int count=1;
		for(int i=1;i<s.length();i++){
			if(arr[i-1]==arr[i]){
				count++;
				continue;
			} 
			else{
				sb.append(arr[i-1]).append(count);
				count=1;
			}
		}
		
		sb.append(arr[arr.length-1]).append(count);
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompress sc=new StringCompress();
		
//		System.out.println(sc.compress("aaabcccddzs"));
		System.out.println(sc.compress("a"));
		System.out.println(sc.compressNotInOrder("acddzaabccszsdzsd"));

	}

}
