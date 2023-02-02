class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices)<0:
            return 0
        maxp=0
        a=prices[0]
        for i in range(1,len(prices)):
                a=min(a,prices[i])
                maxp=max(maxp,prices[i]-a)
        return maxp
