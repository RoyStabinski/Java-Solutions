public class MinDiff {

    public static int minDiff(int[]a){

        if(a.length == 1)
            return Math.abs(a[0]);

        if(a.length == 0)
            return Integer.MIN_VALUE; //Default

        if(a.length == 2)
            return Math.abs(a[1] - a[0]);

        return minDiff(a,0,0,0);
    }

    private static int minDiff(int[]a , int i,int groupA , int groupB) {

        if (i >= a.length)
            return Math.abs(groupA - groupB);

        else {
            int group1 = minDiff(a, i + 1, groupA + a[i], groupB);
            int group2 = minDiff(a, i + 1, groupA, groupB + a[i]);

            return Math.min(group1, group2);
        }
    }
    }
