package Trees;
// Inorder using Iterative
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class question005 {
    static class TreeNode{
int val ;
TreeNode left;
TreeNode right;

TreeNode(int val){
    this.val = val;
}
    }
    static List<Integer> inOrder (TreeNode root){
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        TreeNode curr = root;
        while (curr != null || !st.isEmpty()){ // go left most
            while (curr != null){
                st.push(curr);
                curr = curr.left;
            }
           curr = st.pop();
            ans.add(curr.val);
            curr = curr.right;
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
        System.out.println( inOrder(root));
    }
}
