package blogsuanfa.array;

public class NumOfGroupInMatrix {

	/**
	 * @param args
	 */
	
	public Integer getNumOfGroup(int[][] input){
		if(input==null) return null;
		
		int count=0;
		boolean[][] visited=new boolean[input.length][input[0].length];
		
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input[0].length;j++){
				if(visited[i][j]==false&&input[i][j]==1){
					count++;
					traverse(input,visited,i,j);
				}
			}
		}
		return count;
	}
	
	private void traverse(int[][] input, boolean[][] visited, int i, int j) {
		// TODO Auto-generated method stub
		visited[i][j]=true;
		
		if(i-1>=0&&visited[i-1][j]==false&&input[i-1][j]==1)
			traverse(input,visited,i-1,j);
		
		if(j-1>=0&&visited[i][j-1]==false&&input[i][j-1]==1)
			traverse(input,visited,i,j-1);
		
		if(i+1<input.length&&visited[i+1][j]==false&&input[i+1][j]==1)
			traverse(input,visited,i+1,j);
		
		if(j+1<input[0].length&&visited[i][j+1]==false&&input[i][j+1]==1)
			traverse(input,visited,i,j+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] input = {{1, 1, 0, 0, 1}, 
						 {0, 0,0 , 1, 0}, 
						 {1, 1, 0, 1, 0}, 
						 {0, 0, 1, 0, 0}};  
        System.out.println(new NumOfGroupInMatrix().getNumOfGroup(input));  

	}

}
