package blogsuanfa.string;

public class PositionOfLack {

	/**
	 * @param args
	 */
	
	public static void find(String s1,String s2){
		int index=0;
		for(int i=0;i<s1.length();i++){
			if(index>=s2.length()){
				System.out.print(i+" ");
				continue;
			}
			if(s1.charAt(i)!=s2.charAt(index/*>=s2.length()?s2.length()-1:index*/)){
				System.out.print(i+" ");
			}else{
				index++;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcdefabbbb";
		String s2="abb";
		find(s1,s2);

	}

}
