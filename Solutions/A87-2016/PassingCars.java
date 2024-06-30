public class PassingCars {

    public static int passingCars(int[]a){
        int cnt = 0;
        int pass = 0;
        int i = 0;
        int j = i+1;

        if (a.length  <= 1)
            return 0;
        if(a.length == 2 && a[0] != a[1])
            return 1;

        for(i = 0 ; i < a.length && j < a.length -1 ; i++){
            if(a[i] < a[j]) {
                cnt++;
            }
            j++;
        }

        return cnt;

    }

    public static void main(String[]args){
        System.out.println(passingCars(new int[]{0, 1, 0, 1, 1}));

}
    }
