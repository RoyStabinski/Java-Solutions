public class LongestSequence {

    public static int longestSequence(int[]a,int k){

        int i = 0;
        int j = 0;

        while(j < a.length) {
            if (a[j] == 0)
                k--;

            if (k < 0) {
                if (a[i] == 0) {
                    k++;
                }
                i++;
            }
            j++;
        }
        return j-i;


            }

            public static void main (String []args){
                System.out.println(longestSequence(new int[] {1,1,0,1,1,0,1,1,1,1,0,0} ,0));
            }
        }



