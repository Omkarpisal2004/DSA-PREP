package Trees;
// preorder iterative
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class question004 {
    static class TreeNode{
        int val;
        TreeNode left ;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }
    static List<Integer> preOrder(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        st.push(root);
        while (!st.isEmpty()){
            TreeNode node = st.pop();
            ans.add(node.val);

            if(node.right != null){
                st.push(node.right);
            }
            if (node.left != null){
                st.push(node.left);
            }
        }
        return ans;

    }
    public static void main(String[] args) {
TreeNode root = new TreeNode(1);
root.left = new TreeNode(2);
root.right = new TreeNode(3);
root.left.left = new TreeNode(4);
root.left.right = new TreeNode(5);
root.left.right.left = new TreeNode(6);
root.right.left = new TreeNode(7);
root.right.right = new TreeNode(8);
root.right.right.right = new TreeNode(10);
root.right.right.left = new TreeNode(9);
        System.out.println(preOrder(root));
 }
    }

