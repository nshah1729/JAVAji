package com.DSA.StackClass;

public class ImplementStackFromLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        public static Node head;

        //Checking if LL is empty
        public static boolean isEmpty(){
            return head==null;
        }

        //push:
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            else {
                    newNode.next=head;
                    head=newNode;
            }
        }

        //pop:
        public static int pop(){
            if(isEmpty()){
                System.out.println("The stack is empty");
            }
                int top=head.data;
                head=head.next;
                return top;
        }

        //peek:
        public static int peek(){
            if(isEmpty()){
                System.out.println("The stack is empty");
            }
                return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
