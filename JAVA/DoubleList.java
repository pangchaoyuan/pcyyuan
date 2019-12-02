import org.w3c.dom.ls.LSException;

class ListNode1{
    public int data;
    public  ListNode1 prve;
    public ListNode1 next;
    public ListNode1(int data){
        this.data=data;
    }

}






public class DoubleList {
    ListNode head;
    ListNode last;


    public void addFirst(int data){
        ListNode1 node = new ListNode1(data);
        if(this.head==null){
            this.head=node;
        }
        node.next=head;
        head.prve=node;
        head=node;
    }











}
