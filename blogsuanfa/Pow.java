package blogsuanfa;

public class Pow {

	/**
	 * @param args
	 */
	public static double pow(double a,int b){
		double res=0;
		boolean flag=false;
		if(a==0&&b<0){
			System.out.println("输入不合法");
			return 0;
		} 
		if(b==0||a==1){
//			System.out.println(1);
			return 1;
		}
		if(a==0){
//			System.out.println(0);
			return 0;
		}
		if(b<0){
			b*=-1;
			flag=true;
		} 
		res=pow(a,b>>1)*pow(a,b>>1);
		if(b%2!=0)  res*=a;
		if(flag)  res=1/res;
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2,-3));

	}

}
