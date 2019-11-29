import java.util.Arrays;

public class MyArrayList {

    private int[] elem;       //一个数组
    private int usedSize;    //有效数据个数
    private final int CAPACITY = 2;         //一个常量


    public MyArrayList() {
        this.elem = new int[CAPACITY];       //设置数组长度为2
        this.usedSize = 0;                  //有效数据为0                 //为顺序表的属性和方法
    }


    public void display() {            //打印顺序表
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
    }


    private boolean isFull() {
        return this.usedSize == this.elem.length;
    }


    public void add(int pos, int data) {
        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem, this.elem.length + 1);
        }

        //在pos位置插入数据data
        if (pos < 0 || pos > this.usedSize) {
            System.out.println("该位置不合法");
            return;
        }
        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    public void find(int toFind) {         //判断顺序表里有没有数字
        boolean a = true;
        for (int i = 0; i < this.usedSize; i++) {

            if (elem[i] == toFind) {
                a = true;
                break;
            }
            a = false;
        }
        System.out.println(a);
    }

    public void getpos(int toFind) {        //查找顺序表内pos位置的元素
        if (toFind > this.usedSize) {
            System.out.println("超出顺序表长度");
        } else {
            System.out.println(elem[toFind]);
        }
    }


    public void search(int toFind) {
        boolean a = true;
        int b =0;
        for (int i = 0; i < this.usedSize; i++) {
            b++;
            if (elem[i] == toFind) {
                a = true;

                break;
            } else {
                a = false;
            }
        }

            if (a == true) {
                System.out.println("下标为" + (b-1));
            } else {
                System.out.println("顺序表内没有该元素");
            }
    }
    public  void clear(){
              this.usedSize = 0;
        System.out.println("已清空");
    }









}
