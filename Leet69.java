public class Leet69 {
    public static void main(String[] args)
    {
        int x = 2147483647;

        for (int i = 0; i<x; i++)
        {
            long square = (long) i*i;
            if (square == x){
                System.out.println(i);
                break;
            }
            else if (square > x){
                System.out.println(i-1);
                break;
            } else if (x==1 || x==2|| x==3) {
                System.out.println(1);
            }
        }
    }
}


