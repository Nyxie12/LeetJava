//Make a variable that we add the prefix to
//check each array at a time to see if the checker and the string match
//for the first string in the array add the first element and check with the rest
//in the rest


public class Leet14 {
    public static void main(String[] args){
        String[] strs = {"flower, flow, flight"};
        String res = "";

        for (int i = 0; i<strs[i].length(); i++)
        {
            for (String s : strs)
            {
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i))
                {
                    return res;
                }
                res += strs[0].charAt(i);
            }
        }
        return res;
    }
}
