package paixu;

public class ShellSort {
	
	public void sort(int[] arr){
		
		int d=arr.length;
		int temp=0;
		while(true){
			
			d=d/2;
			for(int x=0;x<d;x++){
				
				for(int i=x+d;i<arr.length;i+=d){
					
					int j=i-d;
					temp=arr[i];
					for(;j>=0&&temp<arr[j];j-=d){
						
						arr[j+d]=arr[j];
					}
					arr[j+d]=temp;
				}
			}
			
			if(d==1){
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr={9,5,8,3,6,1,2,7};
		ShellSort is=new ShellSort();
		is.sort(arr);
		for(int a:arr){
			
			System.out.print(a+" ");
		}
		
	}
	

}





















