class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxCapacity=0;
        while(left<right){
            int minHeight=Math.min(height[left],height[right]);
            int area=minHeight*(right-left);
            maxCapacity=Math.max(maxCapacity,area);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return maxCapacity;
    }
}