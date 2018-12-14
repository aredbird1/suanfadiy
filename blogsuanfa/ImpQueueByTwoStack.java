package blogsuanfa;

import java.util.Stack;

public class ImpQueueByTwoStack {

	/**
	 * @param args
	 */
	Stack s1=new Stack();
	Stack s2=new Stack();
//	boolean flag=false;
	int size=0;
	
	public void enqueue(int n){
		s1.push(n);
		size++;
	}
	
	public Integer dequeue(){
		if(!s2.empty()){
			size--;
			return (Integer) s2.pop();
		}
		
		while(!s1.empty()){
			s2.push(s1.pop());
		}
		
//		size--;
		
		if(size--==0){
			System.out.println("void queue");
			return null;
		}
		return (Integer) s2.pop();
		
	}
	
	public boolean empty(){
		if(size>0)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpQueueByTwoStack iq=new ImpQueueByTwoStack();
		for(int i=0;i<10;i++){
			iq.enqueue(i);
		}
//		while(!iq.empty()){
//			System.out.print(iq.dequeue()+" ");
//		}
		
		System.out.print(iq.dequeue()+" ");
		iq.enqueue(12);
		System.out.print(iq.dequeue()+" ");

	}

}
