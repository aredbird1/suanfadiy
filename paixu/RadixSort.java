package paixu;

import java.awt.List;
import java.util.ArrayList;

public class RadixSort {
	
	public static void main(String[] args) {
		int[] arr={/*1,2,3,4*/51, 977, 1, 4, 2, 6, 3, 8, 0, 7};
		RadixSort  ss=new RadixSort();
		ss.sort(arr);
		for(int a:arr){
			System.out.print(a+" ");
		}
	}
	
	public void sort(int[] arr){
		
		radixSort(arr);
	}

	private void radixSort(int[] arr) {
		// TODO Auto-generated method stub
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]>max){
				max=arr[i];
			}
		}
		
		int time=0;
		while(max>0){
			max/=10;
			time++;
		}
		
		ArrayList<ArrayList> queue=new ArrayList<ArrayList>();
		for(int i=0;i<10;i++){
			
			ArrayList<Integer> queue1=new ArrayList<Integer>();
			queue.add(queue1);
		}
		
		for(int i=0;i<time;i++){
			
			for(int j=0;j<arr.length;j++){
				
				int x=(int) (arr[j]%Math.pow(10,i+1)/Math.pow(10,i));
				
				ArrayList<Integer> queue2=queue.get(x);
				queue2.add(arr[j]);
				queue.set(x,queue2);
			}
			
			int count=0;
			for(int k=0;k<10;k++){
				
				while(queue.get(k).size()>0){
					ArrayList<Integer> queue3=queue.get(k);
					arr[count]=queue3.get(0);
					queue3.remove(0);
					count++;
				}
			}
		}
	}

}
