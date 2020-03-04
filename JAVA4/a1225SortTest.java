import java.util.Arrays;

public class a1225SortTest {
    //====================堆排序============================
    public static void adjustDown(int[] array,int p ,int len){   //以p为顶点排序
        int parent = p;
        int child = p*2+1;
        while(child<len){
            if(child+1<len&&array[child]<array[child+1]){
                child++;
            }
            if(array[child]>array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = parent * 2 + 1;
            }else{
                break;
            }
        }

    }
    public static void creatHeap(int[] array){
        for( int i=(array.length-1-1)/2;i>=0;i--){
            adjustDown(array,i,array.length);
        }
    }
    public static void sortHeap(int[] array){
        creatHeap(array);//大根堆
        int end = array.length-1;
        while(end>0){
            int tmp = array[0];
            array[0] = array[end];
            array[end] = tmp;
            adjustDown(array,0,end);
            end--;
        }
    }
//==================希尔排序=============================
    public static void shellSortChild(int[] array,int gap){
        for(int i = gap; i<array.length;i++){
            int tmp = array[i];
            int j = 0 ;
            for(j = i-gap;j>=0;j-=gap){     //
                if(array[j]>tmp){
                    array[j+gap] =array[j]; //把前面的数字往后移动
                }else{
                    break;
                }
            }
            array[j+gap] =tmp; //覆盖小于tmp的后边那个数字
        }
    }

public static void shellSort(int[] array){
        int gap = array.length;
        while(gap>1){
            gap = (gap/3)+1;
            shellSortChild(array,gap);
        }
       // shellSortChild(array,gap);
}
//===================直接插入排序========================
    public static void insertSort(int[] array){
        for(int i = 1;i<array.length;i++){
            int tmp = array[i];
            int j =0;
            for( j = i-1;j>=0;j--){
                if(array[j]>tmp){
                    array[j+1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

//=======================堆排序 再 放 送================================
    public static void adjustDown1(int[] array,int p,int len){
        int parent = p;
        int child = p*2+1;
        while(child<len){
            if(child+1<len&&array[child+1]<array[child]){
                child++;
            }
            if(array[child]<array[parent]){
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = parent*2+1;
            }else{
                break;
            }
        }
    }

    public static void creatHeap1(int[] array){
        for(int i =(array.length-1-1)/2;i>=0;i--){
            adjustDown1(array,i,array.length);
        }
    }

    public static void sortHeap1(int[] array){
        creatHeap1(array);
        int end = array.length-1;
        while(end>0){
            int tmp = array[end];
            array[end] = array[0];
            array[0] = tmp;
            adjustDown1(array,0,end);
            end--;
        }

    }
//=====================希尔排序 再 放 送 ========================
 public static void shellSort1(int[] array){
        int gap = array.length;
        while(gap>1){
            shellSortChild1(array,gap);
            gap = (gap/3)+1;
        }
        shellSortChild1(array,gap);
 }

 public static  void shellSortChild1(int[] array,int gap){
        for(int i = gap;i<array.length;i++){
            int tmp = array[i];
            int j = 0;
            for (j = i-gap; j >=0 ; j-=gap) {
                if(array[j]<tmp){
                    array[j+gap] = array[j];
                }else{
                    break;
                }
            }
            array[j+gap] = tmp;
        }
 }
    //==================选择排序===========================
    public static void choseSort(int[] array){
        for(int i = 0;i<array.length;i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[j]>array[i]){         //从大到小排序
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
//====================直接插入排序========================
    public static void insertSort1(int[] array){
        for(int i =1;i<array.length;i++){
            int j = 0;
            int tmp = array[i];
            for(j = i-1;j>=0;j--){
                if(array[j]<tmp){
                    array[j+1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1] =tmp;
        }
    }

    //===================================================
    public static void main(String[] args) {
        int[] array = {312,4,12,512,512,6,3216,436,45,74,57};
        System.out.println(Arrays.toString(array));
        //sortHeap(array); // 堆 小到大
        shellSort(array);// 希尔  小到大
        //insertSort(array);// 直插  小到大
        //sortHeap1(array);  //从大到小
       //shellSort1(array);  //从大到小
       //choseSort(array);    // 直接选择排序 从大到小
        //insertSort1(array);   //从大到小
        System.out.println(Arrays.toString(array));
    }
}
