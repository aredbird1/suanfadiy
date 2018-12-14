package blogsuanfa.array;

public class FindMaxOfSpecialArray {

	/**
	 * @param args
	 */
	
	public int find(int[] arr){
		int left=0;
		int right=arr.length;
		int mid=(right-left)/2+left;
		int max=0;
		
		while(mid>0&&mid<arr.length){
			if(arr[mid]>=arr[mid-1]&&arr[mid]>=arr[mid+1]){
				max=mid;
				break;
			}else if(arr[mid]<arr[mid+1]){
				left=mid+1;
				mid=(right-left)/2+left;
			}else{
				right=mid-1;
				mid=(right-left)/2+left;
			}
		}
		return arr[max];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,5,6,7,7,5,3,2,1};
		FindMaxOfSpecialArray f=new FindMaxOfSpecialArray();
		System.out.println(f.find(arr));

	}

}
