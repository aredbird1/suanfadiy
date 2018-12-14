package blogsuanfa.dp;

import java.util.Arrays;
import java.util.Stack;

public class AnyNumSumIsNClassic {

	/**
	 * @param args
	 */
	Stack s=new Stack();
	public void findAny(int sum,int n){
		
		if(n<1||sum<1) return;
		if(n==sum){
			System.out.print(n+" ");
			for(int i=s.size()-1;i>=0;i--){
				System.out.print(s.get(i)+" ");
			}
			System.out.println();
			
			findAny(sum,n-1);
			
		}else{
			s.push(n);
			findAny(sum-n,n-1);
			s.pop();
			findAny(sum,n-1);
		}
	}
	
	public void findN(int sum,int n,int num){
		
		if(sum<1||n<1||num<1) return; 
		
		if(n==sum&&num==1){
			System.out.print(n+" ");
			for(int i=s.size()-1;i>=0;i--){
				System.out.print(s.get(i)+" ");
			}
			System.out.println();
//			findN(sum,n-1,num);
		}else{
			s.push(n);
			findN(sum-n,n-1,num-1);
			s.pop();
			findN(sum,n-1,num);
		}
	}
	
	public void findNFromArray(int sum,int[] arr,int endIndex,int num){
		
		if(num<1||endIndex<0) return;
		
		if(sum==arr[endIndex]&&num==1){
			System.out.print(arr[endIndex]+" ");
			for(int i=s.size()-1;i>=0;i--){
				System.out.print(s.get(i)+" ");
			}
			System.out.println();
		}else{
			s.push(arr[endIndex]);
			findNFromArray(sum-arr[endIndex], arr, endIndex-1, num-1);
			s.pop();
			findNFromArray(sum, arr, endIndex-1, num);
		}
	}
	
	public void findNDifferentFromArray(int sum,int[] arr,int endIndex,int num){
		
		if(endIndex<0||endIndex>=arr.length||num<1) return;
		
//		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++){
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		
		if(num==1&&arr[endIndex]==sum){
			System.out.print(arr[endIndex]+" ");
			for(int i=s.size()-1;i>=0;i--){
				System.out.print(s.get(i)+" ");
			}
			System.out.println();
//			findNDifferentFromArray(sum, arr, endIndex-1, num);
		}else{
			s.push(arr[endIndex]);
			if(endIndex-1>=0){
				int sum1=sum-arr[endIndex];
				int m=endIndex;
				while(m-1>=0&&arr[m-1]==arr[m]){
					m--;
				}
//				findNDifferentFromArray(sum, arr, n-1, num);
				if(m==endIndex){
					findNDifferentFromArray(sum1, arr, endIndex-1, num-1);
				}else{
					findNDifferentFromArray(sum1, arr, m-1, num-1);
				}
				
			}
			
			s.pop();
			if(endIndex>0){
				while(endIndex>0&&arr[endIndex-1]==arr[endIndex]){
					endIndex--;
				}
				if(endIndex>0)
					findNDifferentFromArray(sum, arr, endIndex-1, num);
				else{
					if(arr[endIndex]!=arr[endIndex+1])
						findNDifferentFromArray(sum, arr, endIndex, num);
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnyNumSumIsNClassic ans=new AnyNumSumIsNClassic();
//		ans.findAny(8, 12);
//		ans.findN(8, 12, 3);

//		int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13};
//		ans.findNFromArray(10, arr, arr.length-1, 3);
		
		int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,
				1,2,3,4,5,6,7,8,9,10,11,12,13,
				1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		Arrays.sort(arr);
		
//		for(int i=0;i<arr.length;i++){
//			System.out.print(arr[i]+" ");
//		}

		ans.findNDifferentFromArray(10, arr, arr.length-1, 3);
	}

}
