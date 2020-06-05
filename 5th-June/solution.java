class Solution {

    int cummulativeSum[];
    int totalSum;

    public Solution(int[] w) {
        int i, len = w.length;
        cummulativeSum = new int[len];   
        for (i=0; i<len; i++) {
            totalSum = totalSum + w[i];
            cummulativeSum[i] = totalSum; 
        }
    }

    public int pickIndex() {
        Random random = new Random();
        int r = random.nextInt(totalSum) + 1;
        int start = 0;
        int end = cummulativeSum.length - 1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (cummulativeSum[mid]==r) {
                return mid;
            } else if (cummulativeSum[mid]>r) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
