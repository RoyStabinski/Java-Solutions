public class LongestPath {
    public static int longestPath(int mat[][] , int x , int y){


        return longestPath(mat,x,y,0,0,0);
    }

    private static int longestPath(int mat[][],int x , int y,int row , int col , int cnt){
        int temp;
        if(row >= mat.length || row < 0 || col >= mat[0].length || col < 0 ||mat[row][col] != 1)
            return Integer.MIN_VALUE;


        if(row == x && col == y)
            return cnt+1;

        temp = mat[row][col];
        mat[row][col] = 0;

        int up = longestPath(mat,x,y,row+1,col,cnt+1);
        int right = longestPath(mat,x,y,row,col+1,cnt+1);
        int down = longestPath(mat,x,y,row-1,col,cnt+1);
        int left = longestPath(mat,x,y,row,col-1,cnt+1);


        mat[row][col] = temp;

        return Math.max(Math.max(left,right) , Math.max(up,down));


    }

    public static void main(String[]args){
        System.out.println(longestPath(new int[][]{{1,1,1,1,1,1,1} , {1,1,0,1,0,0,1} , {1,1,1,1,0,1,1}},2,6));
    }
}
