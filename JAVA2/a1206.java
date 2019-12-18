import java.util.Arrays;

public class a1206 {

    public static String reverse(String str){  //逆置一个字符串
        char[] a = str.toCharArray();
        String ret = "";
        for(int i = a.length-1;i>=0;i--){
            ret +=a[i];
        }
        return ret;
    }


    public static void main(String[] args) {
        String a1 = "abcdefg";
        String ret = reverse(a1);
        System.out.println(ret);
    }



    public static void main5(String[] args) {
        String a1 = "awrawrawg";
        //从3下标开始提取字符串  左闭右开
        System.out.println(a1.substring(4,7));
         //小写转大写
        String a2 =a1.toUpperCase();
        System.out.println(a1.toUpperCase());
        //大写转小写
        System.out.println(a2.toLowerCase());
        //拼接 相当于+
        System.out.println(a1.concat(a2));

        String a3 = "";//null
        //判断一个字符串的内容是否为空，不是null
        System.out.println(a3.isEmpty());


    }


    public static void main3(String[] args) {
        String a1 = "eqw wqeqwr q";
        String[] a2 = a1.split(" ");
        String ret ="";
        for(String a3 : a2) {    //让a3 =a2的所有元素
             ret += a3;
        }
        System.out.println(ret);
    }






    public static void main4(String[] args) {
        String a1 = "192.168.1.1";
        String[] a2 = a1.split("\\.");           //    |.  正则表达式表示一个点.
        for(int i =0;i<a1.length();i++){
            System.out.println(a2[i]);
        }
    }






    public static void main2(String[] args) {
        String a1 ="eqfwf tqqtqtqwwf ";

         //以t来分割字符串，t会消失  ，最多分割为4组，不加limit就无限组
        String[] a2=a1.split("t",4);
        System.out.println(Arrays.toString(a2));
        //将第一个改掉
        System.out.println(a1.replaceFirst("tq","ff"));
        //将所有的tq改变成，但不是改变的a1，是一个新的对象 "" 只能改成""     ''只能改成''
        System.out.println(a1.replace("tq","ds"));
        //和上边没区别
        System.out.println(a1.replaceAll("tq","ds"));

        System.out.println("===========================");
        System.out.println(a1.contains("fq"));         //a1是否包含" "的内容 返回true false
        System.out.println(a1.indexOf("fqw",1));             //从1号下标开始（包括1号）   查找子串的位置返回首个字符下标（不带数字默认从0）
        //从后往前查找
        System.out.println(a1.lastIndexOf("wf",5));
        //当前的字符串是否以xxx开头
        System.out.println(a1.startsWith("f",2));
        //当前字符串是否以xxx结尾
        System.out.println(a1.endsWith("w"));
        //将字符串首尾的空格去掉，但将中间的空格保留
        System.out.println(a1.trim());
    }



    public static void main1(String[] args) {
        String a1 = "HELLO";
        String a2 = "hello";
        System.out.println(a1.equals(a2));          //区分大小写
        System.out.println(a1.equalsIgnoreCase(a2)); //不区分大小写


        System.out.println(a1.compareTo(a2));  //小于0的结果表示a1<a2
    }
}
