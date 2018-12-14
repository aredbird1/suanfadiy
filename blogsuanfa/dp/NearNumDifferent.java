package blogsuanfa.dp;

import java.util.Stack;

public class NearNumDifferent {

	/**
	 * @param args
	 */
	
	public static void ndigit(int length,int totalNum,int digit,Stack<Integer> stack){
		if(length==totalNum){
			System.out.println(stack.toString());
			return;
		}
		
//		************方法一************ ndigit(length,totalNum,i+1,stack);
		for(int i=0;i<=9;i++){
			if(i==0&&stack.size()==0) continue; //数字首位不能为0
			if(i!=digit){
				stack.push(i);
				ndigit(length+1,totalNum,i,stack);
				stack.pop();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		for(int i=1;i<=9;i++){
			Stack<Integer> stack=new Stack<Integer>();
			stack.push(i);
			ndigit(1,n,i,stack);
		}

	}

}
