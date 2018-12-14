package blogsuanfa;

public class IsHuiwenOfNum {

	/**
	 * @param args
	 */
	
	public static boolean isHuiwen(int num){
//		boolean flag = false;
		
		int reverseOfNum=0;
		int yushu=0;
		int num1=num;
		while(num1>0){
			yushu=num1%10;
			reverseOfNum=reverseOfNum*10+yushu;
			num1/=10;
		}
		System.out.println(reverseOfNum);
		if(num==reverseOfNum)
			return true;
		
		return false;
		
	}
	
	public static boolean isHuiwenOfString(String s){
		if("".equals(s)) return false;
		for(int i=0;i<=s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHuiwen(1221));
		System.out.println(isHuiwenOfString(/*"1221"*/""));
		

	}

}
