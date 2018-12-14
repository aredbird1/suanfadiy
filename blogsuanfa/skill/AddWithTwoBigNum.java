package blogsuanfa.skill;

public class AddWithTwoBigNum {

	/**
	 * @param args
	 */
	
	public void add(String n1,String n2){
		char[] c1=n1.toCharArray();
		char[] c2=n2.toCharArray();
		int length=c1.length>c2.length?c1.length:c2.length;
		StringBuffer s=new StringBuffer();
		int r=0;
		for(int i=0;i<length;i++){
			int bit1=i>n1.length()-1?0:c1[c1.length-1-i]-'0';
			int bit2=i>n2.length()-1?0:c2[c2.length-1-i]-'0';
			int sum=r+bit1+bit2;
			r=sum/10;
			sum=sum%10;
			s.append(sum);
		}
		
		if(r>0){
			s.append(r);
		}
		
		System.out.println(s.reverse());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddWithTwoBigNum a=new AddWithTwoBigNum();
		a.add("123123123", "456");

	}

}
