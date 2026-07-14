package Trees;
// PreOrder using recursion
public class question001 {
    static class TreeNode{
        int val ;
        TreeNode leftNode;
        TreeNode rightNode;

        TreeNode(int val){
            this.val = val;
        }
    }
    static void preOrder(TreeNode root){
        if(root == null){
            return ;
        }
        System.out.print(root.val);
        preOrder(root.leftNode);
        preOrder(root.rightNode);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.leftNode = new TreeNode(2);
        root.rightNode = new TreeNode(3);

        root.leftNode.leftNode = new TreeNode(4);
        root.leftNode.rightNode = new TreeNode(5);
        preOrder(root);
    }
}
