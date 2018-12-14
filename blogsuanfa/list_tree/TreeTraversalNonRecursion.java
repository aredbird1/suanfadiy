package blogsuanfa.list_tree;

import java.util.Stack;


public class TreeTraversalNonRecursion {

	/**
	 * @param args
	 */
	
	public void preOrder(NodeOfTree root){
		if(root==null) return;
		
		Stack s=new Stack();
		s.push(root);
		while(!s.empty()){
			root=(NodeOfTree) s.pop();
			System.out.print(root);
			if(root.right!=null) 
				s.push(root.right);
			if(root.left!=null) 
				s.push(root.left);
		}
	}
	
	public void inOrder(NodeOfTree root){
		if(root==null) return;
		
		Stack s=new Stack();
		while(!s.empty()||root!=null){
			if(root!=null){
				s.push(root);
				root=root.left;
			}else{
				root=(NodeOfTree) s.pop();
				System.out.print(root);
				root=root.right;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeOfTree root=Build.buildTree();
		TreeTraversalNonRecursion t=new TreeTraversalNonRecursion();
		
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
		
//		t.preOrder(e);
		t.inOrder(e);

	}

}
