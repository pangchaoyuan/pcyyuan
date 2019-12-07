

//extend 扩展   implement 实现
//接口
interface IShape{
    public abstract void draw();//在接口内，public abstract为灰色，表示就算不加这两个关键字，默认也是抽象方法（一般不写）
   //void func1();
    public static final int a =10;//定义的成员变量默认为public static final   （一般不写）          为了保持整洁一般不写修饰的词
    int b =20;
}

class Cycle implements IShape{           //类实现接口 implements    实现了接口一定要重写接口里的所有方法
    @Override
    public void draw() {                  //必须加public 因为子类方法的权限要大于等于父类方法，然而接口的方法默认public起手。
        System.out.println("○");
    }         //必须加public 因为接口默认public起手
}

class square implements IShape{
    @Override
    public void draw() {
        System.out.println("□");
    }
}






public class b1130 {
    public static void drawMap(IShape shape) {
        shape.draw();
    }


    public static void main(String[] args) {
        //IShape shape = new IShape();   不能实例化
        IShape shape = new Cycle();//用子类向上转型进行实例化
        drawMap(shape);
    }
}
