package com.company.tangxin;

import com.company.shenduyouxian.TreeNode;

public class IsValiddBST {
    int ans = 0;
    public boolean isValidBST(TreeNode root) {
        ans = root.val;
        return dfs(root);
    }

    public boolean dfs(TreeNode root){
        if (root == null){
            return  true;
        }
        if (root.left != null && root.right != null){
            if (root.val <=root.left.val || root.val>=root.right.val){
                return  false;
            }
        }
        if (root.left == null && root.right == null){
            return  true;
        }
        if (root.left == null){
            if (root.val>= root.right.val){
                return  false;
            }
        }
        if (root.right == null){
            if (root.val<=root.left.val){
                return  false;
            }
        }
        return dfs(root.left)&&dfs(root.right);
    }
}
