package Assignment;

public class CountHi {
    public static void main(String[] args) {
        String str = "hiho not HOHIhi";
        System.out.println(countHi(str));
    }

    public static int countHi(String str){
        int counter = 0;
        for(int i = 0; i < str.length()-1; i++) {
            String word = "";
            word+= str.charAt(i);
            word += str.charAt(i+1);
            if(word.equals("hi")){
                counter++;
            }
        }
        return counter;
    }
}
