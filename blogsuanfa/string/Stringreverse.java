package blogsuanfa.string;

public class Stringreverse {
	
	public static void reverse(String s,int index){
		if(index==0)
			System.out.println(s.substring(0,1));
		else{
			System.out.print(s.substring(index, index+1)+" ");
			reverse(s,index-1);
		}
	}
	
	public static void main(String[] args) {
		String s="abcdefg";
		reverse(s,s.length()-1);
	}

}
