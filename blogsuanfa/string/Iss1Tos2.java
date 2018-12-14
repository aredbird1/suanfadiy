package blogsuanfa.string;

public class Iss1Tos2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcdef";
		String s2="fabd";
		if(s1.concat(s1).indexOf(s2)!=-1)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
