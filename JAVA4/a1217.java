import javax.swing.tree.TreeNode;
import java.math.*;
import java.util.*;





public class a1217 {

   static class Node{
        char val;
        Node left;
        Node right;

        public Node(char val){
            this.val=val;
        }
    }
    public Node Tree1(){
        Node root = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        root.left = B;
        root.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        return root;
    }


    public int maxDepth(Node root) {   //二叉树的最大深度
        if (root == null) {
            return 0;
        }
        int left1 = maxDepth(root.left);
        int right1 = maxDepth(root.right);
        return left1 > right1 ? left1 + 1 : right1 + 1;
    }


    public boolean isBalanced(Node root) { //平衡二叉树
        if (root == null) {
            return true;
        }
        if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1) {
            boolean a = isBalanced(root.right);
            boolean b = isBalanced(root.left);
            return a && b;
        }
        return false;

    }

    public List<Character> preOrder(Node root){ //前序遍历迭代
        if (root == null) {
            return null;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        List<Character> list = new ArrayList<>();
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                list.add(cur.val);
                cur = cur.left;
            }
            cur = stack.pop();
            cur = cur.right;
        }
        return list;
    }

    public List<Character> midOrder(Node root){   //中序迭代遍历
        if(root==null){
            return null;
        }
        List<Character> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node cur =root;
        while(cur!=null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        return list;
    }

    public List<Character> postOrder(Node root){   //后序迭代遍历
        List<Character> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        Node prev = null;
        while(cur!=null||!stack.empty()){
            while(cur!=null&&prev!=cur.right){
                stack.push(cur);
                cur=cur.left;
            }
            cur=stack.peek();

            if(cur.right==null||prev!=cur.right){
                cur = stack.pop();
                list.add(cur.val);
                System.out.println(cur.val);
                prev = cur;
                cur = null;
            }else {
                cur = cur.right;
            }

        }
        return list;
    }

    public void levelOrderTraversal(Node root){//层序遍历
        Queue<Node> queue = new LinkedList<>();
        if(root!=null){
            queue.offer(root);
        }
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            System.out.println(cur.val);
            if(cur.left!=null){
                queue.offer(cur.left);
            }
            if(cur.right!=null){
                queue.offer(cur.right);
            }
        }
    }



    public static void main(String[] args) {

    }
}
