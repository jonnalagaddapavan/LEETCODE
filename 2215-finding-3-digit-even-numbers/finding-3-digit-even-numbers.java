import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        TreeSet<Integer> set = new TreeSet<>();

        int n = digits.length;

        // Try all 3-digit combinations
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue; // Skip leading 0

            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (num % 2 == 0) {
                        set.add(num);
                    }
                }
            }
        }

        // Convert TreeSet to int[]
        int[] result = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            result[idx++] = num;
        }

        return result;
    }
}
