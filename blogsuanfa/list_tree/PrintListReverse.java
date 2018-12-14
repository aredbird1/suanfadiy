package blogsuanfa.list_tree;

import java.util.Stack;


public class PrintListReverse {

	/**
	 * @param args
	 */
	
	public void printRecursion(NodeOfList head){
		if(head==null) return;
		
		if(head.next!=null)
			printRecursion(head.next);
		System.out.print(head);
	}
	
	public void printWithStack(NodeOfList head){
//		if(head==null) return;
		if(head==null||head.next==null){
			System.out.println("only one: "+head);
			return;
		}
		
		Stack s=new Stack();
		NodeOfList temp=head;
		while(temp!=null){
			s.push(temp);
			temp=temp.next;
		}
		while(s.size()!=0){
			System.out.print(s.pop());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeOfList a = new NodeOfList(0);  
        NodeOfList b = new NodeOfList(1);  
        NodeOfList c = new NodeOfList(2);  
        NodeOfList d = new NodeOfList(3);  
        NodeOfList e = new NodeOfList(4);  
        NodeOfList f = new NodeOfList(5);  
        NodeOfList g = new NodeOfList(6);  
        NodeOfList h = new NodeOfList(7);  
        NodeOfList i = new NodeOfList(8); 
        
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        i.next=null;

        PrintListReverse pl=new PrintListReverse();
//        pl.printRecursion(null);
        pl.printWithStack(null);
        
	}

}
