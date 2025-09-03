public class Leet67 {
    public static String addBinary(String a, String b){
        int totalA = 0;
        int power = 0;
        for (int i = a.length(); i > 0; i--){
            int j = a.charAt(i-1) - '0';
            totalA += j*Math.pow(2, power);
            power++;
        }
        int totalB = 0;
        for (int i = b.length(); i > 0; i--){
            int j = b.charAt(i-1) - '0';
            totalA += j*Math.pow(2, power);
            power++;
        }

        int total = totalB+totalA;

        return String.valueOf(totalA);
    }

    public static void main(String[] args) {
        String a = "0110";
        String b = "11";

        char[] aArr = a.toCharArray();
        char[] bArr = a.toCharArray()

        if (a.length() > b.length()){
            for (int i = 0; i<a.length(); i++){

            }
        }
    }
}
