/*
 *  Sheridan College, Trafalgar Campus
 * Name/Student no.: Jaime Tavares, 991512643
 * Program: Information Systems Engineering
 */
package midtermreviewcodeforpartc;
import java.util.*;
/**
 *
 * @author jtava
 */
public class PasswordValidator {
    boolean validPassword=false;
    String password="";
    public PasswordValidator(){}
    // build constructor to get password
    public PasswordValidator(String pass) {
        this.password = pass;
    }    
    // build getters and setters
    
    
    // build a method to validate password for PasswordValidator object
    public void validate() {
        while(!validPassword)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Passwords must have at least 8 characters");
            System.out.println("Passwords must have at least one special character");
            System.out.println("Please enter your desired password:"); 
            
            password = sc.nextLine();
            int specialCharCount=0;
            //iterate over each character to see if it is a special character
            for(int i=0;i<password.length(); i++)
            {
                if(!(Character.isLetterOrDigit(password.charAt(i))))
                {
                    //now we know there is at least one special character
                    specialCharCount++;
                }
            }
            if(specialCharCount>0 &&password.length()>7)
            {
                validPassword=true;
            }
        }//loop only ends when password is valid so now we create the User
    }
}
