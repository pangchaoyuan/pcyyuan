import java.util.ArrayList;
import java.util.List;
 //二叉树
public class c1215 {
   static class Node {
        char value;
        Node left;
        Node right;

        public Node(char value) {
            this.value = value;
        }
    }
   public Node Tree() {
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





    //前序遍历
    public void A1(Node root) {
        if (root == null) {
          return;
        }
        System.out.println(root.value+" ");
        A1(root.left);
        A1(root.right);

    }
     //中序有返回值 返回中序遍历之后的 存储字符的 顺序表
    public List<Character> A2(Node root){
        List<Character> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        List<Character> list1 =  A2(root.left);
          list.addAll(list1);
          list.add(root.value);
        List<Character> list2 = A2(root.right);
          list.addAll(list2);
          return list;
    }

    //后序遍历
    public void A3(Node root){
        if(root==null){
            return;
        }
        A3(root.left);
        A3(root.right);
        System.out.println(root.value+" ");

    }

    public int getLeafSize(Node root){
    if(root==null){
        return 0;
    }else if(root.left==null&root.right==null){
          return 1;
    }

    return getLeafSize(root.left)+getLeafSize(root.right);

    }



    public  int getKlevelSize(Node root ,int k){
    if(root==null){
        return 0;
    }
    if(k==1){
        return 1;
    }
    return getKlevelSize(root.left,k-1)+getKlevelSize(root.right,k-1); //+1; 带上这个+1 就是求一个二叉树有几个节点

    }


    public Node find(Node root,char val){
       if(root==null){
           return null;
       }if(root.value == val){
           return root;
        }
           Node ret = find(root.left,val);
           if(ret!=null) return ret;
           ret=  find(root.right,val);
           return ret;
    }

  public boolean isSame(Node a,Node b){ //a  b是否相同
       if(a==null&&b==null){
           return true;
       }if(a!=null&&b==null||a==null&&b!=null){
           return false;
      }if(a==b) {
          return isSame(a.right, b.right) && isSame(a.left, b.left);
      }
      return false;
  }


  public boolean isSubtree(Node a,Node b){  //b是否为a的子树
       if(a!=null&&b==null){
           return false;
       }
       if(isSame(a,b)) return true;
       if(isSubtree(a.left,b)) return true;
       if(isSubtree(a.right,b))return true;
       return false;
  }

}
