package blogsuanfa.list_tree;


public class IsContainSubTree {

	/**
	 * @param args
	 * @return 
	 */
	
	public boolean isContainSubTree(NodeOfTree root1,NodeOfTree root2){
		if(root1==null||root2==null) return false;
		
		if(root1.equals(root2))
			return isHaveTree(root1,root2);
//		if(root1.left.equals(root2))
//			return isContainSubTree(root1.left, root2);
//		if(root1.right.equals(root2))
		return isContainSubTree(root1.left, root2)||isContainSubTree(root1.right, root2);
	}
	
	private boolean isHaveTree(NodeOfTree root1, NodeOfTree root2) {
		// TODO Auto-generated method stub
		
//		if(root1==null||root2==null||!root1.equals(root2)) return false;
		if(root2==null) return true;
		if(root1==null||!root1.equals(root2)) return false;
		
//		if(root1.equals(root2))
		return isHaveTree(root1.left, root2.left)&&isHaveTree(root1.right, root2.right);
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
        
        IsContainSubTree is=new IsContainSubTree();
        
        System.out.println(is.isContainSubTree(e, h));

	}

}
