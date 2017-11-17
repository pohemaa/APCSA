import java.util.*;
import java.lang.Math.*;
import java.io.*;
import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passCheck{

    public static void main(String [] args){

        Scanner scnr = new Scanner(System.in);

        System.out.println("Please input your first name: ");
        String firstName = scnr.nextLine();

        System.out.println("Please input your last name:");
        String lastName = scnr.nextLine();

        System.out.println("Now please create a password that is:");

        System.out.println(" Greater than 8 characters \n Cannot contain your first or last name\n Must contain a number\n Must contain any of the following special characters(!#$%&'()*+)\n Must contain capital letters.\n Cannot contain a 'space', ' - ' or '_' ");

        System.out.println("Password: ");
        String passWord = scnr.nextLine();

        int passWordLen = passWord.length();

        if(passWordLen < 8){
            System.out.println("Please make your password longer.");
        }

        if(passWord.toLowerCase().contains(firstName.toLowerCase())){
            System.out.println("Do not include firstname in password.");
        }
        if(passWord.toLowerCase().contains(lastName.toLowerCase())){
            System.out.println("Do not include lastname in password.");
        }

         if(!(passWord.charAt(0) >= 'A' && passWord.charAt(0) <= 'Z')){
                System.out.println("Please include capital letters.");
         }

         if(!(passWord.charAt(0) >= '0' && passWord.charAt(0) <= '9')){
             System.out.println("Please add numbers to your password");
         }

        if(passWord.charAt(0) == ' '){
             System.out.println("Do not add whitespace");

        }
    String specialCharacters= " !#$%&'()*+";
    String str2[]=passWord.split("");



    if (!(specialCharacters.contains(str2[0])))
    {
        System.out.println("Please include special characters.");
    }


}
}