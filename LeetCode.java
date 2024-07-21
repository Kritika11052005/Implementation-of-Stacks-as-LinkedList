import java.util.*;
public class LeetCode {
static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
static class stack{
    public static Node head;
    public static boolean isEmpty(){
        return head==null;
    }
    //Push function
    public static void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //pop function
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
    //peek function
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
}
        
    }

