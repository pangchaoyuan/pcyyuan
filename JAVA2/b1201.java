

//Cloneable是一个空接口  自定义类型实现了Cloneable 将认定该类型可以被克隆，可以调用clone()方法


class Money implements Cloneable{
    double money = 123.4;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Persion implements Cloneable{
    public String name;
    public Money m;
    public Persion(){
        this.m=new Money();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // return super.clone();           //浅拷贝的方式
        Persion c = (Persion) super.clone();        //深拷贝   让Money也实现CLoneable   在Money中重写克隆方法  在Persion类重写的克隆方法中不仅要克隆自己  (就是在克隆方法中新建一个对象，直接返回这个对象)
        c.m = (Money) this.m.clone();             // 还得克隆Money  由于克隆的构造方法类型为Object 因此需要强转和声明
        return c;
    }

}



public class b1201 {
    public static void main(String[] args)throws  CloneNotSupportedException{
        Persion a = new Persion();
        a.name = "sdad";
        Persion b = (Persion)a.clone();
        System.out.println(a.m.money);
        System.out.println(b.m.money);
        System.out.println("====================");
        b.m.money = 111;
        b.name="dwadqwfq";
        System.out.println(a.m.money);           //赋值的是B的money，然而a.m.money也跟着改变了，说明只是克隆了在栈上对象中的引用。而没有克隆money在堆上的本体 这是浅拷贝
        System.out.println(b.m.money);
        System.out.println(b.name);
        System.out.println(a.name);
    }
}
