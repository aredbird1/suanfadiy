package blogsuanfa.array;

public class GenerateSpecialMatrix {

	/**
	 * @param args
	 */
	
	public static int[][] generate(int n){
		if(n<=0) return null;
		
		int[][] arr=new int[n][n];
		int startX=0;
		int startY=0;
		int endX=n-1;
		int endY=n-1;
		int value=1;
		
		while(startX<=endX){
			value=fillNum(arr,startX,startY,endX,endY,value);
			startX++;
			startY++;
			endX--;
			endY--;
		}
		
		return arr;
	}
	
	private static int fillNum(int[][] arr, int startX, int startY, int endX,
			int endY, int value) {
		// TODO Auto-generated method stub
		
		if(startX==endX){
			arr[startX][startY]=value;
			return Integer.MAX_VALUE;
		}
		
		for(int i=startY;i<=endY;i++){
			arr[startX][i]=value++;
		}
		for(int i=startX+1;i<=endX;i++){
			arr[i][endY]=value++;
		}
		for(int i=endY-1;i>=startY;i--){
			arr[endX][i]=value++;
		}
		for(int i=endX-1;i>=startX+1;i--){
			arr[i][startY]=value++;
		}
		
		return value;
	}
	
	public static void print(int[][] arr){
		if(arr==null||arr.length==0) return;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void printClockwise(int[][] arr){
		if(arr==null||arr.length==0) return;
		int startX=0;
		int startY=0;
		int endX=arr.length-1;
		int endY=arr[0].length-1;
		while(startX<=endX&&startY<=endY){
			printCircle(arr,startX,startY,endX,endY);
			startX++;
			startY++;
			endX--;
			endY--;
		}
	}

	private static void printCircle(int[][] arr, int startX, int startY,
			int endX, int endY) {
		// TODO Auto-generated method stub
		if(startX==endX){
			for(int i=startY;i<=endY;i++){
				System.out.print(arr[startX][i]+" ");
			}
			return;
		}
		
		if(startY==endY){
			for(int i=startX;i<=endX;i++){
				System.out.print(arr[i][startY]+" ");
			}
			return;
		}
		
		for(int i=startY;i<=endY;i++){
			System.out.print(arr[startX][i]+" ");
		}
		for(int i=startX+1;i<=endX;i++){
			System.out.print(arr[i][endY]+" ");
		}
		for(int i=endY-1;i>=startY;i--){
			System.out.print(arr[endX][i]+" ");
		}
		for(int i=endX-1;i>=startX+1;i--){
			System.out.print(arr[i][startY]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=generate(6);
		print(arr);
		System.out.println("*******************************");
		printClockwise(arr);
	}

}
