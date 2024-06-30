public class TotalWays {
    public static int totalWays(int[][] mat , int k){

        return totalWays(mat,0,0,k,0,0,0);
    }

    private static int totalWays(int[][]mat, int i , int j , int k,int paths ,int prevRow, int prevCol) {

        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || k < 0)
            return 0;


        if (prevRow != i && prevCol != j) {
            k--;
            prevRow = i;
            prevCol = j;
        }

        if (i == mat.length - 1 && j == mat[0].length - 1) {
            if (k == 0)
                return paths + 1;
            else
                return 0;
        }

        return  totalWays(mat, i + 1, j, k,paths, prevRow, prevCol) + totalWays(mat, i, j+1, k,paths, prevRow, prevCol) ;
    }

    public static void main (String[]args){
        System.out.println(totalWays(new int[3][3],1));
    }
}
