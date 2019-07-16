package com.example.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Optional type declaration
 * 
 * Optional parenthesis around parameter
 * 
 * Optional curly braces
 * 
 * Optional return keyword
 */

public class LambdaMore {


  public static void main(String[] args) {

    // with type declaration
    Addition addition = (int a, int b) -> a + b;

    Predicate<Integer> testObject = (a) -> true;

    // without type declaraton
    Addition subtraction = (int a, int b) -> a - b;

    // with retutn statement with curly bracket
    Addition division = (int a, int b) -> {

      System.out.println("reached");
      return (a / b);
    };


    System.out.println(operate(5, 6, addition));
    System.out.println(operate(5, 6, subtraction));
    System.out.println(operate(5, 6, division));

    System.out.println(addition.operation(5, 7));
    System.out.println(testObject.test(56));

    List<Integer> list = Arrays.asList(4, 5, 6, 7, 8, 9);

    eval(list, n -> true);
    eval(list, n -> n % 2 == 0);
    eval(list, n -> n > 3);


  }

  private static int operate(int a, int b, Addition addition) {
    return addition.operation(a, b);
  }

  private static void eval(List<Integer> list, Predicate<Integer> predicate) {
    list.stream().filter(n -> predicate.test(n)).forEach(System.out::println);
  }

}


interface Addition {
  int operation(int a, int b);
}


interface Greeting {
  void sayMessage(String message);
}


