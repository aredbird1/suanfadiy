package blogsuanfa.list_tree;

public class IsPostTraversal {

	/**
	 * @param args
	 */
	
	public boolean judge(int[] arr,int left,int right){
		
//		if(left<0||right<0||left>right) return false;
		if(right-left<2) return true;
		
		int root=arr[right];
		int rightStart=left;
		for(int i=left;i<right;i++){
			if(root<arr[i]){
				rightStart=i;
				break;
			}
			
		}
		for(int i=rightStart;i<right;i++){
			if(arr[i]<root){
				return false;
			}
			
//			**************下面两行如果不被注释掉，则程序不能进入递归，提前结束，导致无递归判断出错************
//			if(i==right-1){
//				return true;
//			}
		}
		
		return judge(arr,left,rightStart-1)&&judge(arr,rightStart,right-1);
		
	}
	
	public boolean judge(int[] arr){
		
		if(arr==null||arr.length==0) return false;
		
		return judge(arr,0,arr.length-1);
		
//		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr={1, 4, 7, 6, 3, 13, 14, 2,10, 8};
//		int[] arr={1,0,4,3,2,7,/*9,*/11,9,10,8,5};
		int[] arr={11,9,10,8};
		IsPostTraversal ipt=new IsPostTraversal();
		System.out.println(ipt.judge(arr));

	}

}
