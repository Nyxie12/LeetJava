public class Leet283 {
    public static void main(String[] args)
    {
        int[] nums = {0,1,0,3,12};

        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] == 0 && !(i > nums.length)){
                nums[i] = nums[i+1];
                nums[i+1] = 0;
            }
            else if (nums[i+1] == 0) {
                nums[i + 1] = nums[i];
                nums[i] = 0;
            }
            else if(nums[i-1] == 0){
                nums[i-1] = nums[i];
                nums[i] = 0;
            }
        }
        for(int i : nums)
        {
            System.out.println(i);
        }
    }
}
