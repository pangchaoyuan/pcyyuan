

//顺序栈
public class a1213<T> {
    public T[] elem;
    public int top;

    public a1213() {
        this.elem = (T[]) new Object[10];
        this.top = 0;
    }

    private   boolean isFull(){
        return this.top==this.elem.length;
    }
    public void push(T val){    //入栈
        if(isFull()){
            return;
        }
        this.elem[top]=val;
        this.top++;
    }
    private boolean isEmpty(){
        return this.top==0;
    }
    //出栈
    public T pop(){
        if(isEmpty()){
            return null;
        }
        T a =this.elem[top-1];
        this.top--;
        return a;
    }

    //得到栈顶元素但是不出栈
    public T getTop(){
        if(isEmpty()){
            return  null;
        }
        return this.elem[top-1];
    }


}






