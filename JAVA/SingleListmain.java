public class SingleListmain {
          //对两个从大到小的有序单链表进行合并
          public static ListNode mergeTwoList (ListNode heada,ListNode headb) {
              ListNode newHead = new ListNode(0);
              ListNode tmp = newHead;
              int a=0;
              while (heada != null && headb != null) {
                  if (heada.data >= headb.data) {
                      tmp.next = heada;
                      heada = heada.next;
                      tmp = tmp.next;

                  } else {
                      tmp.next = headb;
                      headb = headb.next;
                      tmp = tmp.next;
                  }

                  if(heada==null&&headb!=null){
                      tmp.next = headb;
                      headb = headb.next;
                      tmp = tmp.next;
                  }if(headb==null&&heada!=null){
                      tmp.next = heada;
                      heada = heada.next;
                      tmp = tmp.next;
                  }
                  a++;
                  if(a==1){
                      newHead=tmp;
                  }
              }
              if(heada==null&&headb!=null){                //作为一道题目，防止从一开始其中一个链表就是空的,必要措施
                  while(headb!=null) {
                      tmp.next = headb;
                      headb = headb.next;
                      tmp = tmp.next;
                      a++;
                      if(a==1){
                          newHead=tmp;
                      }
                  }
              }if(headb==null&&heada!=null) {
                  while (heada != null) {
                      tmp.next = heada;
                      heada = heada.next;
                      tmp = tmp.next;
                      a++;
                      if (a == 1) {
                          newHead = tmp;
                      }

                  }
              }

              return newHead ;
          }
          //求两个链表的相交节点
        public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
              if(headA == null||headB==null){
                  return null;
              }
              int lena= 0 ;
              int lenb=0;

              ListNode pl =headA;
              ListNode ps=headB;
              while(pl!=null){
                  pl=pl.next;            //判断长度
                  lena++;
              }
            while(ps!=null){
                ps=ps.next;
                lenb++;
            }
            int len =lena - lenb ;
              if(len<0){
                  pl=headB;
                  ps=headA;
                  len=lenb-lena;
              }

              while(len>0){
                  pl=pl.next;
                  len--;
              }
              while(pl!=null&&ps!=null){        //若其中一个节点空了，还没retrun ps，那就没有相交节点
                  if(ps==pl){
                      return ps;
                  }
                  ps=ps.next;
                  pl=pl.next;
              }
              return null;
        }








    public static void main(String[] args) {
        SingleList  a1 = new SingleList();
        SingleList  a2 =new SingleList();
        a2.addFirst(5);
        a2.addFirst(6);
        a2.addFirst(7);
        a2.addFirst(8);
        a2.addFirst(51);
        a2.addFirst(62);
        a2.addFirst(63);
        a2.display();

        a1.addFirst(8);
        a1.addFirst(9);
        a1.addFirst(10);
        a1.display();

        /*a1.display();
        ListNode address= a1.contains2(4);   //找数据，找到返回地址，没找到返回null
        System.out.println(address);
        boolean a=a1.contains1(3);            //找数据  返回boolean类型
        System.out.println(a);
        a1.remove1(4);
        a1.display();
        a1.remove(1,true); //两种方法
        a1.display();
        a1.addFirst(11);
        a1.addLast(3);
        a1.addindex(3,5);
        a1.display();
        /*ListNode newHead=a1.reverList();
        a1.display2(newHead);*/
       /*ListNode as = a1.middleNode1();
        System.out.println(as.data);
       ListNode ab  =a1.middleNode2();
       System.out.println(ab.data);
          ListNode aa = a1.findKthToTail(4);
        System.out.println(aa.data);*/
      /*ListNode ae=a1.partition(4);
       a1.display2(ae);*/
      /*ListNode af= a1.deleteDuplication();
       a1.display2(af);*/
       /* System.out.println(a1.chkPalindrome());
        a1.creatloop();
        System.out.println(a1.hasCycle());
        ListNode ay=a1.detectCycle();
        System.out.println(ay.data);*/
       /* ListNode ne =mergeTwoList(a1.getHead(),a2.getHead());
        a1.display2(ne);*/
       a1.point(a2.getHead(),a1.getHead());
        ListNode ai=getIntersectionNode(a1.getHead(),a2.getHead());
        System.out.println(ai.data);
    }
}

  //用jps 查看java进程号  通过jmap命令将进程重定向到一个txt文件，查找实例数量,来确认内存是否已经回收      jmap  -histo:live 进程号 >盘符:文件名.txt