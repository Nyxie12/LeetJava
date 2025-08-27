public class Leet35 {
    public static void main(String[] args)
    {
        int[] nums = {1,3,5};
        int target = 4;
        //If number is in the array
        for (int i = 0; i<nums.length; i++)
        {
            if (nums[i] == target)
            {
                System.out.println(i);
                break;
            }
        }
        //If number is not in the array, return expected position
        for (int i = 0; i<nums.length; i++)
        {
            if (nums[0] > target) {
                System.out.println(i);
                break;
            }

            if (i+1<nums.length && nums[i+1] > target) {
                System.out.println(i+1);
                break;
            }

        }
        System.out.println(nums.length);
    }
}
