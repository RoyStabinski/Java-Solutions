public class FindSmallest {

    public static int findSmallest(int[]arr){
        int sum =1;
        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] > sum)
                return sum;
            else
                sum+=arr[i];
        }
        return sum;
    }
}
