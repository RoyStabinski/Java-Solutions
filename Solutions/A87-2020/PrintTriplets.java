public class PrintTriplets {

    public static void printTriplets(int[]a , int num) {

        int low = 0;
        int mid = 1;
        int high = a.length - 1;

        if (a.length < 3)
            System.out.println("Invalid array");

        if (num == 0)
            System.out.println("");

        while (low < high) {

            if ((a[low] * a[mid] * a[high]) == num) {
                System.out.println(a[low] + "\t" + a[mid] + "\t" + a[high]);
                low += 1;
                mid = low +1;

            } else if (a[low] * a[mid] * a[high] < num) {
                mid += 1;
            } else
                high -= 1;
        }
        System.out.println("");
    }

    public static void main(String[]args){

         printTriplets(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 40);
    }
}
