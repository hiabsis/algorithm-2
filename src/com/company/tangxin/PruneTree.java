package com.company.tangxin;

import com.company.shenduyouxian.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class PruneTree {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) return  null;
        pruneTree(root.left);
        pruneTree(root.right);
        if (root.left == null && root.right==null && root.val==0){
            return  null;
        }
        return root;
    }

//        Queue<TreeNode> queue = new LinkedList<>();
//        if (root == null) return  null;
//        queue.offer(root);
//        TreeNode res = null;
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            for(int i=0;i<size;i++){
//                TreeNode cur = queue.poll();
//                if (cur.left.val != 0 ||cur.right.val != 0){
//
//                }
//            }
//        }
//    }


}
