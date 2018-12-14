package blogsuanfa.string;

public class IsAnagramString {

	/**
	 * @param args
	 */
	
	public boolean judge(String s1,String s2){
		if(s1==null||s2==null||s1.length()==0||s2.length()==0||s1.length()!=s2.length())
			return false;
		
		int[] arr=new int[26];
		
		for(int i=0;i<s1.length();i++){
			arr[s1.charAt(i)-'a']++;
		}
		
		for(int i=0;i<s2.length();i++){
			arr[s2.charAt(i)-'a']--;
		}
		
		for(int i=0;i<s1.length();i++){
			if(arr[s1.charAt(i)-'a']!=0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsAnagramString i=new IsAnagramString();
		System.out.println(i.judge("abac", "cbaal"));

	}

}
