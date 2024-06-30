public class Search {

    public static boolean search(int[][] mat, int num) {
        int i = 0;
        int j = 0;
        int n = mat.length;

        while (n > 1) {
            if (num <= mat[(n / 2) - 1 + i][j]) {
                i = i;
                j = j;
            } else if (num <= mat[(n / 2) - 1 + i][(n / 2) + j])
                j = n / 2;
            else if (num <= mat[(n - 1) + i][(n / 2) + j]) {
                i += n / 2;
                j += n / 2;
            } else if (num <= mat[(n - 1) + i][j])
                i += n / 2;

            if (mat[i][j] == num) {
                System.out.println("Row = " + i + "Col = " + j);
                return true;
            } else n = n / 2;
        }
        return false;


    }
}
