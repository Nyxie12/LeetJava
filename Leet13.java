public class Leet13 {
    public static void main(String[] args) {
        String s = "III";
        int total = 0;
        //IV = 4    IX = 9     XL = 40     XC = 100    CD = 400    CM = 900
        //Convert the string to an array
        String[] rom = s.split("");
        for (int i = 0; i < s.length(); i++) {

            if (rom[i].equals("I") && rom[i + 1].equals("V")) {
                total += 4;
                i++;
            } else if (rom[i].equals("I") && rom[i + 1].equals("X")) {
                total += 9;
                i++;
            } else if (rom[i].equals("X") && rom[i + 1].equals("L")) {
                total += 40;
                i++;
            } else if (rom[i].equals("X") && rom[i + 1].equals("C")) {
                total += 90;
                i++;
            } else if (rom[i].equals("C") && rom[i + 1].equals("D")) {
                total += 400;
                i++;
            } else if (rom[i].equals("C") && rom[i + 1].equals("M")) {
                total += 900;
                i++;
            } else if (rom[i].equals("I")) {
                total += 1;
            } else if (rom[i].equals("V")) {
                total += 5;
            } else if (rom[i].equals("X")) {
                total += 10;
            } else if (rom[i].equals("L")) {
                total += 50;
            } else if (rom[i].equals("C")) {
                total += 100;
            } else if (rom[i].equals("D")) {
                total += 500;
            } else if (rom[i].equals("M")) {
                total += 1000;
            }
        }
        System.out.println(total);
    }
}
