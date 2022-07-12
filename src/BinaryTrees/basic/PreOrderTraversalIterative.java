package BinaryTrees.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversalIterative {
    public List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> preorder = new ArrayList<Integer>();
        if(root == null) return preorder;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            preorder.add(root.val);
            if(root.right != null)
                st.push(root.right);
            if(root.left != null)
                st.push(root.left);
        }
        return preorder;
    }
}
