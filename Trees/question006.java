package Trees;
// postOrder Iterative
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class question006 {
   static class TreeNode{
        int val ;
        TreeNode left ;
        TreeNode right ;

        TreeNode(int val){
            this.val = val;
        }
    }
    static List<Integer> postOrder(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();

        TreeNode curr = root;
        TreeNode lastVisited = null;
        while (curr != null || !st.isEmpty()){
            if (curr != null){
                st.push(curr);
                curr = curr.left;
            } else {
                TreeNode peek = st.peek();
                if(peek.right != null && lastVisited != peek.right){
                    curr = peek.right;
                } else {
                    ans.add(peek.val);
                    lastVisited = st.pop();
                }
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
        System.out.println( postOrder(root));
    }
}
