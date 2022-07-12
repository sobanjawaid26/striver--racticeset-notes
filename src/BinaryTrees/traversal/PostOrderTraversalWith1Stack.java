package BinaryTrees.traversal;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversalWith1Stack {

    ArrayList<Integer> postOrderTraversalWith1Stack(TreeNode cur) {

        ArrayList < Integer > postOrder = new ArrayList < > ();
        if (cur == null) return postOrder;

        Stack < TreeNode > st = new Stack< >();
        while (cur != null || !st.isEmpty()) {

            if (cur != null) {
                st.push(cur);
                cur = cur.left;
            } else {
                TreeNode temp = st.peek().right;
                if (temp == null) {
                    temp = st.peek();
                    st.pop();
                    postOrder.add(temp.val);
                    while (!st.isEmpty() && temp == st.peek().right) {
                        temp = st.peek();
                        st.pop();
                        postOrder.add(temp.val);
                    }
                } else cur = temp;
            }
        }
        return postOrder;
    }
}
