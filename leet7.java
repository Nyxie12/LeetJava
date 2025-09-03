public class leet7 {
    public static int reverse(int i){
        int newInt = 0;
        while(i > 9 || i < -9){
            newInt += (i % 10);
            i = i/10;
            newInt = newInt*10;
        }
        newInt += i;

        return newInt;

    }

    public static void main(String args[]){
        System.out.println(reverse(-123));
    }
}
