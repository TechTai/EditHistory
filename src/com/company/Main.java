package com.company;
import java.util.Stack;
import java.util.LinkedList;
import java.util.List;
import java.util.Collection;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //Tariqua and Oleg combined
//        System.out.println("Please begin writing in your document below.");
//        Scanner input = new Scanner(System.in);
//
//        EditHistory editHistory = new EditHistory();
//        editHistory.startEditHistory(input);

        //Tariqua code
        LinkedList history = new LinkedList<String>();
        EditHistory editHistory = new EditHistory();
//
//        history.push("Do well on Homework 4!");
//        history.push("Create the LinkedList.");
//        history.push("Create the SizedStack.");
//        history.push("Create the user input with the Scanner.");
//        history.push("Set up the commands - copy.");
//        history.push("Set up the commands - delete.");
//        history.push("Set up the commands - undo.");
//        history.push("Set up the commands - quit.");
        System.out.println("Please begin writing in your document below.");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
//        history.push(string);

        System.out.println("You have entered: " + string);
        System.out.println();
        System.out.println("Please use the following commands to edit your document - copy, delete, undo, quit.");
        Scanner scanner = new Scanner(System.in);

        editHistory.startEditHistory(scanner, string);

//        while (!history.isEmpty()) {
//            Object value = history.pop();
//            System.out.println("Your last edit has been deleted from your history.");
//            System.out.println();
//            System.out.println("Please use the following commands to edit your document - copy, delete, undo, quit.");
        }
    }




// String input example - I will be an andriod developer by June 2018