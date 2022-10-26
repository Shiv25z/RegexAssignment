package com.assignmentday19;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
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
        if(Pattern.matches("^[a-z](?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$", s)){ // UC 5 Rule-4
            System.out.println("Password Accepted!");
        }
        else {
            System.out.println("Password does not satisfies condition ");
        }
    }
    public void checkSampleEmail() {
        ArrayList<String> email = new ArrayList<>();
        email.add("abc@yahoo.com");
        email.add("abc-100@yahoo.com");
        email.add("abc.100@yahoo.com");
        email.add("abc111@abc.com");
        email.add("abc-100@abc.net");
        email.add("abc.100@abc.com.au");
        email.add("abc@1.com");
        email.add("abc@gmail.com.com");
        email.add("abc+100@gmail.com");
        email.add("abc");
        email.add("abc..");
        email.add("abc..@gmail.com");
        email.add("abc@abc@gmail.com");
        email.add("abc@.com.my");
        email.add("abc123@gmail.a");
        email.add("abc123@.com");
        email.add("abc123@.com.com");
        email.add(".abc@abc.com");
        email.add("abc()*@gmail.com");
        email.add("abc..2002@gmail.com");
        email.add("abc.@gmail.com");
        email.add("abc@abc@gmail.com");
        email.add("abc@gmail.com.1a");
        email.add("abc..@gmail.com");
        email.add("abc@gmail.com.aa.au");

        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";
        Pattern pattern = Pattern.compile(regex);

        for (String str : email) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                System.out.println("valid email: " + str);
            } else {
                System.out.println("Invalid email: " + str);
            }
        }
    }
}
