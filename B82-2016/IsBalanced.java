public class IsBalanced {

    public static boolean isBalanced(int[] vec , int k){

        return isBalanced(vec,k,0,vec.length-1);
    }

    private static boolean isBalanced(int[]vec , int k , int low , int high){
        if(k == 0)
            return true;
        if(vec.length == 0)
            return true;

        int p = Where.where(vec,low,high);
        if(p == -1)
            return false;

        return isBalanced(vec,k-1,low,p) && isBalanced(vec,k-1,p,high);

    }
}
