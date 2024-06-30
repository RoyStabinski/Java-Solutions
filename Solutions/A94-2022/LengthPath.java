public class LengthPath {
    public static int lengthPath(char [][] mat , String pattern){

        if(pattern.indexOf(mat[0][0]) == -1)
            return 0;

        return lengthPath(mat,pattern,0,0,0);

    }

    private static int lengthPath(char[][] mat , String pattern , int i , int j ,int max){

        char temp;

        if(i < 0 || i > mat.length-1 || j < 0 || j > mat[0].length-1 || mat[i][j] == '0' || pattern.indexOf(mat[i][j]) == -1)
            return max;

        temp = mat[i][j];
        mat[i][j] = '0';


        int maxlen =  Math.max(Math.max(lengthPath(mat,pattern,i+1,j,max+1),lengthPath(mat,pattern,i-1,j,max+1)),Math.max(lengthPath(mat,pattern,i,j-1,max+1),lengthPath(mat,pattern,i,j+1,max+1)));

        mat[i][j] = temp;

        return maxlen;
    }


    public static void main(String []args){
        System.out.println(lengthPath(new char[][]{{'c','a','b','c','@','a'},{'b','x','z','c','s','a'},{'?','c','d','*','c','d'},{'1','2','3','4','5','6'},{'1','2','3','4','5','6'}},"abc"));
    }

}
