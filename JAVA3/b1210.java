import sun.security.krb5.internal.crypto.DesMacCksumType;

import java.util.ArrayList;
import java.util.*;
/////////////////////////////扑克牌部分
public class b1210 {
    public static void main(String[] args) {
       c1210card demo = new c1210card();
       List<Card> deck =  demo.buypook();
        System.out.println(deck);
        System.out.println("洗牌：");
        demo.shuffle(deck);
        System.out.println(deck);
        System.out.println("===================================");

        List<List<Card>> hands = new ArrayList<>();
        List<Card> human1 = new ArrayList<>();
        List<Card> human2 = new ArrayList<>();
        List<Card> human3 = new ArrayList<>();
        hands.add(human1);
        hands.add(human2);
        hands.add(human3);
        for(int i = 0;i<5;i++){
            for(int j=0;j<3;j++){
                hands.get(j).add(deck.remove(0)); //从最上边 0下标揭牌
            }
        }
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);//逐个打印
        System.out.println("=====================");//用foreach打印
        for(List<Card> b: hands){
            System.out.println(b);
        }

    }



////////////////////////////////////////////////////////////////////////////







    //杨辉三角
    public static List<List<Integer>> func(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows==0){
            return null;
        }
        triangle.add(new ArrayList<>());//第0行
        triangle.get(0).add(1);
        for(int i =1;i<numRows;i++){
            List<Integer> curRow = new ArrayList<>();//新建一个行
            curRow.add(1);
            //获得上一行
            List<Integer> last= triangle.get(i-1);
            //行数据
            for(int j = 1 ;j<i;j++){
                curRow.add(last.get(j)+last.get(j-1));  //一个数字等于上一行的当前列加上前一列
            }
            curRow.add(1);
            triangle.add(curRow);
        }
        return triangle;


    }

    public static void main2(String[] args) {
           List<List<Integer>> a1 = func(10);
           for(List<Integer> b: a1  ) {
               System.out.println(b);
           }
    }


    public static void main1(String[] args) {   //删掉第一个字符串里的第二个字符串的字符
        String a1 ="Welcome to bit";
        String a2 = "Wat";
        char[] a3 = a1.toCharArray();
        char[] a4= a2.toCharArray();
        List<Character> ret = new ArrayList<>();
        for(int i =0;i<a1.length();i++) {
            int b = 0;
            for (char a : a4) {
                if (a3[i] != a) {
                    b++;
                }
            }
            if (b == a4.length) {
                ret.add(a3[i]);
            }
        }
        System.out.println(ret);


    }
}
