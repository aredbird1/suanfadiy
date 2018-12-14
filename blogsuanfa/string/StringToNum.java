package blogsuanfa.string;

public class StringToNum {

	/**
	 * @param args
	 */
	
	public static void change(String s){
		int num=0;
		boolean nagetive=false;
		if("".equals(s)){
			System.out.println("not a num");
			return;
		} 
		for(int i=0;i<s.length();i++){
			if(i==0&&(s.charAt(i)=='+'||s.charAt(i)=='-')){
				if(s.charAt(i)=='-'){
					nagetive=true;
				}
			}else if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
				num=num*10+s.charAt(i)-'0';
				if(num>Integer.MAX_VALUE){
					System.out.println("too big");
					return;
				}
			}else{
				System.out.println("not a num");
				return;
			}
		}
		if(nagetive)
			num*=-1;
		System.out.println(num);
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		change("-123");

	}

}
