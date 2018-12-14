package blogsuanfa.skill;

public class OnlyUseAdd {

	/**
	 * @param args
	 */
	
	public int negative(int num){
		
		int var=num>0?-1:1;
		int temp=0;
		for(int i=0;i<Math.abs(num);i++){
			temp+=var;
		}
		
//		System.out.println(temp);
		
		return temp;
		
	}
	
	public int add(int a,int b){
		return a+b;
	}
	
	public int subtract(int a,int b){
		return a+negative(b);
	}
	
	public int multiply(int a,int b){
		
		boolean flag=isPositive(a,b);
		
		int res=0;
		
		for(int i=0;i<Math.abs(b);i++){
			res+=a;
		}
		if(!flag) return negative(res);
			
		return res;
		
	}
	
	private boolean isPositive(int a, int b) {
		// TODO Auto-generated method stub
		if(a>0&&b>0||a<0&&b<0) return true;
		
		return false;
	}
	
	public int divide(int a,int b) throws Exception{
		
		if(b==0) throw new Exception("除数不能为0");
//		if(a==0) return 0;
		int temp=Math.abs(b);
		int res=0;
		while(temp<=Math.abs(a)){
			res++;
			temp+=Math.abs(b);
		}
		if(!isPositive(a, b)) return negative(res);
		return res;
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OnlyUseAdd oua=new OnlyUseAdd();
		System.out.println(oua.subtract(3, -9));
		System.out.println(oua.multiply(3, 0));
		System.out.println(oua.divide(120, -6));

	}

}
