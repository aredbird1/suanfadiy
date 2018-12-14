package blogsuanfa.list_tree;


public class IsHasLoopOfList {

	/**
	 * @param args
	 */
	
	public boolean isLoop(NodeOfList head){
		if(head==null||head.next==null) return false;
		
		NodeOfList n1=head;
		NodeOfList n2=head;
		
		while(n1.next!=null&&n2.next!=null){
			
//			if(n1.next!=null)
				n1=n1.next;
//			if(n2.next!=null){
				n2=n2.next;
				if(n2.next!=null)
					n2=n2.next;
				else
					return false;
				
				if(n1.equals(n2))
					return true;
		}
		
		return false;
	}
	
	public NodeOfList findStartOfLoop(NodeOfList head){
		NodeOfList n1=head;
		NodeOfList n2=head;
		
		while(true){
			n1=n1.next;
			n2=n2.next.next;
			if(n1==n2)
				break;
		}
		
		n1=head;
		while(!n1.equals(n2)){
			n1=n1.next;
			n2=n2.next;
		}
		return n1;
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
        i.next=e;
        
        IsHasLoopOfList ih=new IsHasLoopOfList();
        System.out.println(ih.isLoop(i));
        if(ih.isLoop(i))
        	System.out.println(ih.findStartOfLoop(a));

	}

}
