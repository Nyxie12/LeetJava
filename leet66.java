public class leet66 {
    public int[] plusOne(int[] digits){
        for (int i = digits.length-1; i>=0; i--){
            if (digits[i] <9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newD = new int[digits.length+1];
        newD[0] = 1;
        return newD;

    }
    public static void main(String[] args){
        int[] digits = {1,2,3};
        for (int i = digits.length-1; i>=0; i--){
            if (digits[i] <9){
                digits[i]++;
                System.out.println(digits);
            }
            digits[i] = 0;
        }
        int[] newD = new int[digits.length+1];
        newD[0] = 1;
        System.out.println(newD);
    }

}
