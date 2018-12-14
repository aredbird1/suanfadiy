package blogsuanfa;

public class MoreThanHalfOfSum {

	/**
	 * @param args
	 */
	
	public static void find(int[] arr){
		
		if(arr==null||arr.length==0){
			System.out.println("invalid  arr");
		}
		
		int count=1;
		int value=arr[0];
		for(int i=1;i<arr.length;i++){
			if(value==arr[i]){
				count++;
			}else{
				if(count==0){
					value=arr[i];
					count=1;
				}else{
					count--;
				}
			}
		}
		
		int total=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				total+=1;
			}
		}
		
		System.out.println("value is: "+value);
		
		if(2*total>arr.length)
			System.out.println(value);
		else
			System.out.println("ц╩сп");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,4,2,5,3,8,6,3,/*3,3,3,*/3,9,3,3};
		find(arr);

	}

}
