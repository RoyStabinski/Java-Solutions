public class IsJump {
    public static boolean isJump(String str1,String str2,int step){

        return isJump(str1,0,str2,0,step);
    }

    private static boolean isJump(String str1,int i , String str2,int j , int step){

        if(j == str2.length())
            return true;

        if(str1.charAt(i) == str2.charAt(j))
            return true;

        return isJump(str1,i + step, str2, j+1,step);
    }

    public static void main(String[]args){
        System.out.println(isJump("adbrcfa" , "abc" , 2));
    }
}
