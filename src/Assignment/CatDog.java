package Assignment;

public class CatDog {
    public static void main(String[] args) {
        String str = "1cat1cadodogcatdogdogcat";
        System.out.println(catDog(str));
    }

    public static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String word = "";
            word += str.charAt(i);
            word += str.charAt(i + 1);
            word += str.charAt(i + 2);

            if (word.equals("cat")) {
                cat++;
            } else if (word.equals("dog")) {
                dog++;
            }
        }
        if (cat == dog)
            return true;
        else
            return false;
    }
}
