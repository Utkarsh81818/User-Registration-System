package com.bridgelabz.regex;
import java.util.Scanner;
/**
 * Purpose  - Should have atleast 1 Special Character in the password
 * @author  - Utkarsh Mishra
 * @version - 16.0
 * @since   - 2021-09-29
 */

public class UserRegistrationMain {

    public static void welcome(){
        System.out.println("Welcome to User Registration System Problem");
    }
    public static void main(String[] args) {
	    welcome();
        UserRegistration user = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 : to validate First Name ");
        System.out.println("Enter 2 : to validate Last Name ");
        System.out.println("Enter 3 : to validate E-mail Address ");
        System.out.println("Enter 4 : to validate Mobile Number ");
        System.out.println("Enter 5 : to validate Password Rule 1 ");
        System.out.println("Enter 6 : to validate Password Rule 2 ");
        System.out.println("Enter 7 : to validate Password Rule 3 ");
        System.out.println("Enter 8 : to validate Password Rule 4 ");
        switch (scanner.nextInt()){
            case 1:
                UserRegistration.validFirstName();
                break;
            case 2:
                UserRegistration.validLastName();
                break;
            case 3:
                UserRegistration.validEmailId();
                break;
            case 4:
                UserRegistration.validMobileNumber();
                break;
            case 5:
                UserRegistration.validPassRule1();
                break;
            case 6:
                UserRegistration.validPassRule2();
                break;
            case 7:
                UserRegistration.validPassRule3();
                break;
            case 8:
                UserRegistration.validPassRule4();
                break;
            default:
                System.out.println("Invalid! Select a valid number");
        }
    }
}

