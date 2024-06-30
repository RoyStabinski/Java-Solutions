public class SortMod {
    public static void sortmod(int a[], int k) {
        int temp;
        int ptr = 0;
        for (int i = 0; i < k; i++) {
            for (int j = ptr; j < a.length; j++) {
                if (a[j] % k == i) {
                    temp = a[ptr];
                    a[ptr] = a[j];
                    a[j] = temp;
                    ptr++;
                }
            }
        }
    }
}
