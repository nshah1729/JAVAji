package com.DSA;

public class LL {
    Node head;
    int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    //Add
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            currNode=currNode.next;
        }
        currNode=newNode;
        size++;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("The List is already empty!");
            return;
        }
        head=head.next;
        size--;
    }
    public void deleteLast(){

        if(head==null){
            System.out.println("The list is already empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node last=head.next;
        while(last.next!=null){
            secondLast=secondLast.next;
            last=last.next;
        }
        secondLast.next=null;

    }
    public int getSize(){
        return size;
    }
    public void printList(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }
}
