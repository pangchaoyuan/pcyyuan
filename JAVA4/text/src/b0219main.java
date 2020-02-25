public class b0219main {
    public static void main(String[] args) {
        b200219 tree = new b200219();
        tree.insert(14);
        tree.insert(12);
        tree.insert(142);
        tree.insert(3);
        tree.insert(53);
        tree.insert(5);
        tree.insert(12);
        tree.inorder(tree.root);
        System.out.println();
        tree.delete(3);
        tree.inorder(tree.root);
    }
}
