class Solution {
    public List<String> commonChars(String[] words) {
        int n=words.length;
        List<String> list=new ArrayList<>();
        int[]freq=count(words[0]);
        for(int i=1;i<n;i++){
            int[]temp=count(words[i]);
            freq=comman(freq,temp);
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                char c=(char)('a'+i);
                String s=String.valueOf(c);
                while(freq[i]>0){
                    list.add(s);
                    freq[i]--;
                }
            }
        }
        return list;
    }
    public int[] count(String s){
        int[]a=new int[26];
        for(char c:s.toCharArray()) a[c-'a']++;
        return a;
    }
    public int[] comman(int[]a,int[]b){
        int[]c=new int[26];
        for(int i=0;i<26;i++) c[i]=Math.min(a[i],b[i]);
        return c;
    }
}