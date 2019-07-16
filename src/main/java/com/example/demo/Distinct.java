package com.example.demo;

import java.util.Arrays;

public class Distinct {

  public int solution(int[] arr) {
    int n = arr.length;
    if (n == 0)
      return 0;

    Arrays.sort(arr);

    int num = 1;

    int preDist = arr[0];

    for (int i = 0; i < n; i++) {
      if (arr[i] != preDist) {
        preDist = arr[i];
        num++;
      }
    }

    return num;

  }

}
