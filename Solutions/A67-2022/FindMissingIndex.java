public class FindMissingIndex {
    public static int findMissingIndex(int []a){
        int diff;
        int low = 0;
        int mid;
        int high = a.length-1;
        int distanceTotal = 0;

        if(a.length < 3)
            return a.length;

        if(Math.abs(a[1] - a[0]) == Math.abs(a[2] - a[1]))
            diff = Math.abs(a[1] - a[0]);

        else diff = Math.min(Math.abs(a[1] - a[0]), Math.abs(a[2] - a[1]));

        while(low < high)
        {
            mid = (low+high)/2;
            distanceTotal = (mid * diff)+a[0];

            if(distanceTotal != a[mid] && distanceTotal - diff ==a[mid-1])
                return mid;

            if(distanceTotal == a[mid]) {
                low = mid + 1;
                if (low == high) {
                    return low;
                }
            }else high = mid-1;
            }
        return a.length;

        }

    }

