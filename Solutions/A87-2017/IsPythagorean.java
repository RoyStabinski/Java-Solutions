public class IsPythagorean {
    public static boolean isPythagorean(int[] arr){
        int i , j;
        int k ;


        if(arr.length < 3)
            return false;

        for(i = 0; i < arr.length -2  ; i++ ){
            k = arr.length-1;
            for(j = i+1; j < arr.length -1   ; j++){
                if(Math.pow((arr[i]),2) + Math.pow((arr[j]),2) == Math.pow(arr[k],2))
                    return true;
                else if (Math.pow((arr[i]),2) + Math.pow((arr[j]),2) < Math.pow(arr[k],2))
                    k--;
                }
            }

        return false;
        }

        public static void main(String[]args){
        System.out.println(isPythagorean(new int[]{1,3,4,5,6}));
        }
    }


