package com.ruoyi.grokking.algorithms.nTree;

import java.util.LinkedList;
import java.util.List;

public class TwoTreePreOrder {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * method 1
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal1(TreeNode root) {
        return preorderTraversal(root, null);
    }

    public List<Integer> preorderTraversal(TreeNode root, List<Integer> list) {
        if (list == null) {
            list = new LinkedList<>();
        }

        // base case
        if (root == null)
            return list;

        // recursive case
        list.add(root.val);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);

        return list;
    }

    /**
     * method 2 with iteration
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal2(TreeNode root){

        LinkedList<Integer> list = new LinkedList<>();
        if (root == null)
            return list;

        LinkedList<TreeNode> treeNodeList = new LinkedList<>();
        treeNodeList.add(root);

        while (!treeNodeList.isEmpty()){
            TreeNode treeNode = treeNodeList.pollLast();
            list.add(treeNode.val);

            if (treeNode.right != null)
                treeNodeList.add(treeNode.right);
            if (treeNode.left != null)
                treeNodeList.add(treeNode.left);
        }

        return list;
    }

}
