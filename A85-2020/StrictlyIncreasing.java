public class StrictlyIncreasing {

    public static int strictlyIncreasing(int []a){
        int cnt = 0;
        int i = 0;
        int j = 1;

        if(a.length < 2)
            return 0;

        while(i < j && j < a.length) {
            if (a[i] < a[j]) {
                cnt++;
                j++;
            } else {
                j++;
                i++;
            }
        }


        return cnt;
}

    public static void main(String[]args){
    System.out.println(strictlyIncreasing(new int[]{1,2,4,4,5}));
    }
}
