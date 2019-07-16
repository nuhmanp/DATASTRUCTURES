package com.example.demo.array;

public class MaximumArray {

  public static int contigousArraySum(int[] nums) {
    int res = nums[0];
    int sum = nums[0];

    for (int i = 0; i < nums.length; i++) {
      sum = Math.max(nums[i], sum + nums[i]);
      res = Math.max(res, sum);
    }
    return res;
  }

  public static void main(String[] args) {

    System.out.println("Contigous array sum" + contigousArraySum(new int[] {-2, 4, 5, -6, 7, -9}));

  }

}
