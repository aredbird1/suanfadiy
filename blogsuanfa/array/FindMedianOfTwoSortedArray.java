package blogsuanfa.array;

public class FindMedianOfTwoSortedArray {

	/**
	 * @param args
	 */
	public float find(int[] a,int[] b){
		
		if(a==null&&b==null||(a.length+b.length)==0){
			return Integer.MIN_VALUE;
		}
		int pa=0;
		int pb=0;
		float media=0;
		while(pa+pb<(a.length+b.length+1)/2){
			int Ai=pa>a.length-1?Integer.MAX_VALUE:a[pa];
			int Bj=pb>b.length-1?Integer.MAX_VALUE:b[pb];
			if(Ai>=Bj){
				media=b[pb];
				pb++;
			}else{
				media=a[pa];
				pa++;
			}
		}
		if((a.length+b.length)%2==1){
			return media;
		}else{
			int Ai=pa>a.length-1?Integer.MAX_VALUE:a[pa];
			int Bj=pb>b.length-1?Integer.MAX_VALUE:b[pb];
			int media2=Ai<Bj?Ai:Bj;
			return (media+media2)/2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={/*1,2,3,4,5,6,7,8,9,10,11,12,13*/};
		int[] b={/*1,2,3,4,5,6,7,8*/};
		FindMedianOfTwoSortedArray f=new FindMedianOfTwoSortedArray();
		System.out.println(f.find(a, b));

	}

}
