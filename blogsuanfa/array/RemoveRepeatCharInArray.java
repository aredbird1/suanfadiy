package blogsuanfa.array;

public class RemoveRepeatCharInArray {

	/**
	 * @param args
	 */
	
	public int[] remove(int[] arr){
		
		if(arr==null||arr.length==1) return arr;
		
		int index=1;
		for(int i=1;i<arr.length;i++){
			if(arr[i-1]==arr[i]){
				continue;
			}else{
				arr[index++]=arr[i];
			}
		}
		
		int[] b=new int[index];
		for(int i=0;i<b.length;i++){
			b[i]=arr[i];
		}
		
		return b;
	}
	
	public void print(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveRepeatCharInArray r=new RemoveRepeatCharInArray();
		int[] arr={0,0,1,1,2,2,3,3,5,5,6,6,8,8,8,9};
		r.print(r.remove(arr));

	}

}
