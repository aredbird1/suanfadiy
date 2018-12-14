package blogsuanfa.list_tree;


public class WidthOfTree {

	/**
	 * @param args
	 */
	
	public int widthRecursion(NodeOfTree root){
		if(root==null) return 0;
		int lHight=high(root.left);
		int rHight=high(root.right);
		
		int lWidth=widthRecursion(root.left);
		int rWidth=widthRecursion(root.right);
		
		return max(1+lHight+rHight,max(lWidth,rWidth));
	}
	
	private int high(NodeOfTree root) {
		// TODO Auto-generated method stub
		if(root==null) return 0;
		
		return 1+max(high(root.left),high(root.right));
	}

	private int max(int n1, int n2) {
		// TODO Auto-generated method stub
		if(n1>=n2) return n1;
		return n2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeOfTree root=Build.buildTree();
		
		WidthOfTree w=new WidthOfTree();
		
		System.out.println(w.widthRecursion(root));

	}

}
