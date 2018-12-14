package blogsuanfa.list_tree;


public class ListReverseU {

	/**
	 * @param args
	 */
	
	public NodeOfList reverseOne(NodeOfList head){
		
		if(head==null) return null;
		
		NodeOfList previous=null;
		NodeOfList next=null;
		while(head!=null){
			next=head.next;
			if(next!=null){
				head.next=previous;
				previous=head;
				head=next;
//				next.next=previous;
			}else{
				break;
			}
		}
		head.next=previous;
		return head;
	}
	
	public NodeOfList reverseOne2(NodeOfList head){
		
		if(head==null||head.next==null) return head;
		
		NodeOfList pre=null;
		NodeOfList next=null;
		
		while(head.next!=null){
			next=head.next;
			head.next=pre;
			pre=head;
			head=next;
		}
		head.next=pre;
		return head;
	}
	
	public void print(NodeOfList head){
		if(head==null) return;
		while(head!=null){
			System.out.print(head);
			head=head.next;
		}
		System.out.println();
		
	}
	
	public NodeOfList reverseTwo(NodeOfList head){
		if(head==null||head.next==null) return head;
		
		NodeOfList headNew=head.next;
		NodeOfList previous=null;
		
		while(head!=null&&head.next!=null){
			NodeOfList next=head.next;
			NodeOfList nextnext=next.next;
			next.next=head;
			head.next=nextnext;
			if(previous!=null){
				previous.next=next;
			}
			previous=head;
			head=nextnext;
		}
		
		
		return headNew;
		
	}
	
	public NodeOfList deleteFast(NodeOfList head,NodeOfList toDelete){
		if(head==null) return null;
		if(toDelete==null) return head;
		if(toDelete==head&&head.next==null){
			return head=null;
		}
		
		if(toDelete.next!=null){
			toDelete.value=toDelete.next.value;
			toDelete.next=toDelete.next.next;
		}else{
			NodeOfList node=head;
			while(node.next!=toDelete){
				node=node.next;
			}
			node.next=null;
		}
		return head;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListReverseU sru=new ListReverseU();
//		NodeOfList head=Build.buildList();
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
        
		sru.print(a);
		
//		sru.print(sru.reverseOne2(h));
		sru.print(sru.reverseTwo(a));
//		sru.print(sru.deleteFast(head, head));
//		sru.print(sru.deleteFast(a, a));

	}

}
