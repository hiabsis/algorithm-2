package com.company.tangxin;

import com.company.shenduyouxian.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> ans = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return ans;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> cur = new LinkedList<>();
            int count = queue.size();
            for(int i = 0;i<count;i++){
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
                cur.add(node.val);
            }
            ans.addFirst(cur);
        }
        return  ans;
    }
}
