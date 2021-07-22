//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。 
//
// 说明： 
//
// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？ 
//
// 示例 1: 
//
// 输入: [2,2,1]
//输出: 1
// 
//
// 示例 2: 
//
// 输入: [4,1,2,1,2]
//输出: 4 
// Related Topics 位运算 数组 
// 👍 1930 👎 0

/**
 * @author yitiaoIT
 */
package leetcode.editor.cn;

import java.util.Collection;
import java.util.HashSet;

public class SingleNumber {
    public static void main(String[] args) {
        Solution solution = new SingleNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for (int i = 0; i < nums.length; i++) {
           result =nums[i]^result;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}

/**
 *
 * public int singleNumber(int[] nums) {
 *         HashSet<Object> set = new HashSet<>();
 *         for (int i = 0; i < nums.length; i++) {
 *             if (!set.add(nums[i])) {
 *                 set.remove(nums[i]);
 *             }
 *         }
 *         return (int) set.iterator().next();
 *     }
 * **/