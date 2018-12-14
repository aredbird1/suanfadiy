package blogsuanfa.skill;

public class NumOf1InBinary {

	/**
	 * @param args
	 */
	
	public static int find(int n){
		int flag=1;
		int count=0;
		int time=31;
		while(time>0){
			if((n&flag)!=0)
				count++;
			flag<<=1;
			time--;
		}
		return count;
	}
	
	public static int findWithSkill(int n){
		int count=0;
		
		while(n!=0){
			count++;
			n=(n-1)&n;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumOf1InBinary.findWithSkill(0));
//		System.out.println(((int)Math.pow(2, 36))/*<<1*/);

	}

}
