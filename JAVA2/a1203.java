import java.util.Arrays;
import java.util.Scanner;

public class a1203{

    public static String func(String str) {
        String[] strs = str.split(" "); //无冗余的拼接字符串，即把所有空格去掉
        String ret ="";
        for(String str1 :strs){
            ret+=str1;
        }
        return ret;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String ret= func(str);
        System.out.println(ret);
    }






    public static boolean fun(String str) {
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)<'0'||str.charAt(i)>'9'){      //得到字符串中的第i个字符
                return  false;
            }
        }
        return true;

    }



    public static void main3(String[] args) {
        String str = "1a23456";
        char[] a = str.toCharArray();   //把字符串拆成字符
        System.out.println(Arrays.toString(a));
        boolean b = fun(str);
        System.out.println(b);
    }

}