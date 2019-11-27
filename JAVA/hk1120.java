import java.util.Arrays;
import java.util.Scanner;



/*   二分法查找数组里的数字 递归
public class hk1120 {

    public static int fun(int[] a, int left, int key, int right) {
        int mid = (right + left) >> 1;
        if (left > right) {
            return -1;
        }
        if (key == a[mid]) {
            return mid;
        } else if (key < a[mid]) {
          return  fun(a,  left,  key,mid -1);
        } else {
           return fun(a, mid + 1, key, right);
        }
    }


    public static void main(String[] args) {
        int[] a = {12,22,23,25,26,21};
        int b=fun(  a, 0, 1, a.length);
        System.out.println(b);

    }
    }







/*
public class hk1120{

    public static  void fun(int[] a){              //将一个数组的奇数放到前边 偶数放到后边
        int i =0;
        int j =a.length-1;
        while(i<j){
            while(a[i]%2==1&&i<a.length-1){
                i++;
            }
            while(a[j]%2==0&&j>0){
                j--;
            }
            while(i<j) {
                a[i] = a[j] ^ a[i];
                a[j] = a[j] ^ a[i];
                a[i] = a[j] ^ a[i];
                break;
            }


            }
        }

    public static void main(String[] args) {
        int[] a={2,2,2,2,2,2,2,2,1,14,15,17,18};
        fun(a);
        System.out.println(Arrays.toString(a));
    }
}



/*
public class hk1120{

    public  static int[] reverse(int[] a){            //不影响原数组的反向输出
        int[] c=new int[a.length];
        for(int i=0;i<=a.length-1;i++){
            c[i]=a[a.length-1-i];
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a={1,2,4,5,6,7,8,9};
        int[] c=reverse(a);
        System.out.println(Arrays.toString(c));

    }
}
*/