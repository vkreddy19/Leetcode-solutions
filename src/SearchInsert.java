public class SearchInsert {


    public static int searchInsert(int[] nums, int target) {
        int pos = 0;
        while (pos < nums.length && nums[pos] < target) {
            pos++;
        }
        if (pos < nums.length && nums[pos] == target) {
            return pos;
        } else {
            return pos;
        }
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1}, 0));
    }
}
