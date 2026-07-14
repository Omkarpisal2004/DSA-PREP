package Trees;
// inorder using recursion
public class question002 {
    static class TreeNode{
        int val ;
        TreeNode leftNode;
        TreeNode rightNode;

        TreeNode(int val){
            this.val = val;
        }
    }
    static void inOrder(TreeNode root){
        if(root == null){
            return ;
        }

        inOrder(root.leftNode);
        System.out.print(root.val);
        inOrder(root.rightNode);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.leftNode = new TreeNode(2);
        root.rightNode = new TreeNode(3);

        root.leftNode.leftNode = new TreeNode(4);
        root.leftNode.rightNode = new TreeNode(5);
        inOrder(root);
    }
}
