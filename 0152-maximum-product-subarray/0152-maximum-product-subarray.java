class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxPro=nums[0];
        int currMax=nums[0];
        int currMin=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<0){
                int temp=currMax;
                currMax=currMin;
                currMin=temp;
            }
            currMax=Math.max(nums[i],currMax*nums[i]);
            currMin=Math.min(nums[i],currMin*nums[i]);
            maxPro=Math.max(maxPro,currMax);
        }
        return maxPro;
    }
}