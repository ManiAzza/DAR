package tp2;

public class Test   {

    public static String karim() {
        try {
            return "try";

        } catch (Exception e)
        {
            return "catch";
        }
        finally {return "finally" ;
        }
    }
    public static void main(String[] args) {
        System.out.println(karim());

    }
}


