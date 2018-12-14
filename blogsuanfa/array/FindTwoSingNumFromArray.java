package blogsuanfa.array;

public class FindTwoSingNumFromArray {

	/**
	 * @param args
	 */
	
	public void find(int[] arr){
		if(arr==null||arr.length<2) return;
		int n1=0;
		int n2=0;
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++){
			temp^=arr[i];
		}
		
		int position=findPosition(temp);
		
		for(int i=0;i<arr.length;i++){
			if(is1OfPosition(arr[i],position)){
				n1^=arr[i];
			}else{
				n2^=arr[i];
			}
		}
		System.out.println(n1+" "+n2);
	}
	
	private boolean is1OfPosition(int i, int position) {
		// TODO Auto-generated method stub
		if(((i>>position)&1)==1)
			return true;
		
		return false;
	}

	private int findPosition(int temp) {
		// TODO Auto-generated method stub
		int position=0;
		while((temp&1)==0){
			temp>>=1;
			position++;
		}
		
		return position;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindTwoSingNumFromArray f=new FindTwoSingNumFromArray();
		int[] arr={1,1,2,2,3,3,6,8,8,7};
		f.find(arr);

	}

}
