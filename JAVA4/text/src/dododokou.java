
//利用map的映射关系来深拷贝一个链表
public class dododokou {
    /*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
    /*class Solution {
        public Node copyRandomList(Node head) {
            if(head == null) return head;

            Node cur = head;
            Map<Node,Node> map = new HashMap<>();
            while(cur!=null){
                Node clone = new Node(cur.val,null,null);
                map.put(cur,clone);  //原节点和克隆节点映射
                cur = cur.next;
            }
            cur = head;
            while(cur!=null){
                map.get(cur).next = map.get(cur.next);//cur的克隆的下一个为cur的下一个的克隆
                map.get(cur).random = map.get(cur.random);//cur的克隆的随机等于cur的随机的克隆
                cur = cur.next;
            }
            return map.get(head); //返回head的克隆节点
        }
    }
}
*/
}
/*  public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        for(char a: J.toCharArray()){
             set.add(a);
        }
        int i =0;
        for(char a : S.toCharArray()){
            if(set.contains(a)){
                i++;
            }
        }
        return i;
    }
*
* */