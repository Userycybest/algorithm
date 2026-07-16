import java.util.Arrays;

public class removeDuplicates_test {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        RemoveDuplicates solution = new RemoveDuplicates();

        int k = solution.removeDuplicates(nums);

        System.out.println("不同元素数量：" + k);
        System.out.println("去重结果：" + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
