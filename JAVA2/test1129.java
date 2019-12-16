public class ListNode {        //将两个链表相加
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode head = new ListNode(0);
          ListNode cur = head;
          int a = 0;
          while(l1!=null||l2!=null||a!=0){
              int l1Val = l1!=null? l1.val:0;
              int l2Val = l2!=null? l2.val:0;
              int sum = l1Val+l2Val+a;
              a=sum/10;

          ListNode add = new ListNode(sum%10);
              cur.next = add;
              cur=cur.next;

              if(l1!=null)  l1=l1.next;
              if(l2!=null)  l2=l2.next;

          }
          return head.next;
    }
}



//一个数字是否回文
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
         int a= 0;
         int b= 0;
         int c= x;
         while(c!=0){
             a=c%10;
             b=b*10+a;
             c=c/10;
         }
        return b==x;
        
        }
    
}

 //用jps 查看java进程号  通过jmap命令将进程重定向到一个txt文件，查找实例数量,来确认内存是否已经回收      jmap  -histo:live 进程号 >盘符:文件名.txt