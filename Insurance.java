/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.insurance;

/**
 *
 * @author PATIENT
 */
//importing Scanner so that input is received from the user
import java.util.Scanner;

public class Insurance {
   
public static void main(String[] args) {
    
    //creating an object for Scanner  
    Scanner input = new Scanner(System.in);
    
        System.out.print("Enter the current year ");
       //let CurreYear represent the Current year
        int CurreYear=input.nextInt();
       
     System.out.print(" enter the year you were born (the year of birth) "  ); 
     //let YearOfBirth represent the year at which the user was born
     int  YearOfBirth=input.nextInt();
    
     //calling the method within the main method
     //let the returned value be PremiumAmount 
     int PremiumAmount=CalculatingPremium(CurreYear,YearOfBirth);
    
     System.out.print("your premium amount is $"+PremiumAmount);
    
}
public static int CalculatingPremium(int CurreYear , int YearOfBirth ){
    
    int age = CurreYear-YearOfBirth;
    //in order to get a decade of a year we devide by 10 
    int decade =age/10;
  return (decade+15)*20; 
    
}

 
        }
    



