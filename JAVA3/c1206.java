class MyException extends Exception{            //自定义了一个异常
    public MyException(String s) {
        super(s);
    }
}

public class c1206 {




    public static void main(String[] args) {   //编写一个能产生数组下标越界异常的代码并且打印字符串参数
        try{
            int[] a = new int[5];
            System.out.println(a[100]);

        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally {
            System.out.println("执行完毕");
        }
    }



    public static void main1(String[] args) {
        StringBuilder a = null;
        try{
            a.append("fsa");
        }catch (Exception e){
               e.printStackTrace();
        }finally{
            System.out.println("捕捉到异常");
        }

    }



    public static void main2(String[] args) {
        try{
            throw new MyException("发生了异常");   //在try里抛出异常并且打印字符串参数
        }catch (MyException e){
            e.printStackTrace();
        }finally{
            System.out.println("全部执行完毕");
        }
    }

}
