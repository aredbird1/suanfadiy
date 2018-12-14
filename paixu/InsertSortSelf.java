package paixu;

public class InsertSort {
	
	public void insert(int[] arr){
		
		for(int i=1;i<arr.length;i++){
			
			for(int j=i;j>0;j--){
				
//				int insertElem=arr[i];
				if(arr[j]<arr[j-1]){
					swap(arr,j,j-1);
				}
			}
		}
	}

	private void swap(int[] arr, int j, int i) {
		// TODO Auto-generated method stub
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}
	
	public static void main(String[] args) {
		
		int[] arr={/*,2,3,4*/5, 9, 1, 4, 2, 6, 3, 8, 0, 7};
		InsertSort ss=new InsertSort();
		ss.insert(arr);
		for(int a:arr){
			System.out.print(a+" ");
		}
	}

}
