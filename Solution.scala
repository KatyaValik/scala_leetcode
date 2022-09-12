object Solution {
  def f(prices: Array[Int], left: Int = 0, right: Int = 1, curr: Int = 0): Int = {
    if (right >= prices.length) curr
    else
      if (prices(left) < prices(right)) f(prices, left, right + 1, math.max(curr, prices(right) - prices(left)))
      else f(prices, right, right + 1, curr)
  }

  def maxProfit(prices: Array[Int]): Int = f(prices)

}

val x = Array(1,2,4,2,5,7,2,4,9,0,9)
Solution.maxProfit(x) //9
