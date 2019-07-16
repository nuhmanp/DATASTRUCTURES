package com.example.demo;

import java.util.Arrays;
import java.util.Collections;

public class LargestArray {

  public static int largest(Integer[] arr) {
    Arrays.sort(arr, Collections.reverseOrder());
    return arr[0];

  }

  public static void main(String[] args) {
    Integer[] arr = new Integer[] {6, 2, 3, 5};

    System.out.println("Largest Array Element " + largest(arr));

  }

}
