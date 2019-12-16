

public class DoubleListmain {
    public static void main(String[] args) {
        DoubleList a1 = new DoubleList();
        a1.addFirst(5);
        a1.addFirst(1);
        a1.addLast(2);
        a1.addLast(7);
        a1.addIndex(2,5);
        a1.display1();
        a1.display2();
        int a= a1.remove(5);
        System.out.println("被删除的关键字的下标为"+ a);
        a1.display1();
        a1.display2();
        a1.clear();
        a1.display1();
        a1.display2();
    }
}
