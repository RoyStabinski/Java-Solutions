public class HowManyNegative {
    public static int howManyNegativeNumbers(int[][]arr){

        int cnt = 0;
        int i = 0;
        int j = arr[0].length-1;

        if(arr[arr.length-1][arr[0].length-1] < 0)
            return arr.length * arr[0].length;

        if(arr[0][0] >= 0)
            return cnt;

        while(j > -1 && i < arr.length){
            int temp = arr[i][j];
            arr[i][j] = 0;
            if(temp < 0) {
                cnt += j + 1;
                i++;
            }else j--;
        }
        return cnt;
    }

    public static void main(String[]args){
        System.out.println(howManyNegativeNumbers(new int[][]{{-99,-72,-64,-55,-28,-10,-5},{-72,-53,-46,-38,11,13,22},{-63,-48,-27,-12,14,16,23},{-44,-29,-10,0,18,20,28},{0,12,14,20,28,30,35}}));
    }
}
