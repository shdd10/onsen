package _69_Sqrt;

public class Sqrt {

  public int mySqrt(int x) {
    if (x <= 0) {
      return 0;
    }
    int low = 1;
    int high = x;
    while (low <= high) {
      long mid = low + (high - low) / 2;
      if (mid * mid == x) {
        return (int) mid;
      } else if (mid * mid > x) {
        high = (int) mid - 1;
      } else {
        low = (int) mid + 1;
      }
    }
    if (high * high < x) {
      return high;
    } else {
      return low;
    }
  }
}
