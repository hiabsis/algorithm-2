package com.company.tangxin;

import com.company.shenduyouxian.TreeNode;

public class IsSubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return dfs(A,B) || isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }
    public boolean dfs(TreeNode A, TreeNode B){
        if(A==null && B== null) return  true;
        if(A == null) return false;
        if (B == null) return false;
        return A.val == B.val && dfs(A.left,B.left)&&dfs(A.right,B.right);
    }
}
