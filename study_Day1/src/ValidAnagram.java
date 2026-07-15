import java.util.HashMap;
import java.util.Map;

/**
 * 题目：有效的字母异位词
 *
 * 给定两个字符串 s 和 t，判断 t 是否是 s 的字母异位词。
 *
 * 字母异位词是指：两个字符串中的字母种类相同，并且每个字母出现的次数也相同，
 * 但是字母的排列顺序可以不同。
 *
 * 示例一：
 * 输入：s = "anagram"，t = "nagaram"
 * 输出：true
 * 解释：两个字符串都包含 3 个 a、1 个 n、1 个 g、1 个 r 和 1 个 m。
 *
 * 示例二：
 * 输入：s = "rat"，t = "car"
 * 输出：false
 * 解释：s 中包含字母 t，而 t 中包含字母 c，两个字符串的字母不同。
 *
 * 提示：
 * 1. 如果两个字符串的长度不同，它们一定不是字母异位词。
 * 2. 可以使用 HashMap<Character, Integer> 统计 s 中每个字母出现的次数。
 * 3. 遍历 t 时，将对应字母的次数减一。
 * 4. 如果 t 中出现了没有记录的字母，或者某个字母的次数不够，则返回 false。
 *
 * 目标时间复杂度：O(n)
 * 目标空间复杂度：O(k)，k 表示不同字符的数量。
 */
public class ValidAnagram {

    /**
     * 判断字符串 t 是否是字符串 s 的字母异位词。
     *
     * @param s 第一个字符串
     * @param t 第二个字符串
     * @return 如果二者互为字母异位词，返回 true；否则返回 false
     */
    public boolean isAnagram(String s, String t) {
        // 长度不同，包含的字符数量一定不同，不可能互为字母异位词。
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> countMap = new HashMap<>();
        // 统计字符串 s 中每个字符出现的次数。
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        // 使用字符串 t 中的字符抵消对应的次数。
        for (char c : t.toCharArray()) {
            if (!countMap.containsKey(c)) {
                return false;
            }
            countMap.put(c, countMap.get(c) - 1);
            if (countMap.get(c) < 0) {
                return false;
            }
        }
        // 每个字符的次数都必须刚好被抵消为 0。
        for (int count : countMap.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
