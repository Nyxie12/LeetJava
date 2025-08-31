package Testing;

public class test {
    public static int Factorial(int n){
        if (n == 0)
        {
            return 1;
        }
        else{
            return n * Factorial(n-1);
        }
    }
    public static boolean isPalindrome(String s){
        StringBuilder reverse = new StringBuilder(s);
        reverse.reverse();
        if (s.contentEquals(reverse)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("racecar"));
        System.out.println(Factorial(5));

    }
}
