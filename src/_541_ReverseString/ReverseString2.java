package _541_ReverseString;

public class ReverseString2 {

  public String reverseStr(String s, int k) {
    char[] arr = s.toCharArray();
    int i = 0;
    while (i < s.length()) {
      int j = Math.min(i + k - 1, s.length() - 1);
      swap(arr, i, j);
      i += 2 * k;
    }
    return String.valueOf(arr);
  }

  private void swap(char[] arr, int i, int j) {
    while (i < j) {
      char temp = arr[i];
      arr[i++] = arr[j];
      arr[j--] = temp;
    }
  }

}
