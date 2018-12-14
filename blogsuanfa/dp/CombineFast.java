package blogsuanfa.dp;

public class CombineFast {

	/**
	 * @param args
	 */
	
	public void find(String s){
		if(s==null||s.length()==0) return;
		
		char[] arr=s.toCharArray();
		int num=(int) Math.pow(2, s.length());
		for(int i=1;i<num;i++){
			for(int j=0;j<s.length();j++){
				if(((i>>j)&1)!=0){
					System.out.print(arr[j]);
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombineFast c=new CombineFast();
		c.find("abcd");
	}

}
