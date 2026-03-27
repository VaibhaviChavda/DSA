/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Vaibhavi
 */
public class SinglyLinkedList {
    private Node head;
    private Node tail;
    
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }
    
    //insert at first 
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        
        //if it is first element
        if(tail == null){
            tail = head;
        }
        size+=1;
    }
    //display linked list
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end"); 
       
    }
    
    //Node 
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }  
    }
    
}
