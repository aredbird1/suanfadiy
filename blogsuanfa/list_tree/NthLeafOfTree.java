package blogsuanfa.list_tree;


public class NthLeafOfTree {

	/**
	 * @param args
	 */
	int count=0;
	public void find(NodeOfTree root,int n){
		if(root==null) return;
		
		
		if(root.left==null&&root.right==null){
			count++;
			if(count==n){
				System.out.println(root);
			}
		}else{
			find(root.left,n);
			find(root.right,n);
		}
	}
	
	public void findNthBiggest(NodeOfTree root,int n){
		if(root==null) return;
		
		findNthBiggest(root.right, n);
		count++;
		if(count==n){
			System.out.println(root);
		}
		findNthBiggest(root.left, n);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeOfTree root=Build.buildTree();
		
		NthLeafOfTree n=new NthLeafOfTree();
//		n.find(root, 3);
		n.findNthBiggest(root, 5);

	}

}
