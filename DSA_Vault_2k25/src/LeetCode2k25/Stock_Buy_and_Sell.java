/**
 * 
 */
package DSA_Vault_2k25.src.LeetCode2k25;

/**
 * 
 * Best time to buy and sell stock

We are given an array Arr[] of length n. It represents the price of a stock on �n� days. The following guidelines need to be followed:

We can buy and sell a stock only once.
We can buy and sell the stock on any day but to sell the stock, we need to first buy it on the same or any previous day.
We need to tell the maximum profit one can get by buying and selling this stock.
 * @author Aritra
 *
 */
public class Stock_Buy_and_Sell {
	
	public static void main(String[]args) {
		int [] arr= {7,1,5,3,6,9};
		System.out.println("Max Profit: "+maxProfit(arr));
	}
	
	public static int maxProfit(int [] arr) {
		int maxDiff=0;
		int currentPrice=arr[0];
		for(int i=1;i<arr.length;i++) {
		if((arr[i]-currentPrice)>maxDiff) // or instead of the if we can simply use maxDiff=Math.max(maxDiff,(arr[i]-currentPrice));
			maxDiff=arr[i]-currentPrice;
		currentPrice=Math.min(currentPrice,arr[i]);
		}
		
		return maxDiff;
	}

}
