import java.util.Scanner;

/*Store username, password and confirm password from a user and check following requirements:

Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
*/
public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter your user name ");
         String username= scan.nextLine();
        System.out.println("Please enter your password");
        String password = scan.nextLine();
        System.out.println("Please confirm your password");
        String confirmpassword= scan.nextLine();
        if(username.isEmpty()||password.isEmpty()){
            System.out.println("Username and password cannot be empty");
        } else if (password.length()<8) {
            System.out.println("Password is too short");

        } else if (password.contains(username)) {
            System.out.println("Password cannot contain username");

        } else if (!password.equals(confirmpassword)) {
            System.out.println("Passwords do not match");
        }else{
            System.out.println("Your username and password has been created ");
        }
    }
}