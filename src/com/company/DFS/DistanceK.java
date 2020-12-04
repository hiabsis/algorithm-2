package com.company.DFS;

import com.sun.jdi.ThreadReference;

import java.util.*;

public class DistanceK {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> res = new ArrayList<>();
        Map<TreeNode ,TreeNode> parent = new HashMap<>();
        map(root,parent);
        boolean[]  visited = new boolean[501];
        search(target,K,res,visited,parent);
        return res;
    }
    public void search(TreeNode target,int K,List<Integer> res,boolean[] visited,Map<TreeNode,TreeNode> map){
        if (target == null || K<0||visited[target.val]) return;
        if (K==0&&visited[target.val]){
            res.add(target.val);
            visited[target.val] = true;
            return;
        }
        visited[target.val] = true;
        search(target.left,K-1,res,visited,map);
        search(target.right,K-1,res,visited,map);
        search(map.get(target),K-1,res,visited,map);

    }
    public void map(TreeNode root,Map<TreeNode,TreeNode> parent){
        if (root == null) return;
        if (root.left != null) parent.put(root.left,root);
        if (root.right != null) parent.put(root.right,root);
        map(root.left,parent);
        map(root.right,parent);
    }




//    Map<TreeNode,TreeNode> parent ;
//    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
//        parent = new HashMap<>();
//        dfs(root,null);
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(null);
//        queue.add(target);
//        Set<TreeNode> seen = new HashSet<>();
//        seen.add(target);
//        seen.add(null);
//        int dist = 0;
//        while (!queue.isEmpty()){
//            TreeNode node = queue.poll();
//            if(node == null){
//                if (dist == K){
//                    List<Integer > ans = new ArrayList<>();
//                    for (TreeNode n:queue)
//                        ans.add(n.val);
//                    return ans;
//                }
//                queue.offer(null);
//                dist++;
//            }else {
//                if (!seen.contains(node.left)){
//                    seen.add(node.left);
//                    queue.offer(node.left);
//                }
//                if (!seen.contains(node.right)){
//                    seen.add(node.right);
//                    queue.offer(node.right);
//                }
//                TreeNode par = parent.get(node);
//                if (!seen.contains(par)){
//                    seen.add(par);
//                    queue.offer(par);
//                }
//
//            }
//        }
//        return new ArrayList<Integer>();
//    }
//
//
//    public void dfs(TreeNode node,TreeNode par){
//        if (node != null){
//            parent.put(node,par);
//            dfs(node.left,node);
//            dfs(node.right,node);
//        }
//    }

}
