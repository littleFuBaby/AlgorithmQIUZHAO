package com.ruoyi.grokking.algorithms.nTree;

import java.util.*;

public class NTreePreOrder {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    /**
     * list for recursive method
     */
    private List<Integer> nodeValList = new LinkedList<>();

    /**
     * method 1 By using recursion
     * @return
     */
    public List<Integer> preorder1(Node root){

        // base case
        if (root == null){
            return nodeValList;
        }

        // recursive case
        for(Node node : root.children){
            preorder1(node);
        }

        // previous order
        nodeValList.add(root.val);
        return nodeValList;
    }

    /**
     * method 2 By using iterating
     * @param root
     * @return
     */
    public List<Integer> preorder2(Node root){

        LinkedList<Integer> list = new LinkedList<>();
        // check
        if (root == null){
            return list;
        }

        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.add(root);
        // iterate
        while (!deque.isEmpty()){
            Node node = deque.pollLast();
            list.add(node.val);
            // reverse children node
            Collections.reverse(node.children);
            for(Node n : node.children){
                deque.add(n);
            }
        }

        return list;
    }

}
