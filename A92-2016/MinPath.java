public class MinPath {
    public static int minPath(char [][] minChess, int i , int j){

        return minPath(minChess,i,j,0);

    }

    private static int minPath(char [][] minChess , int i , int j ,int cnt){

        if(i >= minChess.length || j >= minChess[0].length)
            return -1;

        if(i < 0 || j < 0)
            return -1;

        if(minChess[i][j] == 'X')
            return -1;

        if(minChess[i][j] == 'K')
            return cnt;

            minChess[i][j] = 'X';
            int op1 = minPath(minChess, i - 2, j + 1, cnt + 1);
            int op2 = minPath(minChess, i - 1, j + 2, cnt + 1);
            int op3 = minPath(minChess, i - 2, j - 1, cnt + 1);
            int op4 = minPath(minChess, i - 1, j - 2, cnt + 1);
            int op5 = minPath(minChess, i + 1, j - 2, cnt + 1);
            int op6 = minPath(minChess, i + 2, j - 1, cnt + 1);
            int op7 = minPath(minChess, i + 2, j + 1, cnt + 1);
            int op8 = minPath(minChess, i + 1, j + 2, cnt + 1);
            minChess[i][j] = '0';
        return Math.min(Math.min(Math.min(op1,op2),Math.min(op3,op4)),Math.min(Math.min(op5,op6),Math.min(op7,op8)));


    }
}
