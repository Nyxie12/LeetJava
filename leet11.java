/*
Need to find the max amount of water that can be held

BRUTE FORCE
    check with the first unit and compare with the rest to see what the area is
        Multiply the height and the width
        Keeps updating the result variable if the answer is higher than what is already there

 */

public class leet11 {

    public static int maxArea(int[] height){
        int res = 0;
        int pointer_a = 0;
        int pointer_b = height.length-1;

        while (pointer_a < pointer_b){
            if (height[pointer_a] < height[pointer_b]) {
                res = Math.max(res, height[pointer_a] * (pointer_b-pointer_a));
                pointer_a++;
            } else {
                res = Math.max(res, height[pointer_b] * (pointer_b-pointer_a));
                pointer_b--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
