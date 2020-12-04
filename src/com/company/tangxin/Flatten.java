package com.company.tangxin;

import com.company.shenduyouxian.TreeNode;
import com.sun.jdi.ThreadReference;

public class    Flatten {

    public void flatten(TreeNode root) {
        if (root == null){
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        while (root.right != null)
            root = root.right   ;
        root.right = temp;

    }


}
