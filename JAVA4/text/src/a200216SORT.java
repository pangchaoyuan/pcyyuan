import java.util.*;

public class a200216SORT {
    //======================归并排序 mergeSort=====递归==================================
    /* 稳定排序
    时间复杂度： n*log2n
    空间复杂度:O(n)
    * */
    private static void merge(int[] array,int low,int mid,int high){
        int s1 = low;
        int s2 = mid+1;
        int i =0;
        int[] nice = new int[high-low+1];
        //排序过程 拿两个指针遍历有序数组
        while(i<nice.length&&s1<=mid&&s2<=high){
            if(array[s1]>array[s2]){
                nice[i++] = array[s2++];
            }else{
                nice[i++] = array[s1++];
            }
        }
        while(i<nice.length&&s1<=mid) {
            nice[i++] = array[s1++];
     }
        while(i<nice.length&&s2<=high){
            nice[i++] = array[s2++];
     }
//将整个数组赋值给array的low,high区间
     for(int a : nice){
            array[low++] = a;
     }
    }


    private static void mergeSortInternal(int[] array,int low,int high){
        if(low>=high) return;

        int mid = (low+high)/2;
        mergeSortInternal(array,0,mid);
        mergeSortInternal(array,mid+1,high);

       merge(array,low,mid,high);
    }


    public static void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length-1);

    }
//=================归并排序mergeSort======非递归=======================
public static void mergeSort2(int[] array){
    for(int i = 1 ;i < array.length ; i *= 2 ) {
        for(int j =0; j<array.length;j=j+i*2){
            int low = j;
            int mid = j+i-1;
            if(mid>=array.length){
                continue;
            }
            int high = mid+i;
            if(high>=array.length){
                high = array.length-1;
            }

            merge(array,low,mid,high);
        }

    }

}





// ==================================
    //=====================================


    public static void main(String[] args) {
         int[] array ={123,421,45,2356,45,45,45,34,675,47,56,87};
         //mergeSort(array);//归并递归
        mergeSort2(array);//归并 非递归
        System.out.println(Arrays.toString(array));
    }
}
