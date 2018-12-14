package blogsuanfa.skill;

public class AddWithoutArithmetic {

	/**
	 * @param args
	 */
	
	public int addSelf(int n1,int n2){
		if(n2==0) return n1;
		
		int sum=n1^n2;
		int carry=(n1&n2)<<1;
		
		return addSelf(sum, carry);
		
//		while(n2!=0){
//			int sum=n1^n2;
//			int carry=(n1&n2)<<1;
//		}
//		return n1;
	}
	
	public int addSelf2(int n1,int n2){
		if(n2==0) return n1;
		
		while(n2!=0){
			int sum=n1^n2;
			int carry=(n1&n2)<<1;
			n1=sum;
			n2=carry;
		}
		return n1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddWithoutArithmetic a=new AddWithoutArithmetic();
		System.out.println(a.addSelf2(2, 66));

	}

}
