import java.util.*;

public class b1215Queue {  //两个栈实现队列
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();


    public void push(int x){
        stack1.push(x);
    }
    public int pop(){
        if(stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        if(!stack2.empty()){
            return (int)stack2.pop();   //pop为出栈   peek不出栈
        }
        return -1;
    }

    public  boolean empty(){
        return stack2.empty()&&stack1.empty();
    }

}
