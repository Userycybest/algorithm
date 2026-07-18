/**
 * 题目：标准二分查找
 *
 * 给定一个按升序排列且元素不重复的整数数组 nums 和目标值 target，
 * 如果目标值存在，返回它的下标；否则返回 -1。
 *
 * 时间复杂度：O(log n)，空间复杂度：O(1)
 */
public class BinarySearch {

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        // 搜索区间是闭区间 [left, right]。
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // 这种写法可以避免 left + right 可能产生的整数溢出。
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
