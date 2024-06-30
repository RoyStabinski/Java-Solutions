public class FindDuplicate {
    public static int findDuplicate(int []a){
        int i;
        int n = a.length;

        for(i = 0 ; i < n ; i++){
            int index = a[i] % n;
            a[index] +=n;
        }

        for(i = 0; i <a.length; i++){
            if((a[i]/n) >= 2)
                return i;
        }

        return -1;
    }

    public static void main(String[]args){
        System.out.println(findDuplicate(new int[]{1,1,1,2,2,2,2}));
    }
}
