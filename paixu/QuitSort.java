package paixu;

public class QuitSort {
	
	public static void main(String[] args) {
		
		int[] arr={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34};
		QuitSort qs=new QuitSort();
		qs.sort(arr);
		for(int a:arr){
			System.out.print(a+" ");
		}
	}
	
	public void sort(int[] arr){
		
		quick(arr);
	}

	private void quick(int[] arr) {
		// TODO Auto-generated method stub
		if(arr.length>0){
			quickSort(arr,0,arr.length-1);
		}
	}

	private void quickSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low<high){
			
			int middle=getMiddle(arr,low,high);
			quickSort(arr,low,middle-1);
			quickSort(arr,middle+1,high);
		}
	}

	private int getMiddle(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int tmp=arr[low];
		
		while(low<high){
			
			while(low<high&&arr[high]>=tmp){
				high--;
			}
			arr[low]=arr[high];
			
			while(low<high&&arr[low]<=tmp){
				low++;
			}
			arr[high]=arr[low];
			
		}
		
		arr[low]=tmp;
		return low;
	}

}
