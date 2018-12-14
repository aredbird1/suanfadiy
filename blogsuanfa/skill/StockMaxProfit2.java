package blogsuanfa.skill;

public class StockMaxProfit2 {

	/**
	 * @param args
	 */
	
	public static void maxProfit(int[] arr){
		int[] arr1=new int[arr.length];
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
			arr1[i]=min;
		}
		
		int maxProfit=0;
		int minIndex=0;
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(maxProfit<arr[i]-arr1[i]){
				maxProfit=arr[i]-arr1[i];
				max=i;
			}
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==arr1[max]){
				minIndex=i;
				break;
			}
		}
		
		System.out.println("maxProfit="+maxProfit);
		System.out.println("max="+max);
		System.out.println("min="+min);
		System.out.println("minIndex="+minIndex);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={3, 8, 1, 2, 19, 22, 2, 35, 231,0};
		maxProfit(arr);

	}

}
