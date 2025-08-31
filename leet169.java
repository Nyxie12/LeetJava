//Given an array "nums" of size "n" return the majority element
//The majority element is the elements that appears MORE than n/2 times. You may
//assume that the majority element always exists

//Need to iterate through the array - for loop
//Element count n < commonElement

public class leet169 {
    public static int Majority(int[] nums){
        int n = nums.length/2;
        int counter = 1;



        for (int i = 0; i<nums.length; i++) {
            for (int j = 1; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    counter++;
                }
            }
            if (counter > n){
                return nums[i];
            }
            counter = 1;
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(Majority(new int[]{2,2,1,1,1,2,2}));


        //
    }
}
