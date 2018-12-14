package paixu;

public class SelectSort {
	
	public void select(int[] arr){
		
		for(int i=0;i<arr.length-1 ;i++){
			
			int minIndex=i;
			for(int j=i+1;j<arr.length ;j++){
				
				if(arr[j]<arr[minIndex]){
					minIndex=j;
				}
			}
			if(minIndex!=i){
				swap(arr,i,minIndex);
			}
		}
	}

	private void swap(int[] arr, int i, int minIndex) {
		// TODO Auto-generated method stub
		int tmp=arr[i];
		arr[i]=arr[minIndex];
		arr[minIndex]=tmp;
	}
	
	public static void main(String[] args) {
		
		int[] arr={5, 9, 1, 4, 2, 6, 3, 8, 0, 7};
//		for(int a:arr){
//			System.out.print(a+" ");
//		}
		SelectSort ss=new SelectSort();
		ss.select(arr);
		for(int a:arr){
			System.out.print(a+" ");
		}
	}

}
