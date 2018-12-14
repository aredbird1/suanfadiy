package blogsuanfa;

import java.util.LinkedList;
import java.util.List;

public class ImpStackByTwoQueue {

	/**
	 * @param args
	 */
	
	LinkedList q1=new LinkedList();
	LinkedList q2=new LinkedList();
	
	public void push(int i){
		if(q1.size()==0&&q2.size()==0){
			q1.addLast(i);
		}else if(q1.size()!=0){
			q1.addLast(i);
		}else{
			q2.addLast(i);
		}
	}
	
	public Integer pop(){
		if(q1.size()==0&&q2.size()==0){
			System.out.println("void stack");
			return null;
		}
		
		Integer res=null;
		
		if(q1.size()==0){
			while(q2.size()!=0){
				res=(Integer) q2.removeFirst();
				if(q2.size()!=0){
					q1.addLast(res);
				}
			}
		}else if(q2.size()==0){
			while(q1.size()!=0){
				res=(Integer) q1.removeFirst();
				if(q1.size()!=0){
					q2.addLast(res);
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpStackByTwoQueue stack=new ImpStackByTwoQueue();  
        int tmp=0;  
        stack.push(1);  
        stack.push(2);  
        stack.push(3);  
        tmp=stack.pop();  
        System.out.println(tmp);//3  
        stack.push(4);  
        tmp=stack.pop();  
        System.out.println(tmp);//4  
        tmp=stack.pop();  
        System.out.println(tmp);//2  
        stack.push(5);  
        stack.push(6);  
        tmp=stack.pop();  
        System.out.println(tmp);//6  
        tmp=stack.pop();  
        System.out.println(tmp);//5  
        tmp=stack.pop();  
        System.out.println(tmp);//1  

	}

}
