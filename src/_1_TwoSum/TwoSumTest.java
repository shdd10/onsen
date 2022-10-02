package _1_TwoSum;

import org.junit.Assert;
import org.junit.Test;



public class TwoSumTest {
	
	@Test
	public void test() {
		TwoSum twoSum = new TwoSum();
		int[] nums1 = new int[] {2,7,11,15};
		int[] result = twoSum.twoSum(nums1, 9);
		Assert.assertEquals(0, result[0]);
		Assert.assertEquals(1, result[1]);
	}

}
