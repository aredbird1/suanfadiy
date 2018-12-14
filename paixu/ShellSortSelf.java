package paixu;

public class ShellSortSelf {
	
	public void sort(int[] arr){
		
		int d=arr.length;
		while(true){
			
			d=d/2;
			for(int x=0;x<d;x++){
				
				for(int i=x+d;i<arr.length;i+=d){
					
					for(int j=i;j>=d;j-=d){
						if(arr[j]<arr[j-d]){
							swap(arr,j,j-d);
						}
					}
				}
			}
			
			if(d<=1){
				break;
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
		
		int[] arr={/*9,5,8,3,6,1,2,71,4*/};
		ShellSortSelf is=new ShellSortSelf();
		is.sort(arr);
		for(int a:arr){
			
			System.out.print(a+" ");
		}
		System.out.print("end ");
	}
	

}





















