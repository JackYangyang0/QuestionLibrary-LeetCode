package basic.stack;

import java.util.Deque;
import java.util.LinkedList;

public class _2216 {

    public int minDeletion(int[] nums) {
        int ans = 0;
        Deque<Integer> stk = new LinkedList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (stk.size() % 2 == 0 && nums[i] == nums[i + 1]) {
                ans++;
                continue;
            }
            stk.push(nums[i]);
        }

        if (!stk.isEmpty() && stk.peek() == nums[nums.length - 1]) {
            ans++;
        } else {
            stk.push(nums[nums.length - 1]);
        }

        return stk.size() % 2 == 0 ? ans : ans + 1;
    }
}
