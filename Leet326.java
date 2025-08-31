public class Leet326 {
    public static void main(String[] args)
    {
        int n = 45;
        boolean isPower = false;

        for (int i = 0; i<n/3; i++)
        {
            if (n%3 == 0)
            {
                isPower = true;
            }
            else {
                isPower =  false;
            }
        }
        System.out.println(isPower);
    }
}
