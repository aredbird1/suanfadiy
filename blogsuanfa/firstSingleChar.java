package blogsuanfa;

public class firstSingleChar {

	/**
	 * @param args
	 */
	
	public static void find(String s){
		int[] arr=new int[255];
		for(int i=0;i<s.length();i++){
			arr[s.charAt(i)]+=1;
		}
		
		for(int i=0;i<s.length();i++){
			if(arr[s.charAt(i)]==1){
				System.out.println(s.charAt(i));
				break;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find("ssww345");

	}

}
