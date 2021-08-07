package Assignment;

public class DoubleChar {
    public static void main(String[] args) {
       String str = "Surinder";
        System.out.println(doubleChar(str));

    }

    public static String doubleChar(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += str.charAt(i);
            newStr += str.charAt(i);
        }
        return newStr;
    }
}
