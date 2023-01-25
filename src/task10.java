/*How would you swap  2 strings without a temporary variable?

*/


public class task10 {
    public static void main(String[] args) {
String str1= "Learn Java by practicing. ";
String str2= "Syntax is a good bootcamp. ";
StringBuilder sb= new StringBuilder(str1);
str1=str2;
str2= sb.toString();
        System.out.println("str1 is "+str1);
        System.out.println("str2 is "+str2);


        }

        }








