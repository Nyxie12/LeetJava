import java.util.Arrays;

public class Leet1323 {
    public static void main(String[] args)
    {
        int num = 9669;
        String nums = String.valueOf(num);
        char[] array = nums.toCharArray();

        for (int i = 0; i<array.length; i++)
        {
            if (array[i] == '6')
            {
                array[i] = '9';
                break;

            }
        }

        int i = Integer.parseInt(new String(array));
        System.out.println(i);
    }
}
