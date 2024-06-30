public class PrintExpr {
    public static int printExpr(int[]arr,int num){

        return printExpr(arr,0,num,"");
    }

    private static int printExpr(int[]arr, int i ,int num, String s){
        if( i == arr.length) {
            if (num == 0) {
                System.out.println(s);
                return 1;
            } else
                return 0;
        }

            return printExpr(arr,i+1,num,s) + printExpr(arr,i+1,num + arr[i],s+"-"+arr[i]) + printExpr(arr,i+1,num-arr[i],s+"+"+arr[i]);

        }

        public static void main(String[]args){
        printExpr(new int[]{1,3,2,6},4);
        }
    }

