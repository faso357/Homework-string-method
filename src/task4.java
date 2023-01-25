/*Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
*/


public class task4 {
    public static void main(String[] args) {
        String dadname="Francois";
        String momname = "Kariman";
        String expecting = "girl";
        String firsthalf= "";
        String secondhalf= "";


        if (expecting.equalsIgnoreCase("boy")){
            firsthalf= dadname.substring(0,dadname.length()/2);
            secondhalf= momname.substring(momname.length()/2);
            System.out.println(firsthalf+secondhalf);
        }else{
            firsthalf= momname.substring(0,momname.length()/2);
            secondhalf= dadname.substring(dadname.length()/2);
            System.out.println(firsthalf+secondhalf);
        }



    }
}

