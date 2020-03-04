import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class a1226Sort {
    //============冒泡排序========================
    /*稳定的排序
    *时间复杂度 O(n^2); 用boolean优化后最快能到O(n)
    *空间复杂度O(1);
    *
    * */
    public static void bubbleSort(int[] array){
        boolean flg ;
        for(int i = 0; i<array.length-1;i++){
            flg = false;
            for(int j = 0 ;j<array.length - i -1;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(!flg) break;
        }
    }
//========================快速排序================================
     /* 分治的思想 即分成几个区间来排序
    *
    * 时间复杂度O(n * log(n))
    *空间复杂度O(log(n))
    * 不稳定
    * 优化方式 1.设置区间阈值，小于阈值使用直接插入排序
    *          2.取区间中间下标，求出Low mid high的中位数，将中位数放在low上
    *          3.聚集相同元素法，将相同的元素放在一起作为基准，即把tmp设置为数组，在low high活动时时顺手把相同元素放到tmp的右边，
    *          并且记录数组长度以确认接下来的low 和 high的值。
    *
    * */
    public static void swap(int[] array,int low,int high){
        int tmp = array[low];
        array[low] = array[high];
        array[high] = tmp;
    }

    public static int pivot2(int[] array,int i,int j){
        int tmp = array[i];
        int low = i ;
        int high = j;
        while(low<high) {
            while (low<high&&array[high] <= tmp) {
                high--;
            }
            while (low<high&&array[low] >= tmp) { //此处加等号也是保证了在low位置上是一个tmp
                low++;
            }
            swap(array, low, high);
        }
        swap(array,i,low);
               return low;
    }


    public static void quickSort(int[] array,int low,int high){
        if(!(high>low)){
            return;
        }
        int pivot = pivot2(array,low,high);
        quickSort(array,low,pivot-1);
        quickSort(array,pivot+1,high);
    }

    public static  void aa(int[] array){
        quickSort(array,0,array.length-1);
    }
//=====================快速排序 非 递 归 ======================================
    public static int pivot3(int[] array,int i,int j){
        int low = i;
        int high = j;
        int tmp = array[i];
        while(low<high){
            while(low<high&&array[high]>=tmp){
                high--;
            }
            while(low<high&&array[low]<=tmp){
                low++;
            }
            swap(array,low,high);
        }
        swap(array,low,i);
        return low;
    }


    public static void quickSort1(int[] array){
        Stack<Integer> stack = new Stack<>();
        stack.push(array.length-1);   //必须先放右后放左
        stack.push(0);

        while(!stack.isEmpty()){
        int low = stack.pop();
        int high = stack.pop();

        if(low>=high){
            continue;  //跳出本次 再取两个   指其中大小为1的区间有序的情况下continue
        }
        int pivot = pivot3(array,low,high);
            stack.push(high);
            stack.push(pivot+1);
            stack.push(pivot-1);
            stack.push(low);
        }

    }
//=============================================================================
    public static void main(String[] args) {
        int[] array = {2345342,6,37,24,57,368,47,946,9689,9,48};
        System.out.println(Arrays.toString(array));
        //bubbleSort(array);
        quickSort1(array);
        System.out.println(Arrays.toString(array));
        int a =Integer.MIN_VALUE;
    }
}
