/*用擦除机制进行编译，擦除为Object;
可以进行自动类型检查、自动类型转换（用Object时获得数据时需要强转）
*  泛型类型的参数不参与类型额组成
*
*
*  泛型只有在编译时期才会起作用 运行时没有泛型的概念
* */




public class b1209ArrayList<T> {        //t是个占位符，标记当前类是泛型类
    public T[] elem ;
    public int usedSize;

    public b1209ArrayList() {
        this.usedSize = 0;
        this.elem = (T[])new Object[20];//不能用泛型直接实例化一个数组   要这么写
    }

    public void add(T data){
        this.elem[this.usedSize] =data;
        this.usedSize++;
    }

    public T get(){

        return this.elem[this.usedSize-1];
    }

}
