package blogsuanfa.skill;

public class FindNumOfOne {

	/**
	 * @param args
	 */
	
	public static void find(int n){
		String s="";
		int num=0;
		for(int i=0;i<=n;i++){
			s+=i;
		}
		System.out.println(s);
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='1'){
				num++;
			}
		}
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find(20);

	}

}
