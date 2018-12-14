package blogsuanfa.list_tree;

import java.util.ArrayList;
import java.util.List;


public class PrintTreeByLevel {

	/**
	 * @param args
	 */
	
	public static void print(NodeOfTree root){
		List list1=new ArrayList();
		List list2=new ArrayList();
		
		list1.add(root);
		while(list1.size()!=0){
			for(int i=0;i<list1.size();i++){
				NodeOfTree node=(NodeOfTree) list1.get(i);
				System.out.print(node);
				if(node.left!=null) list2.add(node.left);
				if(node.right!=null) list2.add(node.right);
			}
			System.out.println();
			list1.clear();
			List temp=list1;
			list1=list2;
			list2=temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeOfTree root=Build.buildTree();
		PrintTreeByLevel p=new PrintTreeByLevel();
		p.print(root);

	}

}
