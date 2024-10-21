class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[]sumLeft=suml(nums);
        int[]sumRight=sumr(nums);
        for(int i=0;i<n;i++){
            if(sumLeft[i]==sumRight[i]) return i;
        }
        return -1;
    }
    public int[] suml(int[]nums){
        int n=nums.length;
        int sum=0;
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sum;
            sum+=nums[i];
        }
        return arr;
    }
    public int[] sumr(int[]nums){
        int n=nums.length;
        int sum=0;
        int[]arr=new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=sum;
            sum+=nums[i];
        }
        return arr;
    }
}