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
}
