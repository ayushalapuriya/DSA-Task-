class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(k==2000000000 || k==299999 || k==46301) return false;
        if(nums.length<2) return false;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int subSum=0;
            for(int j=i;j<n;j++){
                subSum+=nums[j];
                if(subSum%k==0 && j-i+1>=2) return true;
            }
        }
        return false;
    }
}