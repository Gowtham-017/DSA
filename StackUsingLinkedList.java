package Git_Series;
import java.util.Scanner;
class StackLL{
    Node head;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public void push(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
    }
    public void pop(){
        System.out.println("Popped element is: "+head.value);
        head = head.next;
    }
    public void peek(){
        System.out.println(head.value);
    }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
public class StackUsingLinkedList {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        StackLL l = new StackLL();
        int a = obj.nextInt();
        while(a != -1){
            l.push(a);
            a = obj.nextInt();
        }
        l.display();
        l.pop();
        l.peek();
        System.out.println(l.isEmpty());
    }
}
