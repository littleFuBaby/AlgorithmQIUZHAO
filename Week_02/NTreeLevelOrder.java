package com.ruoyi.grokking.algorithms.nTree;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class NTreeLevelOrder {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    /**
     * level order of N Tree
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(Node root) {
        return levelOrder(root,null,0);
    }

    public List<List<Integer>> levelOrder(Node root,List<List<Integer>> list,int level) {

        if(list == null){
            list = new ArrayList<>();
        }

        // restrict base case
        if(root == null || level < 0 || list.size() + 1 <= level){
            return list;
        }

        // recursive case
        if(list.size() == level){
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.val);
        for(Node node : root.children){
            levelOrder(node,list,level + 1);
        }

        return list;

    }

}
