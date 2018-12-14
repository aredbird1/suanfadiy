package blogsuanfa.string;

public class IsContainString {

	/**
	 * @param args
	 */
	
	public static boolean isContain(String s1,String s2){
		if("".equals(s1)||"".equals(s2)) return false;
		
		int[] arr=new int[26];
		for(int i=0;i<s1.length();i++){
			arr[s1.charAt(i)-'A']+=1;
		}
		for(int j=0;j<s2.length();j++){
			arr[s2.charAt(j)-'A']-=1;
		}
		for(int i=0;i<26;i++){
			if(arr[i]<0)
				return false;
		}
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isContain("ASS","ASL"));

	}

}
