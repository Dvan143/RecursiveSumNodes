package com.mycompany.main;

public class Main{
    public static void main(String[] args){
        Tree root = new Tree(7, new Tree(5, new Tree(3, null, null), new Tree(6, null,null)), new Tree(9, new Tree(8, null, null), new Tree(10, null,new Tree(152, null, null))));
        System.out.println(root.RecSumTree());
        //System.out.println(root.StackSum(root));
    }
}