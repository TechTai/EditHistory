package com.company;

public class LinkedList {
    Node head;

    static class Node{
        String data;
        Node next;

        public Node(String data){
            this.data = data;
            next = null;
        }
    }

    private int top;

    public LinkedList(){
        top = -1;
    }

    //Stack is empty
    public boolean isEmpty(){
        return (top == -1);
    }

    public void push(String value){
        Node temp = new Node(value);
        temp.next = head;
        head = temp;
        top++;
    }

    public String pop(){
        if(head != null) {
            Node temp = head;
            head = head.next;
            --top;
            return temp.data;
        }else{
            return "There is nothing to delete from your edit history.";
        }
    }

    public String peek(){
        return head.data;
    }
}
