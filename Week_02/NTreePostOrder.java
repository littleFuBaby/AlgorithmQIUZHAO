package com.ruoyi.grokking.algorithms.nTree;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class NTreePostOrder {

    class Node{

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
     * private node val list for postorder method
     */
    private List<Integer> nodeValList = new LinkedList<>();

    /**
     * method 1
     * post order of n tree
     * @param root
     * @return
     */
    public List<Integer> postorder1(Node root){

        // note : there exists a bug for this algorithm

        // base case
        if(root == null){
            return nodeValList;
        }

        // recursive case
        if(root.children != null){
            Iterator<Node> iter = root.children.iterator();
            while(iter.hasNext()){
                Node node = iter.next();
                postorder1(node);
            }
        }

        // post order
        nodeValList.add(root.val);
        return nodeValList;
    }

    /**
     * method 2
     * iterator
     * @return
     */
    public List<Integer> postorder2(Node root) {
        LinkedList<Integer> list = new LinkedList<>();
        if (root == null){
            return list;
        }
        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node node = queue.pollLast();
            list.addFirst(node.val);
            for(Node n : node.children){
                queue.addLast(n);
            }
        }
        return list;
    }
}
