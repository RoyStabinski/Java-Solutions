public class CheapRT {
    public static int cheapRt(int[] stations,int step1,int step2,int limit){

        return cheapRt(stations,0,step1,step2,limit,0,"");
    }

    private static int cheapRt(int[] stations,int i , int step1,int step2,int limit,int price,String s){
        if(i > stations.length-1 || limit < 0) {
            return Integer.MAX_VALUE;
        }

        if(i == stations.length -1) {
            System.out.println(s + i + "\t=" + (price + stations[stations.length-1]));
            return price + stations[i];
        }

        return Math.min(cheapRt(stations,i+step1,step1,step2,limit,price+stations[i],s + i + "\t"),cheapRt(stations,i+step2,step1,step2,limit-1,price + stations[i],s + i + "\t"));

    }

    public static void main(String[]args){
        System.out.println(cheapRt(new int[]{2,4,8,3,10,1,12,3,2} , 3,2,4));
    }
}
