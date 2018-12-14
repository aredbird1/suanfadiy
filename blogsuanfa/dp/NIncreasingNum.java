package blogsuanfa.dp;

import java.util.Stack;

public class NIncreasingNum {

	/**
	 * @param args
	 */
	
	public static void nIncrease(int length,int totalNum,int digit,Stack<Integer> stack){
		
		if(length==totalNum){
			System.out.println(stack.toString());
			return;
		}
		if(digit>9) return;
		
		stack.push(digit);
		nIncrease(length+1,totalNum,digit+1,stack);
		stack.pop();
		
		nIncrease(length,totalNum,digit+1,stack);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<Integer>();
		int n=2;
		nIncrease(0, n, 1, stack);

	}

}
