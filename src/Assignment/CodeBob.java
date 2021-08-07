package Assignment;

public class CodeBob {
    public static void main(String[] args) {

        CodeBob c = new CodeBob();
        System.out.println(c.bobThere("SunbobSun"));

    }

    public boolean bobThere(String str)
    {

        for(int i = 0;i<str.length()-2;i++)
        {

            if(str.charAt(i)=='b' && str.charAt(i+2)=='b')

                return true;

        }
        return false;


    }

}
