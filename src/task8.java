/*How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
*/


public class task8 {
    public static void main(String[] args) {

String str= "This is sentence i want to reverse";
       String [] words= str.split(" ");
String reverse="";
        for (int i = 0; i < words.length; i++) {
            StringBuilder arr= new StringBuilder(words[i]);
            arr.reverse();
            reverse+= arr.toString()+" ";
        }
        System.out.print(reverse);
        }

        }








