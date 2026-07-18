/**
 * 题目：搜索插入位置
 *
 * 给定一个升序且无重复元素的数组 nums 和目标值 target：
 * 如果 target 存在，返回它的下标；否则返回它按顺序插入时的位置。
 *
 * 本质：查找第一个大于或等于 target 的位置。
 * 时间复杂度：O(log n)，空间复杂度：O(1)
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // 搜索区间采用左闭右开区间 [left, right)。
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                // nums[mid] 可能就是答案，不能把 mid 排除。
                right = mid;
            }
        }

        // left == right，表示第一个大于或等于 target 的位置。
        return left;
    }
}
