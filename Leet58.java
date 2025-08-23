public class Leet58 {
//    public int lengthOfLastWord(String s){
//
//    }

    public static void main(String[] args){
        String s = "a";
        int length = 0;
        char[] a = new char[s.length()];
        a = s.toCharArray();

        for (int i = s.length()-1; i>=0; i--){
            if (a[i] != ' '){
                length++;
            }
            else if(length > 0 && a[i] == ' '){
                break;
            }
        }
        System.out.println(length);
    }
}
