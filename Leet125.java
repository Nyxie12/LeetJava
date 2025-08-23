public class Leet125 {
    public static void main(String args[]) {
        String s = "Race a car";

        String palindrome = "";
        String x = s.replaceAll("[^a-zA-Z]", "");
        x = x.toLowerCase();
        char[] arr = x.toCharArray();
        for(int i = x.length()-1; i>=0; i--)
        {
            palindrome += arr[i];
        }

        System.out.println(palindrome.equals(x));
    }
}

