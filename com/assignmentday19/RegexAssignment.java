package com.assignmentday19;


public class RegexAssignment {
    public static void main(String[] args) {
        System.out.println("------------------- Pattern Matching Assignment -------------------");
        ValidateUserInfo validateUserInfo = new ValidateUserInfo();
        validateUserInfo.checkFirstName();// UC1
        validateUserInfo.checkLastName();// UC2
        validateUserInfo.checkEmail();//UC3
        validateUserInfo.checkPhone();//UC4
        validateUserInfo.checkPassword();//UC5 Rule - 3
    }

}
