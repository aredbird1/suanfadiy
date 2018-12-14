package blogsuanfa.array;

public class FindMinPathSumInMatrix {

	/**
	 * @param args
	 */
	
	public static int find(int[][] arr){
		if(arr==null||arr.length==0) return Integer.MIN_VALUE;
		
		int[][] temp=arr;
		for(int i=1;i<arr[0].length;i++){
			temp[0][i]+=temp[0][i-1];
		}
		
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(j==0){
					temp[i][j]=temp[i-1][j];
				}else{
					temp[i][j]+=min(temp[i-1][j],temp[i][j-1]);
				}
			}
		}
		return temp[arr.length][arr[0].length];
	}
	
	private static int min(int i, int j) {
		// TODO Auto-generated method stub
//		if(i<=j)
//			return i;
		return i<=j?i:j;
	}
	
	public static void print(int[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
