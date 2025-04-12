import java.util.Arrays;

class LongConsecutiveSeq {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);

        int longestSequence = 1;
        int currentSequence = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                currentSequence++;
            }
            else if (nums[i] != nums[i - 1]) {
                currentSequence = 1;
            }
            longestSequence = Math.max(longestSequence, currentSequence);
        }

        return longestSequence;
    }
}

