class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int low = 0, high = len - 1, mid = 0, temp = 0; 
        while (mid <= high) { 
            switch (nums[mid]) { 
            case 0: { 
                temp = nums[low]; 
                nums[low] = nums[mid]; 
                nums[mid] = temp; 
                low++; 
                mid++; 
                break; 
            } 
            case 1: 
                mid++; 
                break; 
            case 2: { 
                temp = nums[mid]; 
                nums[mid] = nums[high]; 
                nums[high] = temp; 
                high--; 
                break; 
            } 
            } 
        } 
    }
}
