package com.example.demo.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Sort using Java 8 vs Java 7
 */

public class Lambda {

  public void sortUsingJava8(List<String> names) {
    Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

  }

  public void sortUsingJava7(List<String> names) {

    Collections.sort(names, new Comparator<String>() {

      @Override
      public int compare(String s1, String s2) {
        // TODO Auto-generated method stub
        return s1.compareTo(s2);
      }

    });

  }

  public static void main(String[] args) {

    List<String> names = Arrays.asList("test", "new", "features");

    Lambda lambda = new Lambda();

    // lambda.sortUsingJava7(names);
    lambda.sortUsingJava8(names);

    names.forEach(name -> System.out.println(name));

  }

}
