package blogsuanfa;

public class BeerThreeToOne {

	/**
	 * @param args
	 */
	
	public int total(int beer,int bottle ){
		if(beer<bottle){
			return beer;
		}
		
		int temp=beer;
		int count=0;
		while(/*temp/bottle+*/temp>=bottle){
			count+=temp/bottle;
			temp=temp/bottle+temp%bottle;
		}
		
		return beer+count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeerThreeToOne b=new BeerThreeToOne();
		System.out.println(b.total(19, 3));

	}

}
