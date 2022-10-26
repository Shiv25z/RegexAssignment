package com.assignmentday19;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateUserInfo {
    Scanner sc = new Scanner(System.in);
    public void checkFirstName(){
        System.out.println("Enter FirstName: ");
        String s = sc.nextLine();
        if(Pattern.matches("^[A-Z]{1}[a-z]{2,}",s)){
            System.out.println("FirstName Validated");
        }
        else{
            System.out.println("Invalid Input!");
        }


    }
    public void checkLastName() {
        System.out.println("Enter LastName: ");
        String s = sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", s)) {
            System.out.println("LastName Validated");
        } else {
            System.out.println("Invalid Input!");
        }
    }

    public void checkEmail() {
        System.out.println("Enter Email Address : ");
        String s = sc.nextLine();
        if (Pattern.matches("^[a-zA-Z0-9]+([.][0-9a-zA-Z]+)*@[a-zA-Z]+.[a-z]{2,3}([.][a-z]{2,3})*$", s)) {
            System.out.println("Email Validated");
        } else {
            System.out.println("Invalid Email Input!");
        }
    }
    public void checkPhone() {
        System.out.println("Enter Phone Number : ");
        String s = sc.nextLine();
        if (Pattern.matches("^[+][0-9]{2}+[ ]?[0-9]{10}$", s)) {
            System.out.println("Phone Number Validated");
        } else {
            System.out.println("Invalid Phone Number");
        }
    }
    public void checkPassword(){
        System.out.println("Enter the Password : ");
        String s = sc.nextLine();
        if(Pattern.matches("^[a-z](?=.*[A-Z]).{8,}$", s)){ // UC 5 Rule-2
            System.out.println("Password Accepted!");
        }
        else {
            System.out.println("Password does not satisfies condition ");
        }
    }
}
