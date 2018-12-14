package blogsuanfa.string;

public class TransString {

	/**
	 * @param args
	 */
	public /*static*/ void trans(String sFrom,String sTo){
		
		char[] aFrom=sFrom.toCharArray();
		char[] aTo=sTo.toCharArray();
		
		int length=sFrom.length();
		int index=length-1;
		int position=-1;
		while(index>0){
			position=find(aTo[index],aFrom,index);
			
			for(int j=position;j<index;j++){
				swap(aFrom,j,j+1);
			}
			
			index--;
		}
	}
	

	private /*static*/ void swap(char[] aFrom, int i, int j) {
		// TODO Auto-generated method stub
		char temp=aFrom[i];
		aFrom[i]=aFrom[j];
		aFrom[j]=temp;
		
		for(int k=0;k<aFrom.length;k++){
			System.out.print(aFrom[k]+" ");
		}
//		for(char a:aFrom){
//			System.out.print(a+" ");
//		}
		System.out.println();
		
	}


	private static int find(char c, char[] aFrom, int index) {
		// TODO Auto-generated method stub
		int position=-1;
		for(int i=index;i>=0;i--){
			if(aFrom[i]==c){
				position=i;
				break;
			}
		}
		return position;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TransString().trans("ABCD","DBCA"); 

	}

}
