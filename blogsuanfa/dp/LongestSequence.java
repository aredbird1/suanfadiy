package blogsuanfa.dp;

public class LongestSequence {

	/**
	 * @param args
	 */
	
	public static int longest(int[] arr){
		int[] temp=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			temp[i]=1;
		}
		
		for(int j=1;j<arr.length;j++){
			for(int k=0;k<=j;k++){
				if(arr[j]>arr[k]&&temp[j]<=temp[k])
					temp[j]=temp[k]+1;
			}
		}
		
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(temp[i]>temp[max]){
				max=i;
			}
		}
		return temp[max];
		
	}
	
	
	
	
	public static void main(String[] args) {

		int[] arr={5,4,8,6,9,3,14,25};
		System.out.println(longest(arr));
	}

}
