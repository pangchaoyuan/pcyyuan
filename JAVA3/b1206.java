
//String StringBuilder 线程不安全    StringBuffer 线程安全   StringBuffer StringBuilder 的构造方法相同 ，且在拼接时，底层都不会新建对象  //return this;
// String和上述不能自动转换  需要用   append一个空对象或者StringBuiler(string str)来转换，toString 转换为String;    StringBuffer a ="";  a.toString();

public class b1206 {

    public static void main(String[] args) {
        StringBuilder a1 = new StringBuilder("fwaraw");
        a1.append("r32twet41etq");//在原来的对象上进行修改
        System.out.println(a1);
    }




    public static void main2(String[] args) {
        String a1 = "dsad";
        a1 =a1+"vhrth"; //String的拼接在底层会自动优化为Stringbuilder
        System.out.println(a1);
    }



     //将字符串左边的size个字符放到右边
    public static String  move(String str,int size ){
        char[] a = str.toCharArray();
        String b = "";         //StringBuilder b = "";           //必须优化为StringBuilder  和append方法 减少创建对象的个数，因为String会在底层优化为StringBuilder
        for(int i = size;i<a.length;i++){
            b+=a[i];                //  b.append（a[i]）;
        }
        for(int i =0;i<size;i++){
            b+=a[i];
        }
        return  b;
    }


    public static void main1(String[] args) {
        String a= "abcdffaw123";
        String c = move(a,8);
        System.out.println(c);
    }
}
