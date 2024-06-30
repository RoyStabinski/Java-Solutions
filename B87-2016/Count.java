public class Count {

    public static int count(int []a,int sum) {

        return count(a,a.length -1,sum,0);

    }

    private static int count(int []a , int i , int sum , int cnt){

        if(sum < 0)
            return Integer.MIN_VALUE;

        if(i <= 0)
            return cnt;

        if(sum == 0)
            cnt++;


        return count(a, i-1, sum - a[i],cnt) + count(a,i-1,sum,cnt);

    }

    public static void main(String[]args){
        System.out.println(count(new int[]{1, 2, 3, 4, 5, 6, 7},7));
    }
}
