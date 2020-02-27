import java.util.*;


public class a1215Stack {          //用两个队列实现栈

    public Queue<Integer> queue1 = new LinkedList<>();
    public Queue<Integer> queue2 = new LinkedList<>();

    public void push(int x){
            if(!queue1.isEmpty()){
                queue1.offer(x);
            }else if(!queue2.isEmpty()){
                queue2.offer(x);
            }else{
                queue1.offer(x);
            }
    }

    public int pop(){   //出栈
        if(!queue1.isEmpty()){
            int a =queue1.size();
            for(int i =0;i<a-1;i++){
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        }
        if(!queue2.isEmpty()){
            int a =queue2.size();
            for(int i =0;i< a-1;i++){
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }
        return -1;
    }

    public int top(){  //得到栈顶且不出栈
        int a =0;
        if(!queue1.isEmpty()){
            int b = queue1.size();
            for(int i =0;i< b-1;i++){
                a = queue1.peek();
                queue2.offer(queue1.poll());
            }
            return a;
        }
        if(!queue2.isEmpty()){
            int b =queue2.size();
            for(int i =0;i< b-1;i++){
                a = queue2.peek();
                queue1.offer(queue2.poll());
            }
            return a;
        }
        return -1;
    }


    public  boolean empty(){  //栈是否为空
        return queue1.isEmpty()&&queue2.isEmpty();    //队列的方法 peek不出队列  poll出队列
    }

}
