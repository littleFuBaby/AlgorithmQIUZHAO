package com.ruoyi.grokking.algorithms.nTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BTreeInOrder {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * list for method 1
     */
    private List<Integer> list = new LinkedList<>();

    /**
     * method 1 By using recursion
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal1(TreeNode root){
        // base case
        if(root == null)
            return list;

        // recursive case
        inorderTraversal1(root.left);
        list.add(root.val);
        inorderTraversal1(root.right);

        return list;
    }

    /**
     * method 2 with stack
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal2(TreeNode root){
        LinkedList<Integer> list = new LinkedList<>();
        if(root == null)
            return list;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode treeNode = root;
        // stack
        while (treeNode != null || !stack.isEmpty()){
            while (treeNode != null){
                stack.push(treeNode);
                treeNode = treeNode.left;
            }
            treeNode = stack.pop();
            list.add(treeNode.val);
            treeNode = treeNode.right;
        }

        return list;
    }

}
