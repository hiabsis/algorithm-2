//package com.company.shenduyouxian;
//
//import org.w3c.dom.Node;
//
//import java.util.LinkedList;
//import java.util.List;
//
//public class AllPossibleFBT {
//    public List<TreeNode> allPossibleFBT(int N) {
//        List<TreeNode> ans = new LinkedList<>();
//        if (N%2 == 0){
//            return  ans;
//        }
//        if (N==1){
//            TreeNode head = new TreeNode();
//            head.val = 0;
//            ans.add(head);
//            return ans;
//        }
//        for (int i=1;i<N;i+=2){
//            List<TreeNode> left = allPossibleFBT(i);
//            List<TreeNode> right = allPossibleFBT(N-1-i);
//            for (TreeNode l :left){
//                for (TreeNode r:right){
//                    TreeNode head = new TreeNode();
//                    head.left = l;
//                    head.right = r;
//                    ans.add(head);
//                }
//            }
//        }
//        return  ans;
//    }
//}
