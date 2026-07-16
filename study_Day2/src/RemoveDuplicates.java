/**
 * 题目：删除有序数组中的重复项
 *
 * 给定一个按非递减顺序排列的整数数组 nums，请原地删除重复元素，
 * 使每个元素只出现一次，并返回数组中不同元素的数量 k。
 * 完成后，nums 的前 k 个位置保存去重后的结果。
 *
 * 示例：nums = [1, 1, 2, 2, 3]
 * 输出：k = 3，nums 的前 3 项为 [1, 2, 3]
 *
 * 时间复杂度：O(n)，空间复杂度：O(1)
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // slow 指向已经去重区域的最后一个元素。
        int slow = 0;
        // fast 负责寻找与 nums[slow] 不同的新元素。
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
        // slow 是下标，所以不同元素的数量需要加 1。
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1; // 返回不同元素的数量
    }
}
