

class Animal1{
    public String name;
    public Animal1(String name){
        this.name = name;
    }
}

interface Fly{
    void fly();
}


interface Swim{
    void swim();
}

interface Run{
    void run();
}

class Cat extends Animal1 implements Run{
    public Cat(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("猫"+this.name+"正在快速地跑路");
    }
}

class Fish extends Animal1 implements Swim{
    public Fish(String name){
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("鱼"+this.name+"正在快速地游泳");
    }
}

class Frog extends  Animal1 implements Swim,Run,Fly{


    public Frog(String name){
    super(name);
}

    @Override
    public void run() {
        System.out.println("然而青蛙"+this.name+"又会跑");
    }

    @Override
    public void swim() {
        System.out.println("又会游泳");
    }
    @Override
    public void fly() {
        System.out.println("又会飞");
    }

}




public class d1130 {
    public static void  Walk(Run a) {
        System.out.println("我带你去散步，然后看到了");
        a.run();
    }
    public static void  Wal(Fly a) {
        System.out.println("我带你去散步，然后看到了");
        a.fly();
    }
    public static void  Wa(Swim a) {     //1仅针对一个接口建立的方法，只能调用该接口内有的方法，所以虽然青蛙类能调用此方法，也只能调用接口所对应在青蛙类里被重写的Swim
        System.out.println("我带你去散步，然后看到了");//2只要一个类实现了接口，就能调用接口的方法来使用 类自身内重写过的该方法，but 没实现接口=没有接口的方法。
        a.swim();                                      //3可以只关注一个类是否具备能力（是否实现了接口   跑飞游泳），而不必关注这是个什么类(鱼 猫 蛙)，有能力的对象
    }                                             //就可以调用方法。               子类覆写了父类的方法，那么优先子类。重写、覆盖、覆写：方法名一样、参数列表（数量、类型）一样、返回值一样。
                                                                                                          //重载overload:方法名一样，参数列表（数量、类型）和返回值均不作要求

    public static void main(String[] args) {
        Cat a =new Cat("哈哈");
        Fish b = new Fish("嘻嘻");
        Frog c= new Frog("嘿嘿");
        Walk(a);  //猫类没游泳和飞,调用Wal 和Wa会报错
        Wa(c);

    }
}
