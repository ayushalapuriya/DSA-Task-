class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        int[]freq=new int[100001];
        int max=0;
        int sum=0;
        int j=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            freq[nums[i]]++;
            while(freq[nums[i]]>1){
                freq[nums[j]]--;
                sum-=nums[j];
                j++;
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}