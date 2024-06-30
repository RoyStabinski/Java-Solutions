public class IsIdentity {
    public static boolean isIdentity(int[][]mat,int x, int size){

        return isIdentity(mat,x,x,x,size+x);
    }

    private static boolean isIdentity(int[][]mat,int i , int j , int x , int size){

        if(i == size)
            return true;

        if(j == size)
            return isIdentity(mat,i+1,x,x,size);

        if( j == i){
            return mat[i][j] == 1 && isIdentity(mat,i,j+1,x,size);
        }else
            return mat[i][j] == 0 && isIdentity(mat,i+1,j,x,size);

    }
}
