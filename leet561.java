//Given an integer array nums of 2n integers, group these integers into n
// pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for
// all i is maximized. Return the maximized sum.

/*
 * 1. Need to find a way to get optimal pairing.
 * 2. Add the least value of those pairings
 * 3. return the sum
 */

import java.util.Arrays;

public class leet561 {
    public static int arrayPairSum(int[] sums) {
        int total = 0;
            Arrays.sort(sums);
        for (int i = 0; i < sums.length; i += 2) {
            total += sums[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int[] sums = { 6, 2, 6, 5, 1, 2 };
        System.out.println(arrayPairSum(sums));
    }
}
