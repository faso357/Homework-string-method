/*Create a String that will hold a sentence. Write a program to get a new String without any spaces.
*/


public class task5 {
    public static void main(String[] args) {
       String str = "Learn Java by practicing. ";
        System.out.print(str.replaceAll("[^A-Za-z0-9]",""));

        }



    }


