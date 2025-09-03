//Given a integer array "nums" sorted in non-decreasing order remove duplicates in place
//such that unique elements only appear once.

import java.util.ArrayList;

public class leet26 {
    public static int removeDuplicates(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<nums.length; i++){
            if (!(list.contains(nums[i]))){
                list.add(nums[i]);
            }
        }
        return list.size();
    }
    public static void main(String[] args){
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
