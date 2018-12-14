package blogsuanfa.list_tree;


public class MirrorTree {

	/**
	 * @param args
	 */
	
	public static NodeOfTree mirrorRecursive(NodeOfTree root){
		if(root==null||(root.left==null&&root.right==null))
			return root;
		
		NodeOfTree temp=root.left;
		root.left=root.right;
		root.right=temp;
		
		if(root.left!=null)
			mirrorRecursive(root.left);
		if(root.right!=null)
			mirrorRecursive(root.right);
		
		return root;
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
        
       PrintTreeByLevel.print(a);
        
       NodeOfTree root=MirrorTree.mirrorRecursive(a);
       
       PrintTreeByLevel.print(root);

	}

}
