public class Arithmetic {

    public static int missingValue(int[]arr){
        int diff = 0;
        int low = 0;
        int mid;
        int high = arr.length-1;
        if(arr.length <= 2)
            return Integer.MIN_VALUE;

            if(arr[1] - arr[0] == arr[2] - arr[1])
                diff = arr[1]-arr[0];
            else if(arr[1] - arr[0] > arr[2] - arr[1]){
                diff = arr[2] - arr[1];
                return arr[1] - diff;
            }else{
                diff = arr[1] - arr[0];
                return arr[2] - diff;
            }

        while(low < high){

            mid = (low+ high)/2;

            if(arr[mid] == arr[low] + (mid-1)*diff)
                low = mid +1;
            else
                high = mid;

        }

        return arr[high] + diff;
    }

    public static void main(String[]args){
        System.out.println(missingValue(new int[]{1,2,4,5,6}));
    }
}
