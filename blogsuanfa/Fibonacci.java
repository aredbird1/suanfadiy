package blogsuanfa;

public class Fibonacci {

	/**
	 * @param args
	 */
	
	public long fn(int n){
		
		if(n<2) return n;
		
		long sum=0;
		
		long one=0;
		long two=1;
		
		for(int i=2;i<=n;i++){
			sum=one+two;
			one=two;
			two=sum;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f=new Fibonacci();
		System.out.println(f.fn(6));

	}

}
