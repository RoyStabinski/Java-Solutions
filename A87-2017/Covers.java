public class Covers {
    public static boolean covers(int[][] mat , int []arr , int k){

        if(arr.length > mat.length + mat[0].length)
            return false;

        return covers(mat,arr,k,0,0,0);
    }

    private static boolean covers(int[][] mat , int []arr , int k , int i , int row , int col){
        if(row >= mat.length || col >= mat[0].length || row < 0 || col < 0 || i < 0 || i >=arr.length|| k<0)
            return false;

        if((arr[i] == mat[row][col]) && k > 0)
            return true;

        return covers(mat,arr, k-1,i+1,row+1,col+1) || covers(mat,arr, k,i+1,row,col+1) || covers(mat,arr, k-1,i+1,row,col+1) || covers(mat,arr,k,i+1,row,col);
    }

    public static void main(String[]args){
        System.out.println(covers(new int[][]{{0,1,5},{3,2,9},{1,2,3}}, new int[]{7, 2, 3},1));
    }
}
