class Solution {
    public int longestMountain(int[] arr) {
        int n=arr.length;
        int count=0;
        int ans=0;
        for(int i=1;i<n-1;){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                count=1;
                int j=i;
                while(j>0 && arr[j]>arr[j-1]){
                    count++;
                    j--;
                }
                while(i<n-1 && arr[i]>arr[i+1]){
                    count++;
                    i++;
                }
            }
            else i++;
            ans=Math.max(ans,count);
        }
        return ans;
    }
}