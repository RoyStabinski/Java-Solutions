public class Where {
    public static int where(int [] vec){

        return where(vec,1,vec.length);
    }

    static int where(int[] vec, int p, int high){

        if(vec.length == 1)
            return -1;
        if(p < 0  || p >= vec.length)
            return -1;

        int sumLeft = sum(vec,0 ,p);
        int sumRight = sum(vec , p ,high);

        if(sumLeft == sumRight)
            return p;
        else
            return where(vec,p+1,high);



    }

    private static int sum(int[] vec,int i , int j){
        if(vec.length == 0)
            return -1;

        if(vec.length == 1)
            return vec[0];

        if(i > j)
            return -1;

        return vec[i] + sum(vec , i+1 , j);

    }
}
