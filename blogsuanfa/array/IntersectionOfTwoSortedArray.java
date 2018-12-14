package blogsuanfa.array;

import java.util.LinkedList;
import java.util.List;

public class IntersectionOfTwoSortedArray {

	/**
	 * @param args
	 */
	
	public void find(int[] a,int[] b){
		if(a==null||b==null||a.length==0||b.length==0) return;
		
		List list=new LinkedList();
		int pa=0;
		int pb=0;
		while(pa<a.length&&pb<b.length){
			if(a[pa]<b[pb]) pa++;
			else if(a[pa]>b[pb]) pb++;
			else{
				list.add(a[pa]);
				pa++;
				pb++;
			}
		}
		/*int length=a.length>b.length?a.length:b.length;
		for(int i=0;i<length;i++){
			if(a[pa]==b[pb]){
				list.add(a[pa]);
				pa++;
				pb++;
			}else{
				int c=a.length>b.length?pa++:pb++;
			}
		}*/
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,5,6,6,8,8};
		int[] b={1,4,5,6,/*6,8,*/8};
		
		IntersectionOfTwoSortedArray i=new IntersectionOfTwoSortedArray();
		i.find(a, b);

	}

}
