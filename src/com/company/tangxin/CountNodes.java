package com.company.tangxin;

import com.company.shenduyouxian.TreeNode;

public class CountNodes {
    public int countNodes(TreeNode root) {
        return dfs(root);
    }
    // jiedianshumu
    public  int dfs(TreeNode root){
        if (root==null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return  1;
        }
        return dfs(root.left)+dfs(root.right)+1;
    }
}
