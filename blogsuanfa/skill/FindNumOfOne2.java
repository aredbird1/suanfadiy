package blogsuanfa.skill;

public class FindNumOfOne2 {

	/**
	 * @param args
	 */
	
	public static int find(int n){
		int num=0;
		
		if(n==0) return 0;
		if(n>0&&n<10) return 1;
		
		int length=0;
		length=length(n);
		int pow=(int) Math.pow(10, length-1);
		
		int hightest=n/pow;
		int numFirst=0;
		if(hightest<2){
			numFirst=(n%pow)+1/*+find(n%pow)*/;
		}else{
			numFirst=(int) Math.pow(10, length-1)/*+find(n%pow)*/;
		}
		
		int numOhter=(int) (hightest*(length-1)*Math.pow(10, length-2));
		
		num=numFirst+numOhter+find(n%pow);
		
		return num;
		
	}
	
	private static int length(int n) {
		// TODO Auto-generated method stub
		int temp=n;
		int length=0;
		while(temp!=0){
			length++;
			temp/=10;
		}
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find(100));

	}

}
