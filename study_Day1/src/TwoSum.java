import java.util.HashMap;
import java.util.Map;

/**
 * 题目：两数之和
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，请在数组中找出和为
 * target 的两个整数，并返回它们的数组下标。
 *
 * 假设：
 * 1. 每组输入只对应一个答案。
 * 2. 同一个元素不能重复使用。
 *
 * 示例：
 * 输入：nums = [3, 8, 12, 5]，target = 13
 * 输出：[1, 3]
 * 解释：nums[1] + nums[3] = 8 + 5 = 13。
 *
 * 要求：使用 HashMap，将时间复杂度控制在 O(n)。
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // TODO：请在这里完成代码
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement

                ), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
