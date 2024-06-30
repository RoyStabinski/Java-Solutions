public class MakeSum {
    public static int makeSum(int [] lengths , int k , int num){

        return makeSum(lengths,0,k,num,0);
    }

    public static int makeSum(int []lengths , int i , int k , int num , int ways){
        if(i < 0 || i > lengths.length -1 || k < 0 || num < 0)
            return 0;

            if(k == 0)
                return ways+1;

            int op2 = makeSum(lengths,i+1,k,num,ways);
            int op3 = makeSum(lengths,i,k-lengths[i],num-1,ways);

            return op2+op3;
        }

        public static void main(String[] args){
            System.out.println(makeSum(new int[]{2,5,10,20,50} , 40,4));
        }
    }

