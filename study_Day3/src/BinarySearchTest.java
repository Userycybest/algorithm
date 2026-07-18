public class BinarySearchTest {
    public static void main(String[] args) {
        BinarySearch solution = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};

        printResult(solution.search(nums, 9), 4, "目标值存在");
        printResult(solution.search(nums, 2), -1, "目标值不存在");
        printResult(solution.search(new int[0], 1), -1, "空数组");
    }

    private static void printResult(int actual, int expected, String caseName) {
        System.out.printf("%s：结果=%d，期望=%d，%s%n",
                caseName, actual, expected, actual == expected ? "通过" : "失败");
    }
}
