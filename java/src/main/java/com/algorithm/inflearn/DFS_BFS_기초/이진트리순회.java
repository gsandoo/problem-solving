package com.algorithm.inflearn.DFS_BFS_기초;

public class 이진트리순회 {

    public static class Node{
        int root;
        Node lt;
        Node rt;

        public Node(int num) {
            this.root = num;
            lt = null;
            rt = null;
        }
    }

    public static void dfs (Node root){
        if (root == null ) return;
        else {
            // 전위
            System.out.print(root.root + " ");
            dfs(root.lt);
            // 중위
            System.out.print(root.root + " ");
            dfs(root.rt);
            // 후위
            System.out.print(root.root + " ");
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        dfs(root);
    }
}
