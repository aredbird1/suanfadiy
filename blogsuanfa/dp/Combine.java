package blogsuanfa.dp;

import java.util.LinkedList;
import java.util.List;

public class Combine {

	/**
	 * @param args
	 */
	public void find(String s){
		
		char[] arr=s.toCharArray();
		List list=new LinkedList<Character>();
		for(int i=1;i<=arr.length;i++){
			combine(arr,0,i,list);
		}
		
	}
	
	public void combine(char[] arr,int start,int num,List list){
		if(num==0){
			System.out.println(list.toString());
			return;
		}
		if(start==arr.length) return;
		
			list.add(arr[start]);
			combine(arr,start+1,num-1,list);
			list.remove(list.size()-1);
			combine(arr,start+1,num,list);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab";
		Combine c=new Combine();
		c.find(s);

	}

}
