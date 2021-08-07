package Assignment;

public class EndOther {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abXabc";
        System.out.println(endOther(a,b));
    }
    public static boolean endOther(String a, String b) {
        boolean result = false;
        if(a.length() == b.length())
        {
            if(a.equalsIgnoreCase(b))
            {
                result = true;
            }
        }
        else if(a.length() > b.length())
        {

        }
        else
        {

        }
        return result;
    }

}


