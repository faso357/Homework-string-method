/*Create a String that should be combination of letters, numbers and special characters.
Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
*/


public class task6 {
    public static void main(String[] args) {
       String str = "learn java 8757857859857985 BY PRACTICING #$^(*#@****^%$$##. ";
       int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))){
                count++;
            } else if (Character.isDigit(str.charAt(i))) {
                count++;
            }

            }
        System.out.println("Total Alphanumeric is "+count);
        }


        }






