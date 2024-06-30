public class Edit {

    public static int edit(String str1 , String str2){

        if(str1.length() == 0)
            return str2.length();

        if(str2.length() == 0)
            return str1.length();

        return edit(str1,0,str2,0,0);



    }

    private static int edit(String str1,int i , String str2 , int j,int cnt){

        if(i == str1.length() && j < str2.length())
            return cnt + (str2.length() - j);

        if(j == str2.length() && 1 < str1.length())
            return cnt + (str1.length() - i);

        if(i == str1.length() && j == str2.length())
            return cnt;

        if(str1.charAt(i) ==  str2.charAt(i))
            return edit(str1,i+1,str2,j+1,cnt);
        else
            return Math.min(edit(str1,i+1,str2,j,cnt+1) , edit(str1,i,str2,j+1,cnt+1));

    }
}
