import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class a1213ArrayStackMain {
    public static void main(String[] args) {
        a1213<Integer> myStack = new a1213<>();
        myStack.push(123);
        myStack.push(43);
        myStack.push(643);
        myStack.push(1863);
        myStack.push(177);
        System.out.println( myStack.getTop());
        System.out.println(myStack.pop());
        System.out.println( myStack.getTop());

        a1213<String> myStack2 = new a1213<>();
        myStack2.push("wqr");
        myStack2.push("wqwg");
        myStack2.push("废弃物");
        myStack2.push("和天文哥");
        System.out.println( myStack2.getTop());
        System.out.println(myStack2.pop());
        System.out.println( myStack2.getTop());

        Stack<String> stack = new Stack<>();//不需要自己写


    }
}
