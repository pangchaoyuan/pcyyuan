public class ArrayListMain {
    public static void main(String[] args) {                                  //顺序表主函数
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,12);
        myArrayList.add(0,11);
        myArrayList.add(0,13);
        myArrayList.add(0,14);
        myArrayList.add(3,115);
        myArrayList.display();
        myArrayList.find(122);
        myArrayList.getpos(3);
        myArrayList.search(115);
        myArrayList.clear();
        myArrayList.display();
    }
}
