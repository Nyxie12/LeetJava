public class Leet67 {
    static void main(String[] args) {
        String a = "11";
        String b = "1";
        double total = 0;
        int power = 0;
        for(int i = a.length()-1; i>=0; i--){
            total += a.charAt(i)-'0' * Math.pow(2, i);
        }
        for (int i = b.length(); i>=0; i++){
            total += b.charAt(i)-'0' * Math.pow(2, i);
        }
    }
}
