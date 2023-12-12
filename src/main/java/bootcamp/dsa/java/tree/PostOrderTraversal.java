package bootcamp.dsa.java.tree;

public class PostOrderTraversal {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode lc1 = new TreeNode(2);
        TreeNode rc1 = new TreeNode(3);

        TreeNode lc2 = new TreeNode(4);
        TreeNode rc2 = new TreeNode(5);

        root.left = lc1;
        root.right =  rc1;

        root.left.left = lc2;
        root.left.right = rc2;


        postorder(root);
    }

    //Post order => l->right->root
    private static void postorder(TreeNode root) {
        if(root == null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
    }
}
