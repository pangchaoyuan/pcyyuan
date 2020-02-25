import java.util.Arrays;
import java.util.Objects;

public class A21 {
    static class Node {
        private int key;
        private int value;
        private Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] array = new Node[7];//存放单链表的头结点
    private int size;//当前数据的个数


    public int getValue(int key) {

        int index = key % array.length;
        //遍历array[index]下标的链表，找到值为key的数据，并且返回
        Node cur = array[index];
        while(cur.next!=null&&cur.key!=key){
            cur = cur.next;
        }
        return cur.key==key?cur.value:-1;
    }


    public void put(int key,int value){
        int index = key % array.length;
        for(Node cur = array[index];cur!=null;cur =cur.next ){
            if(cur.key==key){
                cur.value = value;
                return;
            }
        }

        Node node  = new Node(key,value);
        node.next = array[index];
        array[index] = node;
        size++;

       //设置负载因子为0.75
        if(loadFactor()>0.75){
            resize();
        }
    }

    private double loadFactor(){   //获取当前负载因子
        return this.size*1.00/array.length;
    }

    private void resize(){
        Node[] newArray = new Node[array.length*2];
        for(int i = 0 ;i<array.length;i++){
            Node curNext = null;
            for(Node cur =  array[i];cur!=null;cur = curNext){
                        curNext = cur.next;
                        int index = cur.key%newArray.length;
                        cur.next = newArray[index];
                        newArray[index] = cur;
            }
        }
        array = newArray;
    }





    public static void main(String[] args) {
        A21 array = new A21();
        array.put(1,1);
        array.put(3,21);
        array.put(2,23);
        array.put(4,43);
        array.put(8,63);
        System.out.println();

    }
    }
