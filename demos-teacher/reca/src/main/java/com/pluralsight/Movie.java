package com.pluralsight;

//
import java.util.Scanner;

public class Movie {

    // todo: Creating a movie class
        public static void main(String[] args) {


            //Creating a Scanner object
            // It is needed to be able to read a user input
            Scanner read = new Scanner(System.in);

            // todo: What is Scanner? Google, Ask my peers, Ask Remsey
            System.out.printf("Enter movie name: ");
            String movieTitle = read.nextLine();

            System.out.printf("Enter number of friends: ");
            int friendsAmount = read.nextInt();

            System.out.printf("Enter pizza price per slice  (without dollar sign (e.g. 5.04) ");
            double pizzaPerSlice = read.nextDouble();

            System.out.println("Is there popcorn: (Enter true or false) ");
            boolean popcorn = read.nextBoolean();


            // Why + 1? I`m adding 1 because I also eating! Ofcourse
            double totalPizzaCost = Math.round(pizzaPerSlice*(friendsAmount+1));
            System.out.printf("Movie name is: " + movieTitle + ", Guests: " + friendsAmount +" Total cost: " + totalPizzaCost);

            read.close();
        }
    }

