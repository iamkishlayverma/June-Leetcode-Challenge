class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int len = costs.length;
        int i = 0, j = len - 1, result = 0;
        Arrays.sort(costs, (c1, c2) -> {
            return (c1[0] - c1[1]) - (c2[0] - c2[1]);
        });
        while (i < j) {
            result = result + costs[i++][0] + costs[j--][1];
        }
        return result;
    }
}
