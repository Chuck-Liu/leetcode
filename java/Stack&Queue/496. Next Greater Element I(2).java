import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int res[] = new int[findNums.length];
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            while(!stack.empty() && i > stack.peek()) {
                map.put(stack.pop(), i);
            }
            stack.push(i);
        }
        for(int i = 0; i < findNums.length; i++) {
            res[i] = map.getOrDefault(findNums[i], -1);
        }
        return res;

    }
}
