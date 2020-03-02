import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class a1223 {

    static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    //============================把一个二叉搜索树（左>中>右    ，中序遍历为从小到大数的二叉树） 变成按中序遍历的双向链表形式=======================
    Node prev = null;//设置prev为全局变量 用来记录pCur 即在链表中的 cur 和prev的关系
    public void ConvertChild(Node pCur){
        if(pCur==null){
            return;
        }
        ConvertChild(pCur.left);
        pCur.left = prev;   //大数节点的前驱(last)等于小数节点    pCur.last = prev;
        if(prev!=null) {      //叶节点不能为空，若为空了 后驱等于空 报空指针异常
            prev.right = pCur;//小数节点的后驱(next)等于大数节点     prev.next = pCur;
        }
        prev = pCur;           //小数节点等于大数节点    //prev=prev.next;
        ConvertChild(pCur.right);
    }

    //返回双向链表的头节点
    public Node Convert(Node root){
        if(root==null){
            return null;
        }
        ConvertChild(root); //执行完毕，二叉搜索树的结构改变
        Node head = root;
        while(head.left!=null){
            head = head.left;
        }
        return head;
    }
    //==================================层序遍历================================================================================
    public static List<List<Node>> levelOrderTraversal(Node root) {  //层序遍历   再 放 送
        if (root == null) {
            return null;
        }
        List<List<Node>> ret = new ArrayList<>();
        Queue<Node> a1 = new LinkedList<>();
        a1.offer(root);
        while (!a1.isEmpty()) {
            int size = a1.size();   //第一层有一个
            List<Node> list = new ArrayList<>();
            while (size > 0) {
                Node cur = a1.poll();
                list.add(cur);           //吧此层的加进顺序表
                size--;                   //这层的数量-1
                System.out.println(cur.val);
                if (cur.left != null) {     //将该层所有根的left放进队列
                    a1.offer(cur.left); //size+1
                }
                if (cur.right != null) {     //将该层所有根的right放进队列
                    a1.offer(cur.right);//size+1
                }
            }
            ret.add(list);   //在大顺序表里加小顺序表
        }
        return ret;
    }
    //========================根据前序和中序遍历来构建二叉树================================================================================

   public static int i =0; //首先设置一个全局变量i用来表示前序数组的下标
    public  static int findRootIndex(int[] inorder,int inbegin,int inend,int val){                                                 //val为根的数据
        int j = 0;
        for(j=inbegin;j<=inend;j++){
            if(inorder[j]==val){
                return j;
            }
        }
        return -1;   //说明中序里没有前序里的东西 数据传的错的
    }



    public static Node buildTreeChild(int[] preorder,int[] inorder,int inbegin,int inend){
        if(inend<inbegin){     //当左树为空时,j=0,此时左树的inend为-1，返回值应为null
            return null;                           //当右树为空时，j=inorder.length-1,此时右树的inbegin=inorder.length,返回值应为Null
        }                                          //以上两个均为构建二叉树的递归终止条件

        Node root = new Node(preorder[i]);   // 前序的第一个必是整个二叉树根 找到root
        int j = findRootIndex(inorder,inbegin,inend,preorder[i]); //找到中序中root的下标
        i++;
        root.left = buildTreeChild(preorder,inorder,inbegin,j-1);
        root.right = buildTreeChild(preorder,inorder,j+1,inend);
        return root;



    }




    public static Node buildTree(int[] preorder,int[] inorder){
        if(preorder==null||inorder==null){
            return null;
        }
        if(preorder.length==0||inorder.length==0){
            return null;
        }
        i=0;
       return buildTreeChild(preorder,inorder,0,inorder.length-1);//后俩为中序的搜索范围，用来在Child中确定是构建左树还是右树

    }

    public static void main(String[] args) {
        int[] a1 = {3,9,20,15,7};
        int[] a2 = {9,3,15,20,7};
        Node root= buildTree(a1,a2);
        levelOrderTraversal(root);
    }


}
