public class StrStep {
    public static int strStep(String str1, String str2){

        if(str1.charAt(0) != str2.charAt(0))
            return -1;

        return strStep(str1,1,0,str2,1,0);
    }

    public static int strStep(String str1,int i ,int k, String str2, int j , int step) {

        if (j == str2.length())
            return step;

        if (str1.charAt(i) != str2.charAt(j))
            return strStep(str1, i + 1, k + 1, str2, j, step);

        if (str1.charAt(i) == str2.charAt(j)) {
            step = k;
            return strStep(str1, i + step, k, str2, j + 1, step);
        }

        return -1;
    }

    public static void main (String[]args){
        System.out.println(strStep("cbdadbrcfa" ,"abc"));
    }
}
