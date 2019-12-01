//单链表


import java.security.PublicKey;

class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data){//定义节点类
        this.data=data;
        this.next=null;
    }
}
//单链表的方法们
class SingleList{


    public ListNodehead;                           //头节点;
    public SingleList(){
        this.head=null;
    }

   public void addFirst(int data){                    //头插法     插在第一个节点（头节点）｝前边
        ListNode  node= new ListNode(data);
        if(this.head ==null){                    //若this.head==null，则说明此链表没节点，现在插入的是第一个节点
            head=node;
        }else {
            node.next = this.head;
            this.head=node;
        }                               //新节点的next存放“头节点”现在所保留的地址
                                        //让“头节点”这个的对象的地址变成新节点的地址，即让新节点成为“头节点”
    }

    public void  addLast(int data) {           //尾插法
        ListNode node = new ListNode(data); //要插入的节点
        ListNode cur = this.head;        //定义一个节点地址为头节点
        if (this.head == null) {             //第一个节点
            this.head = node;
        }

            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;

    }

     public void display() {        //打印单链表及其长度
         if (this.head == null) {
             return;
         } else {
             ListNode cur = this.head;
             while(cur!=null){
                 System.out.print(cur.data+"  ");
                 cur=cur.next;
             }
         }
         System.out.println();
         System.out.println("该单链表有"+getlength(this.head)+"个节点");
     }

     //获取单链表长度
     public int getlength(ListNode head){
        ListNode cur =head;
        int b =0;
        while(cur!=null){
            cur=cur.next;
            b++;
        }
        return b;
     }

//找到第node节点的前一个节点
     private ListNode sreachlast(int node){
        ListNode prev= this.head;
        for(int i =0;i<node-1;i++){
            prev=prev.next;
        }
        return prev;

     }

     //插到下标为index的位置
     public boolean addindex(int index,int data){
        ListNode node=new ListNode(data);
        //下标合法与否
        if(index<0||index>getlength(this.head)){
            return false;
        }
        if(index==0){
            addFirst(data);
            return true;
        }
        ListNode  prev = sreachlast(index);
        node.next=prev.next;
        prev.next=node;
        return  true;
     }

     //查找一个数据，如果有返回地址，如果没有则返回null
    public ListNode contains2(int key){
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                return cur;
            }
            cur=cur.next;
        }
        return cur;    //
    }

    public boolean contains1(int key){
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
   //删除数据Key
    public Boolean remove1(int key){

       while(this.head.data==key){
           this.head=this.head.next;
       }                  //保证头不是key
       if(this.head==null){
            return  false;
        }
       ListNode cur = this.head;
        int a =0;
        while(cur!=null){
            if(cur.data==key){             //由于头节点不会是key，所以第一次不会执行
                ListNode del =sreachlast(a);//a一直都会是cur的下标
                del.next=cur.next;

                //return true;        //当只需要删除第一个key的时候留着这行（需要修改删除头节点的程序为if语句）     需要删除所有的key时去掉这行
            }
            cur=cur.next;
            a++;
        }
        return false;
    }

    //删除遇到的所有key           //输入ture调用删除所有 key的方法         输入false调用只删除第一个key的方法
    public void remove(int key,boolean a){
        if(!a){
            this.remove1(key);
        }
        while(this.head.data==key){
            this.head=this.head.next;
        }                       //保证头节点不是key
        ListNode cur = this.head;
        ListNode del =new ListNode(0);
        while(cur!=null){
            if(cur.data==key){
                cur=cur.next;
                del.next=cur.next;
            }else{
                del.next=cur;
                cur=cur.next;
                del=del.next;
            }
        }
    }


    public void clear(){
        this.head=null;
    }

    //逆置单链表
    public ListNode reverList(){
        ListNode prev=null;
        ListNode cur =this.head;
        ListNode newHead=null;
        while(cur!=null) {
            ListNode curNext =cur.next;
            if(curNext==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
    }

    public void display2(ListNode newHead) {        //打印单链表及其长度（接头)
        if (newHead == null) {
            return;
        } else {
            ListNode cur = newHead;
            while(cur!=null){
                System.out.print(cur.data+"  ");
                cur=cur.next;
            }
        }
        System.out.println();
        System.out.println("该单链表有"+getlength(newHead)+"个节点");
    }


         //找中间的节点
     public ListNode middleNode1(){
        ListNode cur =this.head;
              int n=getlength(this.head)/2;

         for(int i = 0 ;i<n;i++){
             cur=cur.next;
         }
         return cur;
    }
         //找中间的节点
    public ListNode middleNode2(){
        ListNode slow=this.head;
        ListNode fast=this.head;
        while((fast!= null) &&(fast.next!= null) ){        //一定要将fast放在fast.next前边，否则会报空指针异常
            slow=slow.next;
            fast=fast.next;
            fast=fast.next;
        }

        return slow;
    }

//倒数第k个节点的数据
    public ListNode findKthToTail(int k){
        ListNode slow=this.head;
        ListNode fast=this.head;
        if(k<=0||this.head==null){
            return null;
        }
        while(fast.next!=null){
          while(k-1>0){
              fast=fast.next;
              k--;
              if(fast==null){
                  System.out.println("没有这个节点");
                  return null;
              }
          }
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    //以x为基准，吧大于等于x和小与x的节点分成两段
    public ListNode partition(int x){
         ListNode as=null;
         ListNode bs=null;
         ListNode ae=null;
         ListNode be=null;
         ListNode cur=this.head;
         while(cur!=null){
             if(cur.data>=x){
                 if(as==null){
                     as=cur;
                     ae=as;
                 }
                 else{

                     ae.next=cur;
                     ae=ae.next;
                 }}else{
                 if(bs==null){
                     bs=cur;
                     be=bs;
                 }else{

                     be.next=cur;
                     be=be.next;
                 }

                 }
                 cur=cur.next;
             }                               //一定将新尾节点的next赋值为null，否则可能疯狂循环
             if(bs==null){
                 return as;
             }else {
                 if (ae.next != null) {
                     ae.next = null;
                 }
             }
                 be.next = as;
                 return bs;

         }
       //在一个有序的单链表内删除所有重复数据
    public ListNode deleteDuplication(){
        ListNode cur=this.head;   //遍历
        ListNode newhead=new ListNode(0);          //记录头
        ListNode temp=this.head;   //保存单链表
        int a =0;
        if(cur==null){
            return null;
        }
        while(cur!=null){
            if(cur.next!=null&&cur.data==cur.next.data){
                while(cur.next!=null&&cur.data==cur.next.data) {
                    cur = cur.next;
                }
                cur=cur.next;
            }
            else{
                a++;
                if(a==1){
                    newhead=cur;  //让第一个没有重复数据的节点成为新头节点
                }
                 cur=cur.next;
            }
            temp.next=cur;
            temp=temp.next;

        }
        return newhead;
    }

    //判断一个单链表是否回文
     public boolean chkPalindrome(){
         if(this.head==null){
             return false;
         }
         if(this.head.next==null){
             return true;
         }
        ListNode slow=this.head;
        ListNode fast=this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode prev=null;
        ListNode cur=slow;                           //找中间 可取消本行 将cur换成slow
        ListNode newhead=new ListNode(0);
        while(cur!=null){
            ListNode curNext=cur.next;
            if(curNext==null){
                newhead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }                     //翻转后半部分
           cur= newhead;
        ListNode cur2=this.head;
        while(cur!=null){
            if(cur2.data==cur.data){
                cur2=cur2.next;
                cur=cur.next;
            }else{
                break;
            }
        }                   //逐位判断是否相等
        if(cur2==null){
            return true;
        }
        return false;

     }

     public void creatloop(){             //写个环出来
        ListNode cur = this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=this.head.next.next;
     }




              //判断一个单链表是否有环
     public boolean hasCycle(){
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast.next==slow.next){
                return true;
            }
        }
        return false;
        }


        public ListNode  detectCycle(){
            ListNode fast = this.head;
            ListNode slow = this.head;
            int a =0;
            while(fast!=null&&fast.next!=null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast.next == slow.next) {
                    break;
                }
                else{
                    ++a;
                    if(a==getlength(this.head)){
                        return null;
                    }           //为了返回一个没环的信息
                }
            }
                slow=this.head;
                while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
                }
                return slow;
            }


            //返回头节点
            public ListNode getHead(){
        return this.head;
            }

        //创造从第三位开始相交的两链表(测试找交节点)
        public void point(ListNode a,ListNode b){
        a.next.next.next=b.next.next;
        }


}