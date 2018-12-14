package blogsuanfa.skill;

public class findMaxNoCompare {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=222;
		System.out.println(a-((a-b)&((a-b)>>31)));
		System.out.println(((a+b)+Math.abs((a-b)))/2);

	}

}
