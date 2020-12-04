package com.company.shenduyouxian;

public class isBalanced {
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return isFlag;
    }
    boolean isFlag = true;
    public int dfs(TreeNode root){
        if (root == null)  return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        if(Math.abs(left-right)>1){
            isFlag = false;
        }
        return Math.max(left,right);

    }

//    public boolean isBalanced(TreeNode root) {
//            return  root == null ||Math.abs(depth(root.left) - depth(root.right) )< 2&&isBalanced(root)&&isBalanced(root.right);
//    }
//    public  int depth(TreeNode root){
//        return root == null?0:Math.max(depth(root.left),depth(root.right));
//    }

}
