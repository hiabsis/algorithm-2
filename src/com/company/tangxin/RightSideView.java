package com.company.tangxin;

import com.company.shenduyouxian.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        List<Integer> res = new LinkedList<>();
        if ( root == null)
             return  res;
        queue.offer(root);
        while (!queue.isEmpty()){
            int count = queue.size();
            for (int i=0;i<count-1;i++){
                TreeNode cur = queue.poll();
                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
            }
            res.add(queue.poll().val);
        }
        return res;
    }


}
