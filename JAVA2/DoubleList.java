import org.w3c.dom.ls.LSException;

import static java.lang.Thread.sleep;

class ListNode{
    public int data;
    public  ListNode prve;
    public ListNode next;
    public ListNode(int data){
        this.data=data;
        this.next=null;
        this.prve=null;
    }

}



public class DoubleList {
    ListNode head;
    ListNode last;


    public void addFirst(int data) {          //头插
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        } else {
            node.next = this.head;
            this.head.prve = node;
            this.head = node;
        }
    }


    public void addLast(int data) {            //尾插
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        } else {
            this.last.next = node;
            node.prve = this.last;
            this.last = node;
        }
    }


    public void display1() {                //正向打印
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void display2() {                    //反向打印
        ListNode cur = this.last;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.prve;
        }
        System.out.println();
    }

    public int getlength() {
        ListNode cur = this.head;
        int a = 1;
        while (cur != null) {
            cur = cur.next;
            a++;
        }
        return a;
    }

    private ListNode getLast(int a) {
        ListNode cur = this.head;
        while (a - 1 > 0) {
            a--;
            cur = cur.next;
        }
        return cur;
    }

    private ListNode getNext(int a) {
        ListNode cur = this.head;
        while (a > 0) {
            a--;
            cur = cur.next;
        }
        return cur;
    }

    //在下标为Index的位置插入数据data
    public boolean addIndex(int index, int data) {
        if (index < 0 || index > getlength() - 1) {
            return false;
        }
        ListNode cur = new ListNode(data);
        if (index == 0) {
            this.addFirst(data);
            return true;
        }
        if (index == getlength()) {
            this.addLast(data);
            return true;
        } else {
            ListNode las = getLast(index);
            ListNode nex = getNext(index);
            las.next = cur;
            cur.prve = las;
            cur.next = nex;
            nex.prve = cur;
            return true;
        }
    }


    //删除遇到的第一个关键字KEY并且返回被删除的关键字的下标
    public int remove(int key) {
        int a=0;
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {

                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prve = null;
                    break;                     //要删掉所有就是将两个break去掉
                }else{
                    cur.prve.next=cur.next;
                    if(cur.next!=null){
                        cur.next.prve=cur.prve;
                    }else {
                        this.last=cur.prve;
                    }
                    break;
                }
            }
            cur = cur.next;
            a++;
        }
        return a;


    }



    public void removeAll(int key) {
        int a=0;
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prve = null;
                }else{
                    cur.prve.next=cur.next;
                    if(cur.next!=null){
                        cur.next.prve=cur.prve;
                    }else {
                        this.last=cur.prve;
                    }
                }
            }
            cur = cur.next;
        }


    }



           //删了这个双向链表
    public void clear(){
        while(this.head !=null) {
            ListNode cur = this.head.next;
            this.head.next=null;
            this.head.prve=null;
            this.head=cur;
        }
        this.last=null;                              //jps查看java进程号  jmap命令将进程重定向到txt，查找实例对象的数目

    }


}


