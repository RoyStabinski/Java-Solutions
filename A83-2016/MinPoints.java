public class MinPoints {

    public static int minPoints(int[][] m ){

        return minPoints(m,0,0,Integer.MAX_VALUE,0,0);

    }

    private static int minPoints(int[][]m , int i , int j , int min,int temp,int before){

        if( i > m.length -1 || j > m[0].length -1)
            return Integer.MAX_VALUE; //Out Of bounds

        if(i < 0 || j < 0)
            return Integer.MAX_VALUE; //Out of bounds

        if(i == m.length -1 && j == m[0].length-1 ) { //  If we got to the last position in mat
            if (temp + m[i][j] > 0) { // if the number is positive
                return Math.abs(temp + m[i][j]) + 1; // the num +1
            }
            return min + 1;
        }

        if(temp < 0)
            min +=Math.abs(before); // if the num is negative

        int down = minPoints(m, i+1 , j , min , temp +m[i][j] , m[i][j]);
        int right = minPoints(m, i , j+1 , min , temp +m[i][j] , m[i][j]);

        return Math.min(down,right);















    }
}
