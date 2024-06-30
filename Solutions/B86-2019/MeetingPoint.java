public class MeetingPoint {
    public static int meetingPoint(int[]a , int[]b){
        int low = 0;
        int mid;
        int high = Math.min(a.length-1 , b.length-1);

        if(a.length == 0 && b.length != 0)
            return -1;
        if(b.length == 0 && a.length != 0)
            return -1;

        while( low <= high){
            mid = (low+high)/2;

            if(a[low] == b[low])
                return low;

            if(a[mid] == b[mid])
                return mid;

            else if(a[mid] > b[mid])
                low = mid+1;
            else
                high = mid;

    }

        return -1;
}

public static void main(String[]args){
    System.out.println(meetingPoint((new int[]{19,19,16,15,15,15,15,13,5}),(new int[] {0,12,13,14,14,15,15,19,25,30,35})));
    }
}
