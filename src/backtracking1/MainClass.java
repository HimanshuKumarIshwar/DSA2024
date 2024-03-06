package backtracking1;

public class MainClass {
    public static void main(String[] args) {
        int mat[][] = {{1,1,1,0},
                      {1,0,0,1},
                      {1,1,0,0},
                       {1,1,1,1}
        };

        int n = mat.length;
        int m = mat[0].length;

        boolean visit[][] = new boolean[n][m];
        visit[0][0] = true;
   ratInMaze(mat, 0,0, visit, "", n, m);


    }



    static void ratInMaze(int [][] mat, int i, int j, boolean visit[][], String path, int n, int m ){
               if(i == n-1 && j == m-1){
                   System.out.println(path);
                   return;
               }


               if(isValid(mat, i+1, j, visit, n, m)){  //D
                   visit[i+1][j] = true;
                   ratInMaze(mat, i+1, j, visit, path+'D', n, m);
                   visit[i+1][j] = false;
               }


        if(isValid(mat, i, j-1, visit, n, m)){  //L
            visit[i][j-1] = true;
            ratInMaze(mat, i, j-1, visit, path+'L', n, m);
            visit[i][j-1] = false;
        }


        if(isValid(mat, i, j+1, visit, n, m)){  //R
            visit[i][j+1] = true;
            ratInMaze(mat, i, j+1, visit, path+'R', n, m);
            visit[i][j+1] = false;
        }

        if(isValid(mat, i-1, j, visit, n, m)){  //U
            visit[i-1][j] = true;
            ratInMaze(mat, i-11, j, visit, path+'U', n, m);
            visit[i-1][j] = false;
        }


    }


    static boolean isValid(int [][] mat, int i, int j, boolean visit[][], int n, int m ){
        return i < n && i>=0 &&  j < m && j>=0 && mat[i][j] == 1 && !visit[i][j];
    }
}
