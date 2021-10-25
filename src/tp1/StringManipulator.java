package tp1;

package shapes;

public class StringManipulator {

    private String s;

    public StringManipulator(String s) {
        this.s = s;
    }

    public void reverse(String s){
        //do your stuff
    	 String ch="";
         for(int i=s.length()-1;i>=0;i--){
             ch += s.charAt(i);
         }
         System.out.println("reverse : "+ch);
       
    }
    public void isPalindrome(String s){
        String palindrome="True";
        int x=0;
        for(int i=0;i<(s.length()/2);i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                x++;
        }
        if(x>0)
            palindrome="False";
        System.out.println("isPalindrome : "+palindrome);
    }

    public void toUpperCase(String s){
        int x;
         String s2 = new String();
         for (int i=0; i<s.length();i++){
             char c= s.charAt(i);
             if (c >= 'a' && c <= 'z'){
                 x = (int) c;
                 x -= 32;
                 s2 += (char) x;
             }
             else {
                 s2 += c;
             }
         }
        System.out.println("uppercase : "+s2);
    }

    public void toLowerCase(String s){
        int x;
        String s2 = new String();
         for (int i=0; i<s.length();i++){
             char c= s.charAt(i);
             if (c >= 'A' && c <= 'Z'){
                 x = (int) c;
                 x += 32;
                 s2 += (char) x;
             }
             else {
                 s2 += c;
             }
         }
        System.out.println("lowercase : "+s2);
    }

    public void getVowelNumber(String s){
        int x=0;
         for (int i=0; i<s.length();i++){
             String c = new String();
             c= s.substring(i,i+1);
             if (c.equalsIgnoreCase("a") || c.equalsIgnoreCase("e") || c.equalsIgnoreCase("i") || c.equalsIgnoreCase("u") || c.equalsIgnoreCase("o") || c.equalsIgnoreCase("y")){
                x++;
             }
         }
        System.out.println("vowelNumber : "+x);
    }

    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator("tene");
        stringManipulator.reverse("Azza");
        stringManipulator.isPalindrome("Azza");
        stringManipulator.toUpperCase("MaNNi");
        stringManipulator.toLowerCase("AzZZa");
        stringManipulator.getVowelNumber("OISEAU");
    }
}
