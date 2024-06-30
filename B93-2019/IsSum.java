public class IsSum {
    public static boolean isSum(int[]a,int num){

        return isSum(a,0,num,0);
    }

    public static boolean isSum(int[]a , int i ,int num,int follow){

        if(i >= a.length   || a[i] == 0 || follow >= 3)
            return false;

        int temp = a[i];
        a[i] = 0;

        if(num == 0)
            return true;

        a[i] = temp;

        return isSum(a,i+1,num - temp,follow+1) || isSum(a,i+1,num,0);
    }

    public static void main(String[]args){
        System.out.println(isSum(new int[]{5,4,2,1,3},11));
    }
}
