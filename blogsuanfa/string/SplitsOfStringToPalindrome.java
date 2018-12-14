package blogsuanfa.string;

public class SplitsOfStringToPalindrome {

	/**
	 * @param args
	 * @throws Exception 
	 */
	
	public static int getNum(String s) throws Exception{
		if(s==null&&s.length()==0)
			throw new Exception("invalid string");
		
		char[] c=s.toCharArray();
		int[] temp=new int[c.length];
		
		for(int i=0;i<temp.length;i++){
			temp[i]=i;
		}
		
		for(int i=1;i<temp.length;i++){
			if(c[i]==c[0]){
				temp[i]=0;
				continue;
			}
			for(int j=0;j<=i;j++){
				if(c[i]==c[j]&&temp[i]>temp[j-1]+1){
					temp[i]=temp[j-1]+1;
				}
			}
		}
		
		return temp[temp.length-1];
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String s="123215668";
		System.out.println(SplitsOfStringToPalindrome.getNum(s));
	}

}
