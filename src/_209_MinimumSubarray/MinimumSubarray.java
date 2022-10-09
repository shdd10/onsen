package _209_MinimumSubarray;

public class MinimumSubarray {

  public int minSubArrayLen(int target, int[] nums) {
    int res = Integer.MAX_VALUE;
    int left = 0, sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      while (sum >= target && left <= i) {
        res = Integer.min(res, i - left + 1);
        sum -= nums[left++];
      }
    }
    return res == Integer.MAX_VALUE ? 0 : res;
  }

}
