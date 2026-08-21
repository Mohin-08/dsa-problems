class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int r[]=new int[n+1];
        r[0]=first;
        for(int i=0;i<n;i++){
            r[i+1]=encoded[i]^r[i];
        }
        return r;
    }
}