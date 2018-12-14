package blogsuanfa.list_tree;


public class FindKthOfListFromEnd {

	/**
	 * @param args
	 */
	
	public static NodeOfList find(NodeOfList head,int n){
		if(head==null){
			System.out.println("void list");
			return null;
		} 
		
		NodeOfList ln=head;
		NodeOfList fn=head;
		
		for(int i=0;i<n-1;i++){
			if(fn.next!=null)
				fn=fn.next;
			else{
				System.out.println("list is too short");
				return null;
			}
		}
		while(fn.next!=null){
			ln=ln.next;
			fn=fn.next;
		}
		return ln;
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
		
		System.out.println(FindKthOfListFromEnd.find(a, 5));
	}

}
