package com.company.tangxin;

import com.company.shenduyouxian.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LcaDeepestLeaves {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        if (root == null){
            return null;
        }
        TreeNode res = null;
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();

        }
        return null;
    }
}
