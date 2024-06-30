public class Palindrom {
    public static int longestPalindrome(int [] arr){

        return longestPalindrome(arr,0,arr.length-1,0);
    }

    private static int longestPalindrome(int[]arr , int i , int j , int  cnt){
        if(i >= arr.length)
            return cnt;
        if(i >= j)
            return cnt;

        return Math.max(Math.max(longestPalindrome(arr,i+1,j,0),longestPalindrome(arr,i,j-1,0)) , longestPalindrome(arr,i + 1,j-1,cnt+2));
    }

    public static void main(String[]args){
        System.out.println(longestPalindrome(new int[]{1,2,2,1}));
    }
}
