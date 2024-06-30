public class Split4 {
    public static boolean split3(int[] arr){


        return split3(arr,0,0,0,0);

    }

    private static boolean split3(int[]arr,int i,int sum1,int sum2,int sum3){

        if(i == arr.length) {
            if (sum1 == sum2 && sum2 == sum3)
                return true;
        }

        if(i > arr.length-1)
            return false;



        return split3(arr,i+1,sum1+arr[i],sum2,sum3) || split3(arr,i+1,sum1,sum2+arr[i],sum3) || split3(arr,i+1,sum1,sum2,sum3+arr[i]);
    }

    public static void main(String[]args){
        System.out.println(split3(new int[]{8,4,7,1,2,3,5}));
    }
}
