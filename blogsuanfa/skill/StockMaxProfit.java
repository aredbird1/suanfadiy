package blogsuanfa.skill;

public class StockMaxProfit {

	/**
	 * @param args
	 */
	public static void maxProfit(int[] arr){
		if(arr==null||arr.length<2)
			System.out.println("invalid input");
		
		int min=0;
		int max=1;
		int maxProfit=0;
		int minIndex=0;
		for(int i=1;i<arr.length;i++){
			if(maxProfit<arr[i]-arr[min]){
				maxProfit=arr[i]-arr[min];
				max=i;
				minIndex=min;
			}
			if(arr[i]<arr[min]){
				min=i;
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
