package blogsuanfa.list_tree;

public class FirstCommonNode {

	/**
	 * @param args
	 */
//	public static void find(int[] a1,int[] a2){
//		int gap=a1.length-a2.length;
//	}
	
	public static void find(Node n1,Node n2){
		int l1=1;
		int l2=1;
		if(null==n1||null==n2) return;
		
		Node r1=n1.next;
		Node r2=n2.next;
		
		while(r1!=null){
			r1=r1.next;
			l1++;
		}
		
		while(r2!=null){
			r2=r2.next;
			l2++;
		}
		
		//#######æ≠µ‰”≈ªØ######
		if(r1.value!=r2.value)
			return;
		
		
		for(int i=0;i<Math.abs(l1-l2);i++){
			if(l1>l2)
				n1=n1.next;
			else
				n2=n2.next;
		}
		
		while(n1!=null&&n1.value!=n2.value){
			n1=n1.next;
			n2=n2.next;
		}
		
		System.out.println(n1.value);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Node{
	int value;
	Node next;
}