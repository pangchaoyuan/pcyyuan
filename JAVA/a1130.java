

class Animal{
    public String name;
    public Animal(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println(this.name+"eat");
    }

}
class cat extends Animal{
    public String sex;

    public cat(String name,String sex){
        super(name);
        this.sex=sex;
    }

    public void jump(){
        System.out.println(this.name+"jump");

    }
}


class bird extends Animal{
    public String color;
    public  bird(String name,String color){
        super(name);
        this.color = color;
    }

    public void fly(){
        System.out.println(this.name+"fly");
    }
        }



public class a1130{
    public static void main(String[] args) {
        Animal animal1 = new cat("哈哈","man");
        Animal animal2 = new bird("嘻嘻","红");
        ((cat) animal1).jump();
        ((bird) animal2).fly();
    }
}  //多态的出现条件 向上转型(全是class，: 父类 a = new 子类) 同名覆盖方法 调用方法时进行运行时绑定


//abstract 没有实际工作意义的方法可以写成抽象方法，包括抽象方法的类叫做抽象类，抽象类不能被实例化，不能设置为private，其中包含的抽象方法必被
//重写，否则报错，抽象类的子类也可以是抽象类，但是作为非抽象类的子类时，必须重写，作为抽象类子类时可以不重写。非抽象子类可以通过实例化对象
//来对抽象类父类的方法进行调用。          ctrl+ O