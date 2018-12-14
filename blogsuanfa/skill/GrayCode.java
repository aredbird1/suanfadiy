package blogsuanfa.skill;

public class GrayCode {

	/**
	 * @param args
	 */
	
	public String[] getGrayCode(int n){
		if(n<=0) return null;
		
		String[] g/*rayCode*/=new String[(int) Math.pow(2, n)];
		
		if(n==1){
			g[0]="0";
			g[1]="1";
			return g;
		}
		
		String[] l=getGrayCode(n-1);
		for(int i=0;i<l.length;i++){
			g[i]="0"+l[i];
			g[g.length-1-i]="1"+l[i];
		}
		
		return g;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrayCode g=new GrayCode();
		String[] s=g.getGrayCode(3);
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}

	}

}
