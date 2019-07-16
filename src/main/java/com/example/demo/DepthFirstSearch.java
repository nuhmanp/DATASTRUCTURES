package com.example.demo;

import java.util.Stack;

class Nodes {
  int data;
  Nodes left;
  Nodes right;

  public Nodes(int data) {
    this.data = data;
  }

}


public class DepthFirstSearch {

  public void DFS(Nodes root) {
    Stack<Nodes> stack = new Stack<>();
    stack.add(root);

    while (stack.isEmpty() == false) {
      Nodes poped = stack.pop();

      if (poped.right != null)
        stack.add(poped.right);
      if (poped.left != null)
        stack.add(poped.left);

      System.out.println(" " + poped.data);
    }
  }

  public static void main(String[] args) {

    Nodes root = new Nodes(1);
    root.left = new Nodes(2);
    root.left.left = new Nodes(4);
    root.left.right = new Nodes(5);
    root.right = new Nodes(3);
    root.right.left = new Nodes(6);
    root.right.right = new Nodes(7);

    DepthFirstSearch depthFirstSearch = new DepthFirstSearch();

    System.out.println("DFS ");
    depthFirstSearch.DFS(root);


  }

}
