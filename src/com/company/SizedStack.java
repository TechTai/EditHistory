package com.company;
import java.util.Stack;

public class SizedStack<T> extends Stack<T> {
    private int maxSize;


    public SizedStack(int size) {
        super();
        this.maxSize = size;
    }

    @Override
    public T push(T object) {
        while (this.size() >= maxSize) {
            this.remove(0);
        }
        return super.push(object);
    }
}

//    public static void editHistory(String term){
//        switch (term) {
//            case "copy":
////                term.equals("copy");
//                System.out.println("Your last edit has been copied and saved in your history for your use.");
//                break;
//            case "delete":
////                term.equals("delete");
//                System.out.println("Your last edit has been deleted from your history.");
//                break;
//            case "undo":
////                term.equals("undo");
//                System.out.println("Your last edit has been undone and your document will not display it.");
//                break;
//            case "quit":
////                term.equals("quit");
//                System.out.println("You are now exiting your document and all changes should be saved.");
//                break;
//            continue;
//        }
//
//    }

