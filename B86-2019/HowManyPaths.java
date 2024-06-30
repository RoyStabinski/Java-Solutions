public class HowManyPaths {
    public static int howManyPaths(int[][] mat){

        return howManyPaths(mat,0,0,0);
    }

    private static int howManyPaths(int[][] mat , int i , int j ,int paths){
        int op1 = 0 ,op2 = 0 , op3 = 0 , op4 = 0;
        if(i >= mat.length || i < 0 || j < 0 || j >=mat[0].length || mat[i][j] <= 0)
            return 0;
        if(i == mat.length -1 && j == mat[0].length-1)
            return paths+1;

        int temp = mat[i][j];
        mat[i][j] = 0;

        if(temp > 0){
             op1 = howManyPaths(mat,i + temp , j ,paths);
             op2 = howManyPaths(mat , i - temp , j , paths);
             op3 = howManyPaths(mat, i , j+temp , paths);
             op4 = howManyPaths(mat,i,j-temp,paths);
        }

        mat[i][j] = temp;

        return op1+op2+op3+op4;
    }

    public static void main(String[]args){
        System.out.println(howManyPaths(new int[][]{{0,3,1,6},{2,8,1,2},{6,2,7,5},{2,4,1,3}}));
    }
}
