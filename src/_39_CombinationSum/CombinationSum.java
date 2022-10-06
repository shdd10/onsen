package _39_CombinationSum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    if (candidates == null || candidates.length == 0) {
      return res;
    }
    backtracking(candidates, target, res, new ArrayList<Integer>(), 0);
    return res;

  }

  private void backtracking(int[] candidates, int target, List<List<Integer>> res,
      List<Integer> path, int start) {
    if (target < 0) {
      return;
    }
    if (target == 0) {
      res.add(new ArrayList<>(path));
      return;
    }
    for (int i = start; i < candidates.length; i++) {
      path.add(candidates[i]);
      backtracking(candidates, target - candidates[i], res, path, i);
      path.remove(path.size() - 1);
    }
  }

}
