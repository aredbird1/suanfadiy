package blogsuanfa.dp;

import java.util.LinkedList;
import java.util.List;

public class AllSuccessiveSequenceOfSum {

	/**
	 * @param args
	 */
	public void findAll(int n){
		for(int i=n/2+1;i>=0;i--){
			List list=new LinkedList<Integer>(); 
			sequence(i,n,list);
		}
	}
	private void sequence(int end, int sum, List list) {
		// TODO Auto-generated method stub
		if(end<1||end>sum) return;
		if(end==sum){
			list.add(end);
			System.out.println(list.toString());
		}else{
			list.add(end);
			sequence(end-1,sum-end,list);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllSuccessiveSequenceOfSum ass=new AllSuccessiveSequenceOfSum();
		ass.findAll(50);

	}

}
