package _131_PalindromePartitioning;


import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

  public List<List<String>> partition(String s) {

    List<List<String>> res = new ArrayList<>();
    backtracking(s, res, new ArrayList<String>(), 0);
    return res;
  }

  private void backtracking(String s, List<List<String>> res, List<String> path, int start) {
    if (start >= s.length()) {
      res.add(new ArrayList<>(path));
    }
    for (int i = start; i < s.length(); i++) {
      String cur = s.substring(start, i + 1);
      if (isPalindrome(cur)) {
        path.add(cur);
      } else {
        continue;
      }
      backtracking(s, res, path, i + 1);
      path.remove(path.size() - 1);
    }

  }

  private boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;
    while (left < right) {
      if (s.charAt(left++) != s.charAt(right--)) {
        return false;
      }
    }
    return true;
  }

}
