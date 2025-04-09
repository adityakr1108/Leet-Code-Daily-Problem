import java.util.*;
public class LeetCode3375{
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[0];
        if(min < k) return -1;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > k){
                count++;
            }
            while(i+1 < nums.length && nums[i] == nums[i+1]){
                i++;
            }

        }
        return count ;
    }
}

// @nd Approach using HashSet

    public int minOperations(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if( nums[i] < k){
                return -1;
            }
            else if(nums[i] > k){
                st.add(nums[i]);
            }
        }
        return st.size();
    }

