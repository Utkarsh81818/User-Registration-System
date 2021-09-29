package com.bridgelabz.regex;
import java.util.Scanner;
/**
 * Purpose  - As a User need to enter a valid Last Name
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
        switch (scanner.nextInt()){
            case 1:
                UserRegistration.validFirstName();
                break;
            case 2:
                UserRegistration.validLastName();
                break;
            default:
                System.out.println("Select a valid number");
        }
    }
}

