package com.company.shenduyouxian;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilar {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
          String s1 = "";
          String s2 = "";
        dfs(root1,s1);
        dfs(root2,s2);
        System.out.printf(s1+" 2"+s2);
        return s1.equals(s2);
    }

    public  void dfs(TreeNode root ,String s) {
        if (root.left == null && root.right == null){
           s+= + root.val;
           return;
        }
        if(root.left != null){
            dfs(root.left,s);
        }
        if (root.right != null){
            dfs(root.right,s);
        }

    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode();
        TreeNode root2 = new TreeNode();
        root1.val = 1;
        root2.val = 2;
        LeafSimilar leafSimilar = new LeafSimilar();
        System.out.printf(""+leafSimilar.leafSimilar(root1,root2));
    }


//    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
//        List<Integer> arr1 = new ArrayList<>();
//        List<Integer> arr2 = new ArrayList<>();
//        getLeaf(root1,arr1);
//        getLeaf(root2,arr2);
//        if(arr1.size() != arr2.size()){
//            return  false;
//        }
//        boolean flag = true;
//        for(int i=0;i<arr1.size();i++){
//            if(arr1.get(i)!=arr2.get(i)) flag = false;
//        }
//        return flag;
//    }
//    public void getLeaf(TreeNode root, List<Integer> arr){
//        if(root.left == null && root.right == null){
//            arr.add(root.val);
//        }
//        getLeaf(root.left,arr);
//        getLeaf(root.right,arr);
//    }
}
