package paixu;

public class BinSearch {
	
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8,9,10,11,12};
		BinSearch is=new BinSearch();
		int index=is.binSearch(arr,81);
		System.out.println("目标在数组第"+index+"个位置");
		
	}
	
	public int binSearch(int[] arr,int target){
		
		int low=0;
		int high=arr.length-1;
		int mid=(high+low)/2;
		
		while(low<=high&&arr[mid]!=target){
			
			if(target>arr[mid]){
				low=mid+1;
			}else{
				high=mid-1;
			}
			
			mid=(low+high)/2;
			
		}
		if(low>high){
			return -1;
		}
		
		return mid+1;
		
	}

}
