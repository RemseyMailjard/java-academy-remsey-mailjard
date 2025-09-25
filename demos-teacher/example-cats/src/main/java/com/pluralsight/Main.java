package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int theRandomChosenNumber = (int) Math.floor(Math.random() * 10);
        System.out.println(theRandomChosenNumber);

        Scanner read = new Scanner(System.in);  // Create a Scanner object
        System.out.printf("What number am I`m thinking about (guess between 1 and 10): ");

        int guessedNumber = read.nextInt();  // Read user input
        System.out.println("THe user chose the number " + guessedNumber);
        // Output user input
        if(guessedNumber == theRandomChosenNumber)
        {
            System.out.println("You are correct");
        }
        else if ( guessedNumber < theRandomChosenNumber){
            System.out.println("You guess to low, try again");
        } else if (guessedNumber > theRandomChosenNumber )
        {
            System.out.println("You guess to is high, try again");
        }
    }
}
