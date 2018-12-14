package blogsuanfa.list_tree;

public class Build {
	
	public static NodeOfTree buildTree(){
		NodeOfTree a = new NodeOfTree(2);  
        NodeOfTree b = new NodeOfTree(7);  
        NodeOfTree c = new NodeOfTree(5);  
        NodeOfTree d = new NodeOfTree(2);  
        NodeOfTree e = new NodeOfTree(6);  
        NodeOfTree f = new NodeOfTree(9);  
        NodeOfTree g = new NodeOfTree(5);  
        NodeOfTree h = new NodeOfTree(11);  
        NodeOfTree i = new NodeOfTree(4);  
          
        a.left = b;  
        a.right = c;  
        b.left = d;  
        b.right = e;  
        c.right = f;  
        e.left = g;  
        e.right = h;  
        f.right = i;  
        
        
        return a;
	}


	public static NodeOfList buildList(){
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
//        h.next=null;
		
		return a;
	}
}


