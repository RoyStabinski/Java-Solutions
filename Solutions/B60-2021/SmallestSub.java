public class SmallestSub {

    public static int smallestSub(int []a , int k ){
        int i = 0;
        int j = 0;
        int sum = 0;
        int min = a.length+1;

        while(i < a.length && j < a.length){
            if(sum < k) {
                if (min > j - i)
                    min = j - i;
                sum -= a[i];
                i++;
            }
            else{
                sum += a[j];
                j++;
            }
        }

        return min;
    }
}
