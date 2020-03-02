import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class a1221 {
    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

        public boolean isCompleteTree(Node root) {    //判断一个二叉树是否是满二叉树
            Queue<Node> queue = new LinkedList<>();

            if (root != null) {
                queue.offer(root);
            }

            while (!queue.isEmpty()) {
                Node cur = queue.poll();
                if (cur != null) {
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                } else {
                    break;
                }
            }
            while (!queue.isEmpty()) {
                if (queue.peek() == null) {
                    queue.poll();
                } else {
                    return false;
                }
            }

            return true;
        }

        public int i = 0;

        public Node buildTree(String str) {     //构建二叉树  前序方式
            Node root = null;
            if (str.charAt(i) != '#') {
                root = new Node(str.charAt(i));
                i++;
                root.left = buildTree(str);
                root.right = buildTree(str);

            } else {
                i++;
            }
            return root;
        }

        public Node lowestCommonAncestor(Node root, TreeNode p, TreeNode q) {   // p和q的最近的公共祖先
            if (root == null) {
                return null;
            }
            if (root == p || root == q) {
                return root;
            }
            Node leftTree = lowestCommonAncestor(root.left, p, q);
            Node rightTree = lowestCommonAncestor(root.right, p, q);
            if (leftTree != null && rightTree != null) {
                return root;
            }
            return leftTree == null ? rightTree : leftTree;
        }

        public StringBuilder str = new StringBuilder();    //二叉树转带括号的字符串

        public String tree2str(Node t) {
            if (t == null) {
                str.append("");
                return str.toString();
            }

            str.append(t.val);
            if (t.left == null) {
                if (t.right == null) {
                    str.append("");
                } else {
                    str.append("()");

                }
            } else {
                str.append("(");
                tree2str(t.left);
                str.append(")");
            }
            if (t.right == null) {
                str.append("");
            } else {
                str.append("(");
                tree2str(t.right);
                str.append(")");
            }
            return str.toString();
        }

        public List<List<Node>> dawd(Node root) {  //层序遍历   再 放 送
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
                    list.add(cur);           //
                    size--;
                    System.out.println(cur.val);
                    if (cur.left != null) {
                        a1.offer(cur.left); //size+1
                    }
                    if (cur.right != null) {
                        a1.offer(cur.right);//size+1
                    }
                }
                ret.add(list);
            }
            return ret;
        }


        public static void main(String[] args) {

        }

    }
}
