package blogsuanfa;

import java.util.Stack;

public class ImpStackWithMin {

	/**
	 * @param args
	 */
	
	Stack s1=new Stack();
	Stack s2=new Stack();
	
	public void push(int i){
		if(i<min()){
			s2.push(i);
		}else{
			s2.push(s2.peek());
		}
		
		s1.push(i);
	}
	
	public Integer pop(){
		if(s1.size()==0){
			System.out.println("void stack");
			return null;
		} 
		s2.pop();
		return (Integer) s1.pop();
	}
	
	public Integer min() {
		// TODO Auto-generated method stub
		if(s2.size()==0) return Integer.MAX_VALUE;
		
		return (Integer) s2.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpStackWithMin is=new ImpStackWithMin();
		for(int i=0;i<10;i++){
			is.push(i);
		}
		
		for(int i=0;i<10;i++){
			System.out.println(is.pop()+" "+is.min());
		}

	}

}
