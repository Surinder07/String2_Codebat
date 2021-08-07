package Assignment;

public class CountCode {
    public static void main(String[] args) {
        String str = "cozexxcopeconehsnchdecode";
        System.out.println(countCode(str));
    }

    public static int countCode(String str) {
        int counter = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if(str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e')
            {
                counter++;
            }
        }

        return counter;
    }

}
