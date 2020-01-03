



//单链表队列 入队列 和出队列时间复杂度均为O(1).
public class ListStackb1213<T> {
    static class Node<T>{
        public T data;
        public Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    public Node front; //头
    public Node rear;  //尾
    public int usedSize = 0 ;

    public boolean isEmpty(){
        if(this.usedSize==0){
            return true;
        };
        return false;
    }



    public void offer(T data){  //入队 尾插
        Node node =new Node(data);
        if(isEmpty()){
            this.front = node;
            this.rear = node;
        }
        rear.next = node;
        rear = rear.next;
        this.usedSize++;
    }

public T poll(){    //出队 头删
        if(isEmpty()){
            throw new UnsupportedOperationException("队列为空"); //为了防止返回值巧合相等 选择抛出操作异常
        }
        T a1 = (T)this.front.data;
        this.front = front.next;
        this.usedSize--;
        return a1;

    }
    public T peek(){ //获得队列的第一个元素 不删
        if(isEmpty()){
            throw new UnsupportedOperationException("队列为空");
        }
        return (T)this.front.data;
    }


}
