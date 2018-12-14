package paixu;

public class InsertSort2 {
	
	public void sort(int[] arr){
		
		int temp=0;
		for(int i=1;i<arr.length;i++){
			
			int j=i-1;
			temp=arr[i];
			for(;j>=0&&temp<arr[j];j--){
				
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr={9,5,8,3,6,1,2,7};
		InsertSort2 is=new InsertSort2();
		is.sort(arr);
		for(int a:arr){
			
			System.out.print(a+" ");
		}
	}
	

}








































