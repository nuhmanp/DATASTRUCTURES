package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class BinarySearch {

  public static int search(long[] a, long key) {
    int lower = 0;
    int upper = a.length - 1;
    int currIndex;

    while (true) {
      currIndex = (lower + upper) / 2;

      if (a[currIndex] == key)
        return currIndex;
      else if (lower > upper)
        return -1;
      else {
        if (a[currIndex] < key)
          lower = currIndex + 1;
        else
          upper = currIndex - 1;
      }
    }
  }

  public static void main(String[] args) {
    long[] newArr = new long[] {1, 2, 3, 4, 5, 6, 8, 9, 10};
    System.out.println("Searched item found at " + search(newArr, 1) + " index");
  }

}
