package blogsuanfa.list_tree;


public class NearestCommonAncestor {

	/**
	 * @param args
	 */
	
	public NodeOfTree findRecursion(NodeOfTree root,NodeOfTree n1,NodeOfTree n2){
		if(root==null||n1==null||n2==null||!contain(root,n1)&&!contain(root,n2)) 
			return null;
		
		if(contain(root.left, n1)&&contain(root.left, n2))
			return findRecursion(root.left, n1, n2);
		if(contain(root.right, n1)&&contain(root.right, n2))
			return findRecursion(root.right, n1, n2);
		
		return root;
		
	}
	
	private boolean contain(NodeOfTree root, NodeOfTree n) {
		// TODO Auto-generated method stub
		if(root==null) return false;
		if(root==n) return true;
		return contain(root.left,n)||contain(root.right,n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        
        NearestCommonAncestor n=new NearestCommonAncestor();
        
        System.out.println(n.findRecursion(a, g, i));

	}

}
