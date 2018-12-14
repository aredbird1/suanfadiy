package paixu;

public class MergingSort {
	
	public static void main(String[] args) {
		int[] arr={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34};
		MergingSort ms=new MergingSort();
		ms.sort(arr);
		for(int a:arr){
			System.out.print(a+" ");
		}
	}
	
	public void sort(int[] arr){
		
		mergingSort(arr,0,arr.length-1);
	}

	private void mergingSort(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		if(left<right){
			
			int center=(left+right)/2;
			
			mergingSort(arr,left,center);
			mergingSort(arr,center+1,right);
			
			merge(arr,left,center,right);
		}
	}

	private void merge(int[] arr, int left, int center, int right) {
		// TODO Auto-generated method stub
		int[] tempArr=new int[arr.length];
		int mid=center+1;
		int third=left;//中间数组
		int tmp=left;
		
		while(left<=center&&mid<=right){
			
			if(arr[left]<=arr[mid]){
				tempArr[third++]=arr[left++];
			}else{
				tempArr[third++]=arr[mid++];
			}
		}
		
		while(left<=center){
			tempArr[third++]=arr[left++];
		}
		
		while(mid<=right){
			tempArr[third++]=arr[mid++];
		}
		
		while(tmp<=right){
			arr[tmp]=tempArr[tmp++];
		}
		
	}

}
