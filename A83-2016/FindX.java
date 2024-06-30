public class FindX {

    public boolean findX(int[]a,int x) {

        int low = 0;
        int mid;
        int high = a.length - 1;

        if (a.length <= 1)
            return false;

        while (low < high) { //Binary Search
            mid = (low + high) / 2;

            if (a[mid] + a[mid + 1] == x)
                return true;
            else if (a[mid] + a[mid + 1] > x)
                high = mid;
            else
                low = mid + 1;
        }

        return false;
    }




    }

