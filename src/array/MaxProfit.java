
public class MaxProfit {
    public static int maxProfit(int[] prices) {
        //[1,2,3,4,5,4,3,2,1,2,3,4,5,6]
        if(prices.length == 1) {
            return 0;
        }
        boolean trend ; // 1 - increasing,  0 - decreasing
        int trendStartValue = prices[0], trendEndValue = -1;
        trend = prices[1] > prices[0] ? true : false;
        int profit = 0;
        for (int i=1; i<prices.length; i++) {
            if (prices[i] > prices[i-1] && trend == false) {
                trendEndValue = prices[i-1];
//                if(profit != 0)
//                    profit += trendStartValue - trendEndValue;
                trend = true;
                trendStartValue = trendEndValue;
            }
            else if (prices[i] < prices[i-1] && trend == true) {
                trendEndValue = prices[i-1];
                profit += trendEndValue - trendStartValue;
                trend = false;
                trendStartValue = trendEndValue;
            }
        }
        if (trend==true)
        	profit += prices[prices.length-1] - trendStartValue;
        System.out.println(profit);
        return profit;
    }
    
	public static void main(String[] args) {
		int[] arr = new int[] {6,1,3,2,4,7};
		maxProfit(arr);	
	}
}
