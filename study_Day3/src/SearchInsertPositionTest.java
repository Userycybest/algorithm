public class SearchInsertPositionTest {
    public static void main(String[] args) {
        SearchInsertPosition solution = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};

        printResult(solution.searchInsert(nums, 5), 2, "目标值存在");
        printResult(solution.searchInsert(nums, 2), 1, "插入到数组中间");
        printResult(solution.searchInsert(nums, 7), 4, "插入到数组末尾");
        printResult(solution.searchInsert(nums, 0), 0, "插入到数组开头");
    }

    private static void printResult(int actual, int expected, String caseName) {
        System.out.printf("%s：结果=%d，期望=%d，%s%n",
                caseName, actual, expected, actual == expected ? "通过" : "失败");
    }
}
