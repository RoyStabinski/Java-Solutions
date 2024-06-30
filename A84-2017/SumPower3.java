public class SumPower3 {
    public static boolean sumPower3(int num){

        return sumPower3(num,0,0);
    }

    private static boolean sumPower3(int num , int i,int sum){
        if(sum == num)
            return true;

        if(Math.pow(3,i) > num)
            return false;

        return sumPower3(num , i+1 ,sum) || sumPower3(num , i+1 , (int) (sum + Math.pow(3,i)));
    }

    public static void main(String[]args){
        System.out.println(sumPower3(37));
    }
}
