public class Calc {
    public static int calc(int num , int result , int maxOp) {

            return calc(num,result,maxOp,num,"" + num,0);

    }
    private static int calc(int num , int result , int maxOp,int sum,String s,int cnt){
        if(maxOp < 0)
            return -1;

        if(sum == result){
            System.out.println(s + " = " +result);
            return cnt+1;
        }

        int plus = calc(num,result,maxOp-1,sum + num,s + " + " + num,cnt);
        int minus = calc(num,result,maxOp-1,sum - num,s + " - " + num,cnt);
        int mul = calc(num,result,maxOp-1,sum * num,s + " * " + num,cnt);
        int div = calc(num,result,maxOp-1,sum / num,sum + " / " + num,cnt);

        return (plus +minus +mul +div);
    }

    public static void main(String[]args){
        System.out.println(calc(3,36,4));
    }
    }

