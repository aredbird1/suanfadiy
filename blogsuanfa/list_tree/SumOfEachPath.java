package blogsuanfa.list_tree;

import java.util.Stack;
import blogsuanfa.list_tree.*;

public class SumOfEachPath {

	/**
	 * @param args
	 */
	
	Stack<NodeOfTree> stack=new Stack<NodeOfTree>();
	int sum=0;
	int numOfPath=0;
	
	public void sumOfPath(NodeOfTree root){
		if(root==null) return;
		
		if(root.left==null&&root.right==null){
			stack.push(root);
			sum+=root.value;
			print(stack);
			System.out.println("the sum of path "+ ++numOfPath +" is: "+sum);
			sum-=stack.pop().value;
			return;
		}
		
		stack.push(root);
		sum+=root.value;
		
		if(root.left!=null)
			sumOfPath(root.left);
		if(root.right!=null)
			sumOfPath(root.right);
		
		sum-=stack.pop().value;
		
	}
	
	private void print(Stack<NodeOfTree> stack) {
		// TODO Auto-generated method stub
		for(int i=0;i<stack.size();i++){
			System.out.print(stack.get(i));
		}
		System.out.println();
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
        
        SumOfEachPath sop=new SumOfEachPath();
        sop.sumOfPath(a);

	}

}
