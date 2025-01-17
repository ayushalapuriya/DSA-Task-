class Solution {
    public int maxFrequencyElements(int[]arr) {
        int[]frequency=new int[101];
        for(int num:arr){
            frequency[num]++;
        }
        int maxFrequency=0;
        for(int freq:frequency){
            maxFrequency=Math.max(maxFrequency,freq);
        }
        int count=0;
        for(int freq:frequency){
            if(freq==maxFrequency) count+=maxFrequency;
        }
        return count;
    }
}