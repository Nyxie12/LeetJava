/*
Creating a program to track points
x : Record new score of x
+ : Record new score of the previous 2 scores
D : Record new score that is double the previous score
C : Invalidate the previous score
 */


public class leet682 {
    public static int calPoints(String[] operations){
        int result = 0;
        int[] total = new int[operations.length];
        int counter = 0;

        for (int i = 0; i< operations.length; i++){
            if (operations[i].equals("+")) {
                total[counter] = total[counter-1] + total[counter-2];
            }
            else if (operations[i].equals("D")){
                total[counter] = total[counter-1] *2;
                counter++;
            }
            else if (operations[i].equals("C")) {
                total[counter-1] = 0;
                counter--;
            } else {
                total[counter] = Integer.parseInt(operations[i]);
                counter++;
            }
        }
        for (int t:total) {
            result +=t;
        }
        return result;
    }

    public static void main(String args[]){
        String[] t = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(t));
    }
}
