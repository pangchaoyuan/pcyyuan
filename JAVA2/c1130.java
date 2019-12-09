interface A{
    void funcA();
}

interface B{
    void funcB();
}

interface D extends A,B{               //接口继承(扩展 )接口就用extends
    void funcd();
}


class C implements A,B{                        //多继承问题通过接口解决，在第一个接口名后边加逗号，并且重写所有方法就行
    @Override
    public void funcA() {

    }

    @Override
    public void funcB() {

    }
}

class F implements D{             //当你爹认了别的爹，你也得重写那些接口的方法
    @Override
    public void funcd() {

    }

    @Override
    public void funcA() {

    }

    @Override
    public void funcB() {

    }
}



public class c1130 {
    public static void main(String[] args) {

    }
}
