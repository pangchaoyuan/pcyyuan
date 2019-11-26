
/*
class Persion{
    private String name;//成员属性
    private int age;
    private String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void eat() {         //成员方法
        System.out.println("吃饭");

    }
        public static void sleep() {
            System.out.println("睡觉");
        }

            public void show(){
                System.out.println(name +age +sex);
            }

            public static void main(String[] args) {
                Persion human1 = new Persion();
                human1.setName("张三");
                String name = human1.getName();
                human1.setSex("男");
                String sex = human1.getSex();
                human1.setAge(123);
                int age = human1.getAge();
                human1.show();
            }
        }
        /*  get set方法要在一个class中使用
*/
/*
class  human{
    private String name;
    private  int age;
    private String sex;

    public human(){
        this("张三",15);  //最后输出的结果年龄为 15，因为先调用来第三个构造方法，先将AGE赋值为117，然后再将15给AGE赋值
    }

    public human(String name,int age){
        this("张三",117,"男");
         this.name=name;
         this.age=age;
    }

    public human(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public void show(){
        System.out.println(name  +  age  + sex);
    }

}

public class Persion{
    public static void main(String[] args) {
        human a =new human();
        a.show();                                 //构造方法可以有俩class，构造方法可以调用其他构造方法，但只能放在第一行
                                                  //即只能调用一个，构造方法可重载，且可以使用this进行引用，因为创建对象时
                                                  //首先开辟了内存空间，已经拥有地址，所以this的作用是引用而不是直接针对变量
                                                  //实例化一个对象 分两步 第一 开辟内存空间 第二 调用合适的构造方法
                                                  //实例代码块直接｛｝，优先于构造方法执行，用来初始化实例的数据成员，可初始化静态数据成员...。
                                                  //静态代码块为 static{}，优先于实例代码块执行,用来初始化静态的数据成员，不能初始化实例数据成员....。
                                                     //优先级 静态代码块》实例代码块》构造方法，和代码位置无关。
                                                     //静态代码块和静态数据成员的优先级，由代码位置顺序决定。
                                                     //静态代码块只执行一次
    }

}
*/