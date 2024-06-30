public class CountTriplets {

    public static int countTriplets(int[] arr , int num){


        int i;
        int counter = 0;

        for(i = 0; i < arr.length ; i++) {
            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {
                if (arr[i] + arr[j] + arr[k] <= num)
                    k--;
                else
                    counter += (k - j);
                j++;
            }
        }

        return counter;

        }





    }

