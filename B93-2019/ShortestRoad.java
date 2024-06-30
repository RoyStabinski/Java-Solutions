public class ShortestRoad {

    public static int shortestRoad(int[]road1,int[]road2){
        int sum1 = 0 , sum2 = 0;
        int min1,min2;

        for(int i = 0 ; i < road1.length; i++)
            sum1 += road1[i];

        for(int i = 0; i < road2.length;i++)
            sum2 += road2[i];

        min1 = sum1;
        min2 = sum2;

        int start1 = road1[0];
        int start2 = road2[0];

        for(int i = 1 ; i < road1.length ; i++){
            if(min1 > (sum2 - start2) + start1)
                min1 = sum2 - start2 + start1;

        }


return 1;
    }
}
