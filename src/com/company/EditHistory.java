package com.company;
import java.util.EmptyStackException;
import java.util.Scanner;


public class EditHistory {

    private static SizedStack<String> editHistoryStack;
    private  static LinkedList history = new LinkedList();

    public EditHistory() {
        editHistoryStack = new SizedStack<>(10);
    }

    public void startEditHistory(Scanner scanner, String userInput) {

        history.push("Do well on Homework 4!");
        history.push("Create the LinkedList.");
        history.push("Create the SizedStack.");
        history.push("Create the user input with the Scanner.");
        history.push("Set up the commands - copy.");
        history.push("Set up the commands - delete.");
        history.push("Set up the commands - undo.");
        history.push("Set up the commands - quit.");
        history.push(userInput);

        while (scanner.hasNext()) {
//            System.out.println("You have entered: " + history.peek());
//            System.out.println();
//            System.out.println("Please use the following commands to edit your document - copy, delete, undo, quit.");
            userInput = scanner.nextLine();


            boolean quit = false;
            if (userInput.equals("quit")) {
                System.out.println("You are now exiting your document and all changes should be saved.");
                quit = true;
            } else if (userInput.equals("copy")) {
                this.copyInput(userInput);
                continue;
            } else if (userInput.equals("delete")) {
                this.deleteInput(userInput);
                continue;
            } else if (userInput.equals("undo")) {
                this.undoInput(userInput);
                continue;
            } else if (!userInput.equals("copy") && !userInput.equals("delete") && !userInput.equals("undo")) {
                this.saveInput(userInput);
                continue;
            }
            if (quit) {
                break;
            }
        }
    }
    public void saveInput(String userInput) {
        history.push(userInput);
        System.out.println("You have entered: " + history);
        System.out.println();
        System.out.println("Please use the following commands to edit your document - copy, delete, undo, quit.");
    }

    public void copyInput(String userInput) {
        String copy = userInput.toLowerCase();
        if (copy.equals("copy")) {
            System.out.println("Your edit history list: " + history.peek());
            System.out.println("Your last edit has been copied and saved in your history for your use.");
            System.out.println();
            System.out.println("Please use the following commands to edit your document - copy, delete, undo, quit.");
        }
    }
    public void deleteInput(String userInput) {
        String delete = userInput.toLowerCase();
        if (delete.equals("delete")) {
            System.out.println("Your last edit has been deleted from your history.");
            System.out.println();
            System.out.println("Please use the following commands to edit your document - copy, delete, undo, quit.");
            history.pop();
            try {
                history.pop();
            } catch (Exception e) {
                System.out.println("There is nothing to delete from your edit history.");
            }
        }
    }
    // in order to use undo, the .pop value has to be pushed to another stack or list first in deleteInput
    public void undoInput(String userInput) {
        String undo = userInput.toLowerCase();
        if (undo.equals("undo")) {
            System.out.println("Your last edit has been undone and your document will not display it.");
            System.out.println();
            System.out.println("Please use the following commands to edit your document - copy, delete, undo, quit.");
            editHistoryStack.push(editHistoryStack.pop());
        }
    }

}
