package _349_IntersectionTwoArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArrays {

  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set = new HashSet<>();
    for (int i : nums1) {
      set.add(i);
    }

    Set<Integer> intersection = new HashSet<Integer>();
    for (int j : nums2) {
      if (set.contains(j)) {
        intersection.add(j);
      }
    }
    int[] res = new int[intersection.size()];
    int index = 0;
    for (int num : intersection) {
      res[index++] = num;
    }
    return res;
  }

  public int[] intersection2(int[] nums1, int[] nums2) {
    // we select elements from array A[] and linearly search for them in array B[]. We could
    // increase the efficiency of searching the elements if we sort B[] and apply binary search to
    // search for the elements. Binary Search takes O(logn) time complexity.
    if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
      return new int[] {};
    }
    Set<Integer> intersection = new HashSet<Integer>();
    Arrays.sort(nums2);
    for (int num : nums1) {
      if (binarySearch(num, nums2)) {
        intersection.add(num);
      }
    }

    int[] res = new int[intersection.size()];
    int index = 0;
    for (int num : intersection) {
      res[index++] = num;
    }
    return res;
  }

  private boolean binarySearch(int target, int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        return true;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return false;
  }

}
