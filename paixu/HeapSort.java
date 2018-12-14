package paixu;

public class HeapSort {
	
	public static void main(String[] args) {
		int[] arr={/*1,2,3,4*/5, 9, 1, 4, 2, 6, 3, 8, 0, 7};
		HeapSort ss=new HeapSort();
		ss.sort(arr);
		for(int a:arr){
			System.out.print(a+" ");
		}
	}
	
	public void sort(int[] arr ){
		heapSort(arr);
	}

	private void heapSort(int[] arr) {
		// TODO Auto-generated method stub
		int arrayLength=arr.length;
		
		for(int i=0;i<arrayLength-1;i++){
			
			buildMaxHeap(arr,arrayLength-1-i);
			swap(arr,0,arrayLength-1-i);
		}
	}

	private void buildMaxHeap(int[] arr, int lastIndex) {
		// TODO Auto-generated method stub
		for(int i=(lastIndex-1)/2;i>=0;i--){
			
			int k=i;
			while(k*2+1<=lastIndex){
				
				int biggerIndex=2*k+1;
				if(biggerIndex<lastIndex){
					if(arr[biggerIndex]<arr[biggerIndex+1]){
						biggerIndex++;
					}
				}
				
				if(arr[k]<arr[biggerIndex]){
					swap(arr,k,biggerIndex);
					k=biggerIndex;
				}else{
					break;
				}
			}
		}
	}

	private void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}

}
 