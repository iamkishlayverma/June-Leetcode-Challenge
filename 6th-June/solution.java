class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int i, len = people.length;
        int resArr[][] = new int[len][2];
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int people1[], int people2[]) {
                if (people1[0] != people2[0]) 
                    return people2[0] - people1[0];
                else 
                    return people1[1] - people2[1];
            }
        });
        ArrayList<int[]> arr = new ArrayList<>();
        for (i=0; i<len; i++) {
            arr.add(people[i][1], people[i]);            
        }
        int arrLen = arr.size();
        for (i=0; i<arrLen; i++) {
            resArr[i][0] = arr.get(i)[0];
            resArr[i][1] = arr.get(i)[1];
        }
        return resArr;
    }
}
