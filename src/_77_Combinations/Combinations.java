package _77_Combinations;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> res = new ArrayList<>();
    backtracking(n, k, 1, res, new ArrayList<Integer>());
    return res;

  }

  private void backtracking(int n, int k, int start, List<List<Integer>> res, List<Integer> path) {
    if (path.size() == k) {
      res.add(new ArrayList<>(path));
      return;
    }
    for (int i = start; i <= n; i++) {
      path.add(i);
      backtracking(n, k, i + 1, res, path);
      path.remove(path.size() - 1);
    }
  }
}
