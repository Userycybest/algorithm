/**
 * 题目：在排序数组中查找元素的第一个和最后一个位置
 *
 * 给定一个按非递减顺序排列的整数数组 nums 和目标值 target，
 * 返回 target 在数组中的开始位置和结束位置；如果不存在，返回 [-1, -1]。
 *
 * 时间复杂度：O(log n)，空间复杂度：O(1)
 */
public class FindFirstAndLastPosition {

    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }

        int first = lowerBound(nums, target);

        // lowerBound 返回的是插入位置，需要再次确认该位置确实等于 target。
        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }

        int last = upperBound(nums, target) - 1;
        return new int[]{first, last};
    }

    /** 查找第一个大于或等于 target 的位置。 */
    private int lowerBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    /** 查找第一个严格大于 target 的位置。 */
    private int upperBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
