package blogsuanfa.skill;

public class Yuesefu {
	
	
	public static void numToExit(int total,int interval){
		
		boolean[] temp=new boolean[total];
		int index=0;
		int left=total;
		int count=0;
		
		for(int i=0;i<total;i++){
			temp[i]=true;
		}
		
		while(left>1){
			if(temp[index]==true){
				count++;
				if(count==interval){
					temp[index]=false;
					count=0;
					left--;
				}
			}
			index++;
			if(index==total){
				index=0;
			}
			
		}
		
		for(int j=0;j<total;j++){
			if(temp[j]==true){
				System.out.println(j);
				}
		}
		
	}
	
	public static void main(String[] args) {
		numToExit(3,3);
	}

}
