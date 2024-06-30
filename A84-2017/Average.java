public class Average {

    public static int average(int[] arr){

        int left = 0;
        int right = 0;

        for(int i = 0 ; i < arr.length ; i++){
            right += arr[i];
        }

        int index = 0;
        double diff = 0;

        for(int i = 0 ; i < arr.length ; i++){
            right -= arr[i];
            left += arr[i];


            int a = (right / arr.length - 1 - i) - (left / (i + 1));
            if(diff < Math.abs(a))
                diff = Math.abs(a);

            index = i;


        }

        return index;
    }
}
