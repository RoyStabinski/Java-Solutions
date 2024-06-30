public class MaxPath {
    public static int maxPath(int[][]mat){

        return maxPath(mat,0,0,0);
    }

    private static int maxPath(int[][]mat,int i , int j , int sum){
        if(i > mat.length-1 ||j > mat[0].length-1)
            return Integer.MIN_VALUE;

        if(i == mat.length-1 && j == mat[0].length-1)
            return sum + mat[i][j];

        return Math.max(maxPath(mat,i+mat[i][j]/10,j+mat[i][j]%10,mat[i][j]+sum),maxPath(mat,i+mat[i][j]%10,j+mat[i][j]/10,mat[i][j]+sum));
    }

    public static void main(String[]args){
        System.out.println(maxPath(new int[][]{{12,22,23,54,11},{43,35,21,20,30},{34,23,43,22,30},{25,31,2,20,34},{10,22,10,11,10},{40,13,3,1,23}}));
    }
}
