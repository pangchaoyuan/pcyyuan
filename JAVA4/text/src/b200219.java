public class b200219 {
       class Node{
           public int key;
           public Node left;
           public Node right;

           public Node(int key) {
               this.key = key;
               this.left=null;
               this.right=null;
           }
       }

       public Node root = null;

//================搜索========================
public Node search(int key ){
           Node cur = root;
           while(cur!=null) {
               if (key > cur.key) cur = cur.right;
               if (key == cur.key) return cur;
               if (key < cur.key) cur = cur.left;
           }
           return null;
}

//====================插入=======================

    public boolean insert(int key){
      Node cur = root;
      Node parent = root;
      Node node = new Node(key);
      if(root==null){
          root = node;
          return true;
      }
      while(cur!=null){
          parent = cur;
          if(cur.key>key){
              cur=cur.left;
          }else if(cur.key<key){
              cur = cur.right;
          }else{                //相等不能插入
              return false;
          }
      }
     if(parent.key>key){
          parent.left = node;
     }else{
          parent.right = node;
     }
     return true;
    }

//==============中序遍历===================

    public void inorder(Node root){
    if(root==null) return;

        inorder(root.left);
        System.out.print(root.key+" ");
        inorder(root.right);

    }
    //================前序遍历====================
   public void  preorder(Node root){
       if(root==null) return;

           System.out.print(root.key+" ");
           inorder(root.left);
           inorder(root.right);

   }
//=================删除==================
  public void delete(int key){
    Node cur = root;
    Node parent = null;
    while(cur!=null){
        if(cur.key == key){
            remove(parent,cur);
            return;
        }else if(cur.key<key){
            parent = cur;
            cur = cur.right;
        }else{
            parent = cur;
            cur = cur.left;
        }
    }
  }


  private void remove(Node parent,Node cur){
    if(cur.left==null){
        if(cur==root) root=cur.right;
        if(cur==parent.left) parent.left=cur.right;
        if(cur==parent.right) parent.right=cur.right;
    }else if(cur.right==null){
        if(cur==root) root=cur.left;
        if(cur==parent.right) parent.right=cur.left;
        if(cur==parent.left) parent.left=cur.left;
    }else{   //在左边找最大 以及 在右边找最小
        Node tp = cur;  //t的父节点
        Node t = cur.left;
        while(t.right!=null){
            tp = t;
            t = t.right;
        }
        cur.key = t.key;
        if(t==tp.left) tp.left = t.left;   //此时t的右必为空，为了维持关系，使t的位置替换为t.left
        if(t==tp.right) tp.right = t.left;

    }



  }


}
