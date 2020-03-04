import java.util.*;

public class a1224Sort {

//=================堆排序==============================================  首先从最后一个子树的根开始构建大根堆
    /*堆排序的时间复杂度为  n*log2n
    *空间复杂度 O(1)
    * 建一个大小为n的堆的时间复杂度  n*log2n
    *
    * */

    public static void adjustDown(int[] array,int root,int len){  //向下调整大堆 root是根，len是最后一个数字的下标
        int parent  = root; //i的值
        int child = 2*parent + 1;

        while(child<len){
            if(child+1<len&&array[child]<array[child+1]){//让child等于左右中的最大
                child++;
            }
            if(array[child]>array[parent]){  //若child大于par 交换 数字 并且使p = child ,再使child = p*2+1,直到child大于数组长度
                int tmp = array[child];
                array[child]=array[parent];
                array[parent]=tmp;
                parent = child;
                child = parent*2+1;
            }else{
                break;
            }
        }
    }


    public static void creatHeap(int[] array ) {
        for (int i = (array.length - 1 - 1) / 2; i >= 0; i--) {
                adjustDown(array,i,array.length);
        }
    }


    public static void sortHeap(int[] array){
        creatHeap(array);
        int end =array.length-1;
        while(end>0){         //将0和最后一个交换，并且调用建大根堆方法，直到所有的数字都被交换过
            int tmp = array[end];
            array[end] = array[0];
            array[0]=tmp;
            adjustDown(array,0,end);
            end--;           //一个排完就不参与接下来的运算
        }

    }
//====================================直接插入排序===================================================
    /*时间复杂度最好为0(n)
    越有序越快
     *0(n^2) 最坏
    * 空间复杂度O(1)
    * 稳定的排序
    * */
    public static void insertSort(int[] array){    //用tmp记录第二数字，把tmp和其之前的数字一一对比
        for(int i =1;i<array.length;i++){
            int tmp = array[i];  //让tmp记录第二个数字
            int j = 0;
            for(j =i-1;j>=0;j--){   //让j  为第一个
              if(array[j]>tmp){
                  array[j+1]=array[j];   //把当前j往后挪一格
              }else{
                  break;
              }
                }
                array[j+1]=tmp;
            }
        }


    //==============================希尔排序=======================================
    /*
    * 时间复杂度O(N^1.3--1.5)
    * 空间复杂度O(1)
    * 不稳定排序
    * */
public static void shellSort(int[] array){     //用一个gap将数组分成gap个小组，把数字在小组内进行 插入排序 ，让数组变得更加有序，达到提升效率的目的
        int gap =array.length;
        while(gap>1) {
           toolShellSort(gap,array);
            gap=(gap/3)+1;
        }
    toolShellSort(1,array);
}


public static void toolShellSort(int gap,int[] array){
    for (int i = gap; i < array.length; i++) {
        int tmp = array[i];
        int j =0;
        for(j =i-gap;j>=0;j-=gap){
            if(array[j]>tmp){
                array[j+gap]=array[j];   //把当前j往后挪一格
            }else{
                break;
            }
        }
        array[j+gap]=tmp;
    }

}
//==================选择排序==================================
    /*
    * 时间复杂度O(n^2)
    * 空间复杂度O(1)
    * 不稳定排序
    * */
    public static void choseSort(int[] array){ //让i遍历，嵌套一个j遍历，遇到j<i就交换,遍历一次排列一个
    for(int i= 0;i<array.length;i++){
        for(int j =i+1;j<array.length;j++){
            if(array[j]<array[i]){
                int tmp = array[j];
                array[j] = array[i];
                array[i]=tmp;
            }
        }
    }
    }
//===============================================================
    public static void main(String[] args) {
         int[] array = {65,27,15,19,18,28,34,34,25,37};
        System.out.println(Arrays.toString(array));
        // sortHeap(array);   //堆排序
        //insertSort(array);    //直接插入排序
        //shellSort(array);      // 希尔排序
        choseSort(array);         //选择排序
        System.out.println(Arrays.toString(array));
    }

}
