public class BinarySearch {
    public int search(int[] nums, int target) {
        int mid = nums.length / 2;
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
            mid = (l + r) / 2;
        }
        return -1;
    }
}

