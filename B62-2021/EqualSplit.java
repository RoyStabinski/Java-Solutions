public class EqualSplit {

    public static boolean equalSplit(int []arr){

        return equalSplit(arr,0,0,0,0,0);
    }

    private static boolean equalSplit(int []arr , int i ,int sum1,int sum2,int cnt1,int cnt2){
        if(i == arr.length)
            return sum1 == sum2 && cnt1 == cnt2;

        return equalSplit(arr,i+1,sum1+arr[i],sum2,cnt1+1,cnt2) || equalSplit(arr,i+1,sum1,sum2+arr[i],cnt1,cnt2+1);

    }

    public static void main(String[]args){
        System.out.println(equalSplit(new int[] {-3,5,-12,14,-9,13}));
    }
}
