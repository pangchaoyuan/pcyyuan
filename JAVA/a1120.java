import java.util.Arrays;


/*
public class a1120{

    public static void main(String[] args) {
           int[] a ={1,2,3,4,5};
           //int[] b =new int[a.length];
           //b=Arrays.copyOf(a,a.length);          复制数组  使用Arrays.copyof时不用重新定义数组  底层调用的是System.arraycopy
           //int[] b=a.clone();                    复制数组     定义数组 = 原数组名.clone()
           //System.arraycopy(a,0,b,0,a.length);   复制数组   System.arraycopy(原数组，0，目标数组，0，原数组长度)
        System.out.println(Arrays.toString(b));
    }
}



/*
public class a1120{          //字符串 + 。。。=字符串
    public static String toString(int[] array) {
        String arr="[";
        for(int i=0;i<array.length;i++){
            arr+=array[i];
            if(i!=array.length-1){
                arr+=",";
            }

        }
        arr+="]";
        return arr;
    }


    public static void main(String[] args) {
             int[] array = {1,2,3,4,5,6};
             System.out.println(toString(array));
    }
}




/*
public class a1120 {                    //不改变原数组    返回数组


    public static int[] tansform(int[] array){
        int[] a=new int[array.length];
        for (int i = 0;i<array.length;i++) {
            a[i] = 2*array[i];
        }
        return a;
    }



    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int[] a= tansform(array);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(array));
    }
}
*/