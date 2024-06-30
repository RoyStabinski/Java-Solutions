public class FindTriplet {

    public static int findTriplet(int[]arr){
        int n = arr.length-1;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int maxAll;
        int i;
        int temp;

        for(i = 0; i < n ; i++){
            max1 = Math.max(max1,arr[i]);
            if(max1 == arr[i]) {
                temp = arr[n - 1];
                arr[n - 1] = max1;
                arr[i] = temp;
            }
            min1 = Math.min(min1,arr[i]);
            if(min1 == arr[i]){
                temp = arr[0];
                arr[0] = min1;
                arr[i] = temp;
            }
        }

        for(i = 1; i < n-1 ; i++){
            max2 = Math.max(max2,arr[i]);
            if(max2 == arr[i]) {
                temp = arr[n - 2];
                arr[n - 2] = max2;
                arr[i] = temp;
            }
            min2 = Math.min(min2,arr[i]);
            if(min2 == arr[i]){
                temp = arr[1];
                arr[1] = min2;
                arr[i] = temp;
            }
        }

        for(i = 2; i < n-2 ; i++){
            max3 = Math.max(max3,arr[i]);
            if(max3 == arr[i]) {
                temp = arr[n - 3];
                arr[n - 3] = max2;
                arr[i] = temp;
            }
        }

        maxAll = Math.max(Math.max(max1,max2),max3);
        int op1 = max1*max2*max3;
        int op2 = min1*min2*maxAll;

        if(op1 > op2){
            System.out.println(max1 + "\t" + max2 + "\t" + max3);
            System.out.print(max1+" * " +max2 + " * " +max3 +" = ");return op1;
        }

        else{
            System.out.println(min1 + "\t" + min2 + "\t" + maxAll);
            System.out.print(min1+ " * " +min2 + " * " +maxAll + " = ");return op2;
        }
}

public static void main(String[]args){
    System.out.println(findTriplet(new int[]{-4,1,-8,9,6}));
    }
}
