/*You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
 How would you find out how many sentences are in that String?
*/


public class task7 {
    public static void main(String[] args) {
       String str = "Is it saturday? Is it raining? Do we have a Java Class today?";
       String [] strarr=str.split("[!?.]");
        System.out.println(strarr.length);


        }}






