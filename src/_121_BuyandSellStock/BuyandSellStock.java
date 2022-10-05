package _121_BuyandSellStock;

public class BuyandSellStock {

  public int maxProfit(int[] prices) {
    int profit = 0;
    int min = prices[0];
    for (int price : prices) {
      min = Math.min(price, min);
      profit = Math.max(profit, price - min);
    }
    return profit;
  }

}
