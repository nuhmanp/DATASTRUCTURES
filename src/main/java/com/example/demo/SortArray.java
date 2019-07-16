package com.example.demo;

public class SortArray {

  public static int[] mergeSortedArray(int[] arr1, int[] arr2) {
    int len1 = arr1.length;
    int len2 = arr2.length;
    int[] merged = new int[len1 + len2];
    int i = 0, j = 0, k = 0;

    while (i < len1 && j < len2) {
      if (arr1[i] > arr2[j])
        merged[k++] = arr1[i++];
      else
        merged[k++] = arr2[j++];
    }

    while (i < len1)
      merged[k++] = arr1[i++];

    while (j < len2)
      merged[k++] = arr2[j++];

    return merged;

  }

  public static void main(String[] args) {
    int[] arr1 = {200, 75, 12, 5, 2, 0};

    int[] arr2 = {123, 3, 2, 1, 0};

    int[] res = mergeSortedArray(arr1, arr2);

    for (int x = 0; x < res.length; x++)
      System.out.print(res[x] + " ");

  }


}
