import java.util.*;

// Find first positive number
class LeetCode41 {
    public int firstMissingPositive(int[] nums) {
        Map<Integer, Boolean> mp = new TreeMap<>();

        for (int num : nums) {
            if (num > 0) {
                mp.put(num, true);
            }
        }

        int i = 1;
        while (true) {
            if (!mp.containsKey(i)) {
                return i;
            }
            i++;
        }
    }
}
