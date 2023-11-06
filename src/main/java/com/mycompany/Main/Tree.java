package com.mycompany.main;

public class Tree{
    int value;
    Tree left;
    Tree right;
    public Tree(int value, Tree left, Tree right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public int RecSumTree(){
        int sum = value;
        if(left != null) sum += left.RecSumTree();
        if(right != null) sum += right.RecSumTree();
        return sum;
    }
}