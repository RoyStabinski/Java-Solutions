public class FindMax {
    public static int findMax(int[][] mat){

        if(mat[0][0] == -1)
            return -1;

        return findMax(mat,0,0,0);
    }

    private static int findMax(int [][] mat , int i , int j , int max){
        if(i < 0 || j < 0 || i > mat.length-1 || j > mat[0].length-1 || mat[i][j] == -1)
            return max;
        int temp = mat[i][j];
        if(i % 2 == 0)
            return Math.max(findMax(mat,i+1,j,max + temp) , findMax(mat,i,j+1,max+temp));

        else
            return Math.max(findMax(mat,i+1 , j,max+temp),findMax(mat,i,j-1,max+temp));


    }



    public static void main(String[]args){
        System.out.println(findMax(new int[][]{{1,1,-1,1,1},{1,0,0,-1,1},{1,1,1,1,-1},{-1,-1,1,1,1},{1,1,-1,-1,1}}));
    }
}
