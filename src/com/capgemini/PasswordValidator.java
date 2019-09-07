package com.capgemini;

import java.util.Scanner;

public class PasswordValidator
{
        public PasswordValidator()
        {
                super();
        }

        public static void main(String[] args)
        {
                PasswordValidator pwd = new PasswordValidator();
                
                Scanner s=new Scanner(System.in);
       		    System.out.println("Enter a string");
       		    String str=s.nextLine(); 
       		 
                pwd.pwdValidation(str);
        }

       

        public void pwdValidation(String password)
        {
                boolean valid = true;
                
                if (password.length() > 15 || password.length() < 8)
                {
                        System.out.println("Password should be less than 15 and more than 8 characters in length.");
                        valid = false;
                }
              
                String upperCaseChars = "(.*[A-Z].*)";
                if (!password.matches(upperCaseChars ))
                {
                        System.out.println("Password should contain atleast one upper case alphabet");
                        valid = false;
                }
                String lowerCaseChars = "(.*[a-z].*)";
                if (!password.matches(lowerCaseChars ))
                {
                        System.out.println("Password should contain atleast one lower case alphabet");
                        valid = false;
                }
                String numbers = "(.*[0-9].*)";
                if (!password.matches(numbers ))
                {
                        System.out.println("Password should contain atleast one number.");
                        valid = false;
                }
                String specialChars = "(.*[@#$%^*].*)";
                if (!password.matches(specialChars ))
                {
                        System.out.println("Password should contain atleast one special character");
                        valid = false;
                }
                if (valid)
                {
                        System.out.println("Password is valid.");
                }
        }
}
