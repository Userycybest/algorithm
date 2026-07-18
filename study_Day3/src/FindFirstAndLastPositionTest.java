import java.util.Arrays;

public class FindFirstAndLastPositionTest {
    public static void main(String[] args) {
        FindFirstAndLastPosition solution = new FindFirstAndLastPosition();

        printResult(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8),
                new int[]{3, 4}, "目标值出现多次");
        printResult(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6),
                new int[]{-1, -1}, "目标值不存在");
        printResult(solution.searchRange(new int[]{2, 2}, 2),
                new int[]{0, 1}, "目标值占满数组");
        printResult(solution.searchRange(new int[0], 1),
                new int[]{-1, -1}, "空数组");
    }

    private static void printResult(int[] actual, int[] expected, String caseName) {
        System.out.printf("%s：结果=%s，期望=%s，%s%n",
                caseName,
                Arrays.toString(actual),
                Arrays.toString(expected),
                Arrays.equals(actual, expected) ? "通过" : "失败");
    }
}
