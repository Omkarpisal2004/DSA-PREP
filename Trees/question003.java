package Trees;
// postorder using recursion
public class question003 {
    static class TreeNode{
        int val ;
        TreeNode leftNode;
        TreeNode rightNode;

        TreeNode(int val){
            this.val = val;
        }
    }
    static void postOrder(TreeNode root){
        if(root == null){
            return ;
        }

        postOrder(root.leftNode);

        postOrder(root.rightNode);
        System.out.print(root.val);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.leftNode = new TreeNode(2);
        root.rightNode = new TreeNode(3);

        root.leftNode.leftNode = new TreeNode(4);
        root.leftNode.rightNode = new TreeNode(5);
        postOrder(root);

    }
}
