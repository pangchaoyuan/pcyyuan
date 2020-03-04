import java.util.Arrays;
import java.util.Stack;

public class a1229TESTSORT {
    //=======================堆排序 由大到小= 建小根堆===================================
    public static void adjustDown(int[] array,int p,int len){
        int parent = p;
        int child = p*2+1;
        while(child<len){
            if(child+1<len&&array[child]>array[child+1]){
                child++;
            }
            if(array[child]<array[parent]){
                int tmp = array[child];
                array[child] = array[parent];
                array[parent]= tmp;
                parent = child ;
                child = parent*2+1;
            }else{
                break;
            }

        }
    }

    public static void creatHeap(int[] array){
        for(int i =(array.length-1-1)/2;i>=0;i--){
            adjustDown(array,i,array.length);
        }
    }

    public static void  heapSort(int[] array){
        creatHeap(array);
        int end = array.length-1;
        while(end>0){
            int tmp = array[end];
            array[end] = array[0];
            array[0] = tmp;
            adjustDown(array,0,end);
            end--;
        }
    }
//==============================希尔排序==================================================
    public static void shellSortChild(int[] array,int gap){
        if(array.length==0){
            return;
        }
        for(int i = gap ; i<array.length;i++){
            int tmp = array[i];
            int j =0;
            for( j = i - gap;j>=0;j-=gap){
                if(array[j]<tmp){
                    array[j+gap] =array[j];
                }else{
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }


    public static void shellSort(int[] array){
        int gap = array.length-1;
        while(gap>1){
            shellSortChild(array,gap);
            gap=(gap/3)+1;
        }
        shellSortChild(array,1);
    }
    //=================================选择排序====================================
    public static  void choseSort(int[] array){
        for(int i = 0; i<array.length;i++){
            for(int j =i+1; j<array.length;j++){
                if(array[j]<array[i]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    //===================================直接插入排序==============================
    public static  void insertSort(int[] array){
        for(int i =1;i<array.length;i++){
            int tmp = array[i];
            int j  =0;
            for(j =i-1 ;j>=0;j--){
                if(array[j]<tmp){
                    array[j+1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }
    //==================================冒泡排序====================================
    public static void boboSort(int[] array){
        boolean flg;
        for(int  i = 0;i<array.length-1;i++){
            flg = false;
            for(int j = 0;j< array.length-i-1;j++){
                if(array[j]<array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(!flg) break;   //设置一个boolean来观测是否发生交换，每次进循环设置成false，出来时还是false就没交换，数组已经有序
        }
    }

    //=========================快速排序===========================================
    public static void swap(int[] array,int low ,int high){
        int tmp = array[low];
        array[low] = array[high];
        array[high]= tmp;
    }

    public static int pivot2(int[] array,int i,int j){
        int low = i;
        int high = j;
        int tmp = array[i];
        while(low<high){

            while(low<high&&array[high]<=tmp){      //虽然不晓得为啥 反正要先算high 否则排序失败
            high--;
        }
            while(low<high&&array[low]>=tmp){
                low++;
            }




            swap(array,low,high);
        }
        swap(array,i,low);
        return low;
    }

    public static void quickSort(int[] array,int low,int high){
        if(!(low<high)){
            return;
        }
        int pivot = pivot2(array,low,high);
        quickSort(array,low,pivot-1);
        quickSort(array,pivot+1,high);
    }

    public static void quickSort(int[] array){
        quickSort(array,0,array.length-1);
    }
    //==================快速 排序 非递归================================d

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

    public static  void quickStackSort(int[] array){
        Stack<Integer> stack = new Stack<>();
         stack.push(array.length-1);
         stack.push(0);
        while(!stack.isEmpty()){
            int low = stack.pop();
            int high = stack.pop();

            if(low>=high){
                continue;
            }

            int pivot = pivot3(array,low,high);
            stack.push(pivot-1);
            stack.push(low);
            stack.push(high);
            stack.push(pivot+1);



        }
    }

//================================================================================
    public static void main(String[] args) {
        //int[] array={312,4,2152,5,4,6,43,77,658,67,67865};
        //System.out.println(Arrays.toString(array));
        //heapSort(array);
        //shellSort(array);
        //choseSort(array);
        //insertSort(array);
        //boboSort(array);
        //quickSort(array);
        //quickStackSort(array);
       //System.out.println(Arrays.toString(array));
        int i =7;
        System.out.println(--i);
        System.out.println(i);
    }
}
