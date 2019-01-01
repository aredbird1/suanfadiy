package blogsuanfa.dp;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by manwei on 19/1/1
 */
public class CircleNum {

    public static void main(String[] args) {
        int[][] m = initMatrix();
        int ret = findCircleNumBfs(m);
        System.out.println(ret);
    }

    private static int[][] initMatrix(){
        int[][] m = new int[4][5];
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                if((i<=1 && j<=1) || (i>=3 && j>=3)){
                    m[i][j] = 1;
                }
            }
        }
        return m;
    }

    public static int findCircleNumBfs(int[][] M) {
        boolean [] visited = new boolean[M.length];
        int res = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0;i<M.length;i++){
            if(!visited[i]){
                queue = new LinkedList<Integer>();
                queue.add(i);
                BFS(M,queue,visited);
                res++;
            }
        }
        return res;
    }
    public static void BFS(int[][] M, Queue<Integer> q, boolean[] visited){
        while(!q.isEmpty()){
            int a = q.poll();
            for(int i=0;i<M.length;i++){
                if(i!=a && M[a][i]==1 && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
