import java.util.ArrayList;
import java.util.List;

public class c1209 {


    public static void main(String[] args) {
        //顺序表默认大小为10，底层的扩容方式为1.5倍扩容
        List<String> list = new ArrayList<>();    //泛型顺序表，指定泛型类型的参数为String  向上转型
        list.add("dasd");
        list.add("fasfs");
        list.add(2,"3123");
        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list2.add("312312");
        list2.add(0,"4124");
        list.addAll(list2);
        System.out.println(list);
        String s  =list.remove(2);  //既可以用下标，也可以用对象
        System.out.println(s);
        System.out.println(list);

        list.set(2,"arawraw"); //将下标3设置为..........（修改方法  不是添加）
        System.out.println(list);
        System.out.println(list.contains("dasd"));//是否有 boolean
        System.out.println(list.indexOf("dasd"));//从前往后找，返回第一个下标
        System.out.println(list.lastIndexOf("dasd"));//从后往前找，返回找到的第一个下标（即最后一个）
        List<String> ret = list.subList(0,2); //左闭右开 截取
        System.out.println(ret);
        ret.set(0,"aa");     //指向的是同一对象，因此在截取中修改时，打印原来的对象也会改变
        System.out.println(list);
        System.out.println(ret);

    }



    public static void main2(String[] args) {
        Integer a = 150;   //如果在-128--127之间，那么直接在缓存中提取，如果在其他范围，那么每次都会new一个新对象
        Integer b = 150;
        int c =123;
        int d =123;
        System.out.println(c==d);//对比的是地址
        System.out.println(a==b);
    }




    public static void main1(String[] args) {

        //调用了Integer.valueOf()  进行装箱/包
          Integer a =  123;
          Integer b = Integer.valueOf(12312);
          System.out.println(b);
          Double c = b.doubleValue();  //自动拆包/箱          在底层调用了Integer.intValue()拆包 默认是Int
        System.out.println(c);
    }
}
