import com.sun.prism.paint.LinearGradient;

import javax.net.ssl.SNIMatcher;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class CircleQueuec1213<T> {
    public T[] elem;
    public  int front;
    public  int rear;
    public  int usedSize;


     //循环队列 顺序表形式
    public  CircleQueuec1213(int k) { //构造 初始化成员变量
        k = 8;
        this.elem = (T[]) new Object[k+1];  //类型擦除为Object（底层使用时为Object，泛型在运行时没有概念） 需要强转  判断空满时 为方便判断 设定为如果只有一个空 则视为满 因此数组长度需要加一 来满足可能放下k个元素
        this.front = 0;//头
        this.rear = 0;//尾
        this.usedSize = 0; //用来记录 写入了几个元素
    }
      //添加
    public boolean enQueue(T value){
        if(isFull()){
            return false;
        }
        this.elem[this.rear]= value;
        rear = (this.rear+1)%this.elem.length;
        this.usedSize++;
        return true;
    }
    //删除
    public boolean deQueue(){
        if(isEmpty()){
            return false;
        }
        front = (front+1)%this.elem.length;
        this.usedSize--;
        return true;
    }
    //取队首元素
    public T Front(){
        if(isEmpty()){
           throw new UnsupportedOperationException("队列为空");//做题时返回负一 哦
        }
        return this.elem[this.front];
    }
    //取队尾元素
    public T Rear(){
        if(isEmpty()){
            throw new UnsupportedOperationException("队列为空");//做题时返回负一 哦
        }

        return  this.elem[this.rear==0 ? this.elem.length-1:this.rear-1];
    }


    public boolean isEmpty(){
            return  this.usedSize==0;
    }

    public boolean isFull(){
         return  (this.rear+1)%this.elem.length ==this.front;
    }

    }


