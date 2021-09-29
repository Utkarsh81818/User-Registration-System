package com.bridgelabz.regex;
import java.util.Scanner;
/**
 * Purpose  - As a User need to enter a valid E-mail ID
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
            default:
                System.out.println("Select a valid number");
        }
    }
}

