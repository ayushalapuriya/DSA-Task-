class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n=prices.length;
        int msum=0;
        int i=0;
        while(i<n-1){
            int sum=prices[i]+prices[i+1];
            if(msum>0) msum=Math.min(msum,sum);
            else msum=sum;
            i++;
        }
        if(msum<=money) return money-msum;
        return money;
    }
}