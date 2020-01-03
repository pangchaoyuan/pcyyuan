public class test {

    public static int divide (int dividend, int divisor) {  //不用mod 乘除方法取商
        int a = 0;
        int b = 0;
        int c =dividend^divisor;

        while(a<=dividend && divisor>0 &&c>0){
            a+=divisor;
            b++;
        }
        while(a>=dividend && divisor<0 && c>0){
            a+=divisor;
            b++;
        }
        while(c<0 && dividend<0 && a>= dividend){
            a-=divisor;
            b++;
        }
        while(c<0 && divisor<0 && a<= dividend){
            a-=divisor;
            b++;
        }
        if(c>0) {
            return b - 1;
        }
        if(c<0){
            return 0-(b-1);
        }
        if(c==0){
            return 1;
        }
        return 0;
    }



    public static void main(String[] args) {
        int a = 0;
        int b = 6;
        int e = -1 ;
        int c = divide(a,b);
        System.out.println(c);
    }
}
