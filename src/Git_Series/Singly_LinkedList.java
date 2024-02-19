package Git_Series;

import java.util.Scanner;
class SLL{
    Node head;
    Node tail;
    int size;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = head;
            size++;
        }
        else{
            tail.next = node;
            tail = node;
            size++;
        }
    }
    public void remove(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value){
                temp = temp.next;
            }
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }
    public void reverse(){
        Node temp = head;
        Node prev = null;
        Node next = null;
        while(temp != null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
    }
    public void length(){
        System.out.println("Length of linked list is "+size);
    }
    public void middle(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
            if(count == size/2){
                System.out.println("Middle value is "+temp.value);
            }
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }
}
public class Singly_LinkedList {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        SLL sll = new SLL();
        int n = obj.nextInt();
        while(n != -1){
            sll.insert(n);
            n = obj.nextInt();
        }
        sll.display();
        System.out.println();
        sll.remove(3);
        sll.reverse();
        System.out.println();
        sll.display();
        System.out.println();
        sll.length();
        sll.middle();
    }
}
