public class LongestSubArray {

    public static int longestSubArray(int []a) {

        int i = 0;
        int j = 1;
        int cnt = 1;
        int max = 0;
        int indexStart1 = 0 ;
        int indexEnd1 = 0;



        for(i = 0 ;  i < a.length-1 ; i++) {

            if (a[i] * a[j] > 0) {
                j++;
                cnt = 1;
            } else if (a[i] * a[j] < 0) {
                cnt++;
                j++;
                max = Math.max(max, cnt);
                if (i+1 < a.length-1 && a[i + 1] * a[j] > 0) {
                    if (max == cnt) {
                        indexEnd1 = j - 1;
                        indexStart1 = indexEnd1 - max + 1;
                    }
                }
            }
        }
            System.out.println("Start " + indexStart1 + " End " +indexEnd1);
            return max;

    }

    public static void main(String []args){
        System.out.println(longestSubArray(new int[] {1,2,3,4,5,6,7}));
    }
}
