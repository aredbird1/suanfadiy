package blogsuanfa.list_tree;

import java.util.Stack;


public class PrintAllPathOfSumIsN {

	/**
	 * @param args
	 */
	static Stack<NodeOfTree> s=new Stack<NodeOfTree>();
	public static void printPath(NodeOfTree root,int sum){
//		int temp=sum;
		
		
		if(root.left==null&&root.right==null&&root.value==sum){
			s.push(root);
			sum-=root.value;
			printStack(s);
			System.out.println();
//			s.pop();
			sum+=((NodeOfTree)s.pop()).value;
			return;
		}
		
		if(root==null||root.value>=sum) return;
		
		s.push(root);
		sum-=root.value;
		
		if(root.left!=null)
			printPath(root.left, sum);
		if(root.right!=null)
			printPath(root.right,sum);
		
		sum+=((NodeOfTree)s.pop()).value;
		
	}
	
	private static void printStack(Stack<NodeOfTree> s) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.size();i++){
			System.out.print((NodeOfTree)s.get(i));
		}
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
        
        
        
        PrintAllPathOfSumIsN.printPath(a, 20);
        PrintAllPathOfSumIsN.printStack(s);

	}

}
