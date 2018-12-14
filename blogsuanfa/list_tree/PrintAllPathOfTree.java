package blogsuanfa.list_tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class PrintAllPathOfTree {

	/**
	 * @param args
	 */
	Stack stack=new Stack();
	public void findPath(NodeOfTree root){
		
//		List list=new LinkedList();
		if(root==null) return;
		
		stack.push(root);
		if(root.left==null&&root.right==null){
			for(int i=0;i<stack.size();i++){
				System.out.print(stack.get(i)+" ");
			}
			System.out.println();
//			stack.pop();
		}else{
			findPath(root.left);
			findPath(root.right);
		}
		stack.pop();
	}
	
	public void inOrderTraversal(NodeOfTree root){
		if(root==null) return;
		
		inOrderTraversal(root.left);
		System.out.print(root+" ");
		inOrderTraversal(root.right);
	}
	
	public void preOrderTraversal(NodeOfTree root){
		if(root==null) return;
		
		System.out.print(root+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	public void postOrderTraversal(NodeOfTree root){
		if(root==null) return;
		
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeOfTree root=Build.buildTree();
		PrintAllPathOfTree pap=new PrintAllPathOfTree();
		
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
		
//		pap.inOrderTraversal(root);
//		pap.postOrderTraversal(root);
//		pap.preOrderTraversal(root);
		
		pap.findPath(e);

	}

}
