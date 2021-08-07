package Assignment;

public class MixStrings {
    public static void main(String[] args) {

        MixStrings m = new MixStrings();
        System.out.println(m.mixString("abcdef","tyt"));
    }


    public String mixString(String a, String b) {

        String str = "";

        if(a.length()>=b.length()){
            int counter = b.length();

            for(int i = 0;i<a.length();i++){
                str += a.charAt(i);
                if(counter!=0) {
                    for (int y = (b.length()-counter); y < b.length() ; y++) {
                        str += b.charAt(y);
                        counter--;
                        break;
                    }

                }
            }
        }else {
            int  counter_a = a.length();

            for(int i = 0;i<b.length();i++){

                if(counter_a!=0) {
                    for (int y = (a.length()-counter_a); y < a.length() ; y++) {
                        str += a.charAt(y);
                        counter_a--;
                        break;
                    }

                }
                str += b.charAt(i);
            }


        }
        return str.toString();

    }


}
