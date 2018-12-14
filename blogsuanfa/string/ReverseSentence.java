package blogsuanfa.string;

public class ReverseSentence {

	/**
	 * @param args
	 */
	
	public static void reverse(String s){
		char[] arr=s.toCharArray();;
		swap(arr,0,s.length()-1);
		int left=0;
//		int right=0;
		for(int i=1;i<arr.length;i++){
//			righ
			if(arr[i]==' '){
				swap(arr,left,i-1);
				left=i+1;
			}
		}
//		**********下面一句千万不能少***********
		swap(arr,left,arr.length-1);
		System.out.println(arr);
	}
	
	
	private static void swap(char[] arr, int i, int j) {
		// TODO Auto-generated method stub
		char temp;
		while(i<j){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		
//		for(int k=0;k<=(j-i)/2;k++,i++,j--){
//			temp=arr[i];
//			arr[i]=arr[j-k];
//			arr[j-k]=temp;
//		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse("123  mn  o");

	}

}
