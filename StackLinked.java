import java.io.*;
import java.util.Scanner;

public class StackLinked {
    static class node{
        int data;
        node next;
        node(int data){
           this.data=data;
           this.next=null;
        }
    }
    node top=null;

    void push(int data){
        node newnode=new node(data);
        if(top==null){
            top=newnode;
            System.out.println("pushed");
        }else{
            newnode.next=top;
            top=newnode;
            System.out.println("pushed");
        }
    }

    void pop(){
        if(top==null){
            System.out.println("stack is empty");
        }else{
            top=top.next;
            System.out.println("item popped");
        }
    }
    
    void view(){
        node ptr=top;
        while(ptr!=null){
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
    }
    public static void main(String[] args){
        StackLinked sl=new StackLinked();
        Scanner sc=new Scanner(System.in);
        int d;
        do{
        System.out.println("enter your choice");
        System.out.println("1. push 2.pop 3.view");
        int ch=sc.nextInt();

        switch(ch){
            case 1:{
                System.out.println("enter your data");
                int data=sc.nextInt();
                sl.push(data);
                break;
            }
            case 2:{
                sl.pop();
                break;
            }
            case 3:{
                sl.view();
                break;
            }
        }System.out.println("more ? press 1");
        d=sc.nextInt();
        }while(d==1);
    }
}
