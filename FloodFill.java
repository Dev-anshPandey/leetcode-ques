class Pair{
    int first;
    int second;
    Pair(int frst,int scnd){
        this.first=frst;
        this.second=scnd;
    }
}

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] visited=new int[image.length][image[0].length];
        int c=image[sr][sc];
        image[sr][sc]=color;
       
        return bfs(image,visited,sr,sc,color,c);
    }

    public int[][] bfs(int[][] image,int[][] visited,int i,int j,int color,int c){
        Queue<Pair> q=new LinkedList<Pair>();
        visited[i][j]=1;
        q.add(new Pair(i,j));
        int n=image.length;
        int m=image[0].length;
        int[] delrow={-1,1,0,0};
        int[] delcol={0,0,-1,1};
        while(!q.isEmpty()){
            int row=q.peek().first;
             int col=q.peek().second;
               System.out.print(q.peek().first);
                   System.out.println(q.peek().second);  
             q.remove();
           for(int k=0;k<4;k++){
               int nrow=row+delrow[k];
               int ncol=col+delcol[k];
               if(nrow>=0 && nrow<n && ncol>=0 && ncol<m 
                   &&image[nrow][ncol]==c && visited[nrow][ncol]==0 ){
                   image[nrow][ncol]=color;
                   visited[nrow][ncol]=1;
                   q.add(new Pair(nrow,ncol));
                                  
               }

           }
        }
       return image;
    }
}