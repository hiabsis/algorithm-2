package com.company.shenduyouxian;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root,"");
        return res;
    }
    public List<String> res = new ArrayList<>();
    public void dfs (TreeNode root ,String s){
        if(root == null){
            return;
        }
        if(root.left == null&&root.right == null){
            res.add(s);
            s = s.substring(0,s.length()-1);
            return;
        }
        s += root.val;
        dfs(root.left,s);
        dfs(root.right,s);
        s =s.substring(0,s.length()-1);
    }

    public static void main(String[] args) {
        System.out.printf("1234".substring(0,"1234".length()-1));
    }
}
