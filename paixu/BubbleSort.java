package paixu;

public class BubbleSort {
	
	public void bubble(int[] arr){
		
		int count=0;
		boolean exchange=false;
		for(int i=1;i<arr.length;i++){
			count++;
			for(int j=arr.length-1;j>=i;j--){
				
				if(arr[j]<arr[j-1]){
					swap(arr,j,j-1);
					exchange=true;
				}
			}
			if(!exchange){
				System.out.println("count="+count);
				return;
			}
				
		}
		System.out.println("count="+count);
	}

	private void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr={1,2,3,4/*7,2,4,3,5,8,9*/};
		BubbleSort bubblesort=new BubbleSort();
		bubblesort.bubble(arr);
		for(int num:arr){
			
			System.out.print(num+" ");
		}
		
	}

}
