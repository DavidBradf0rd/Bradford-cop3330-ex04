package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */
import java.util.Scanner;
public class MadLib
{
    public static void main( String[] args )
    {
        System.out.print( "Enter a noun: " ); //asks user for noun
        Scanner input = new Scanner(System.in); //imports scan
        String noun = input.nextLine(); //creates noun variable for user input
        System.out.print( "Enter a verb: " ); //asks user for verb
        String verb = input.nextLine(); //creates verb variable for user input
        System.out.print( "Enter an adjective: " ); //asks user for adjective
        String adjective = input.nextLine(); //creates adjective variable for user input
        System.out.print( "Enter an adverb: " ); //asks user for adverb
        String adverb = input.nextLine(); //creates adverb variable for user input

        System.out.println("Do you "+verb+" your "+adjective+" "+noun+" "+adverb+"? That's hilarious!"); //prints madlib

    }
}
