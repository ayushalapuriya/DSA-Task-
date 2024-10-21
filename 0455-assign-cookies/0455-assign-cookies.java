class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int count=0;
        int n=s.length;
        int n1=g.length;
        int i=0,j=0;
        while(i<n1 && j<n){
            if(s[j]>=g[i]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}