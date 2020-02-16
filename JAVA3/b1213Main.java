import java.util.*;

public class b1213Main {

    public static boolean isValid(String s){   //判断一个括号的字符串是否符合运算规则
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='('||ch=='{'|| ch=='['){
                stack.push(ch);
            }else{
                if(stack.empty()){
                    System.out.println("右括号多");
                    return false;//右括号多
                }
                if(stack.peek()=='('&&ch==')'||stack.peek()=='{'&&ch=='}'||stack.peek()=='['&&ch==']'){
                    stack.pop();
                }else{
                    System.out.println("匹配错误");
                    return false;
                }
            }
        }
        if(!stack.empty()){
            System.out.println("左括号多");
            return false;
        }
        return true;

    }


    public static void main(String[] args) {
        String a = "{{{}}}";
        System.out.println(isValid(a));
    }


    public static void main1(String[] args) {
        ListStackb1213<Integer> a1 = new ListStackb1213<>();
        a1.offer(1);
        a1.offer(2);
        a1.offer(3);
        a1.offer(4);
        a1.offer(5);
        System.out.println(a1.poll());
        System.out.println(a1.peek());

    }


}
