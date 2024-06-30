public class FindWord {
    public static void findWord(char [][]arr,String word){

         findWord(arr,word,0,0,0);

    }

    private static void findWord(char[][]arr ,String word, int i , int j,int strIndex){
        int [][]follow = new int[arr.length][arr.length];

        if(i >= arr.length || i < 0 || j < 0 || j >= arr.length || strIndex > word.length()-1 || arr[i][j] < 'a' || arr[i][j] > 'z')
            System.out.println("No Such Word");

        if(strIndex >= word.length())
            printArr(follow,0,0);

        char legal = arr[i][j];
        arr[i][j] = '0';

        if(legal == word.charAt(strIndex)) {
            follow[i][j] = strIndex;
            findWord(arr,word,i+1,j,strIndex+1);
            findWord(arr,word,i-1,j,strIndex+1);
            findWord(arr,word,i,j+1,strIndex+1);
            findWord(arr,word,i,j-1,strIndex+1);

        }else {
            follow[i][j] = 0;
        }

        arr[i][j] = legal;
    }

    public static void printArr(int[][]a,int i,int j){
        if(i > a.length-1 || i < 0 || j < 0 || j > a.length-1)
            System.out.println();

        if(i == a.length-1 && j == a.length-1) {
            System.out.print("\t" + a[i][j] + "}");
            return;
        }

        System.out.println( "\t" + a[i][j]);

         if (j <= a.length-1)
            printArr(a,i,j+1);

         else if(i <= a.length-1)
             printArr(a,i+1,j);
    }

    public static void main(String[]args){
        findWord(new char[][]{{'t','z','x','c','d'},{'s','h','a','z','x'},{'h','w','l','o','m'},{'o','r','n','t','n'},{'a','b','r','i','n'}},"shalom");
    }
}
