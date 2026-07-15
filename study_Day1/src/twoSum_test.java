public class twoSum_test {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 8, 12, 5};
        int target = 13;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
