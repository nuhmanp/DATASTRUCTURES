package com.example.demo;

// 0, 1, 1, 2, 3;

public class FibnocciTest {

  int n1 = 0, n2 = 1, n3;

  public void findFibnocci(int n) {
    if (n1 == 0) {
      System.out.print(n1);
      System.out.print(n2);
    }
    if (n <= 0) {
      return;
    }
    n3 = n2;
    n2 = n1 + n2;
    n1 = n3;

    System.out.print(n2);
    findFibnocci(n - 1);

  }

  public static void main(String[] args) {
    int n = 5;
    new FibnocciTest().findFibnocci(n - 2);

    String test = "";
    switch (test) {
      case "":
        break;

    }
  }

}
