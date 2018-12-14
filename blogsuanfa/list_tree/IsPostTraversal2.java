package blogsuanfa.list_tree;

public class IsPostTraversal2 {

	/**
	 * @param args
	 */
	
	public boolean judge(int[] arr,int left,int right){
		if(right-left<2) return true;
		
		int rightStart=findTurning(arr,left,right);
		if(!check(arr,rightStart,right)){
			return false;
		}
		
		return judge(arr,left,rightStart-1)&&judge(arr,rightStart,right-1);
	}
	
	private boolean check(int[] arr, int rightStart, int right) {
		// TODO Auto-generated method stub
		for(int i=rightStart;i<right;i++){
			if(arr[i]<arr[right])
				return false;
		}
		return true;
	}

	private int findTurning(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		int tp=-1;
		for(int i=left;i<right;i++){
			if(arr[i]>arr[right]){
				tp=i;
				break;
			}
		}
			
		return tp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr={1, 4, 7, 6, 3, 13, 14, /*2,*/10, 8};
		int[] arr={1,0,4,3,2,7,11,9,10,8,5};
		IsPostTraversal2 ipt=new IsPostTraversal2();
		System.out.println(ipt.judge(arr));

	}

	private boolean judge(int[] arr) {
		// TODO Auto-generated method stub
		if(arr==null||arr.length==0)
			return false;
		return judge(arr,0,arr.length-1);
	}

}
