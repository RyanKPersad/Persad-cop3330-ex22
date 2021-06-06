/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Persad
 */
package Comparing_Num;
import java.util.Scanner;

public class App 
{
    static Scanner myObj = new Scanner(System.in);

    public static void main( String[] args )
    {
        int num1;
        int num2;
        int num3;
        
        System.out.println( "Enter the first number:" );
        num1 = myObj.nextInt();

        System.out.println( "Enter the second number:" );
        num2 = myObj.nextInt();

        System.out.println( "Enter the third number:" );
        num3 = myObj.nextInt();


        //Compares the three numbers
        if (num1>num2 && num1>num3 ){
            System.out.println("The largest number is: "+num1);


        }else if(num1<num2 && num2>num3){
            System.out.println("The largest number is: "+num2);


    }else{
            System.out.println("The largest number is: "+num3);

        }

    }
}
