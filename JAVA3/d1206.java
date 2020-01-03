import java.util.*;

public class d1206 {

    public static String func3(String str){            //把i am student 整成 student am i
        String a =str.trim();
        String[] a1= a.split(" ");
        StringBuilder a2 =new StringBuilder();
        for(int i = 0;i<a1.length;i++){
            a2.append(a1[a1.length-1-i]+" ");
        }
        return  a2.toString().trim();
    }










    public static String func2(String a){         //字符串压缩方法，aabbccc=> a1b2c3;
        char[] a1= a.toCharArray();
        int i =0;
        StringBuilder a2 = new StringBuilder();
        while(i<a1.length) {
            int j = 1;
            a2.append(a1[i]);
            while(i<a1.length-1&&a1[i]==a1[i+1]){
                i++;
                j++;
            }
            a2.append(j);
            i++;
        }
        return a2.toString();
    }




    public static int[] func1(int[]a,int[]b){          //将两个有序数组合并成一个有序数组
        int[] c =new int[a.length+b.length];
        int k = 0;
        int i = 0;
        int j = 0;
        while(i<a.length&&j<b.length){
            c[k]=a[i]>b[j]?a[i]:b[j];     //若是从小到大排列，将大于号改小于号，
            if(c[k]==a[i]){
                i++;                       //i改成j
            }else{
                j++;                  //j改成i   或者判断出数组顺序 复制粘贴
            }
            k++;
        }

            while(k<(a.length+b.length)&&i==a.length){
                c[k]=b[j];
                k++;
                j++;
            }
            while(k<(a.length+b.length)&&j==b.length){
            c[k]=a[i];
            k++;
            i++;
        }
        return c;
    }


    public static void main(String[] args) {
        int[] array1 = {8,4,2};
        int[] array2 = {7,5,3};
        int[] a=func1(array1,array2);
        for(int b: a){
            System.out.print(b+"  ");
        }
        String a4 ="abbcccddddabbbvv";
         String a3=func2(a4);
        System.out.println(a3);
        String a5=" i am student";
        String a6 = func3(a5);
        System.out.println(a6);
    }
}
