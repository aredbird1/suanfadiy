package blogsuanfa.array;

public class FindSpecialNumFromArr {

	/**
	 * @param args
	 */
	public static void find(int[] arr){
		
		if(arr==null||arr.length<3){
			System.out.println("invalid arr");
			return;
		}
		
		int[] temp=new int[arr.length];
		int minRight=arr[arr.length-1];
		for(int i=arr.length-1;i>=0;i--){
			if(minRight>arr[i])
				minRight=arr[i];
			temp[i]=minRight;
		}
		
		int maxLeft=arr[0];
		for(int i=0;i<arr.length;i++){
			if(maxLeft<arr[i]){
				maxLeft=arr[i];
				if(maxLeft==temp[i]&&i!=0&&i!=arr.length-1)
					System.out.println(arr[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={7, 10, 2, 6, 19, 22, 32, 36, 52};
		find(arr);

	}

}
