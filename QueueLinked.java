import java.io.*;
import java.util.Scanner;

public class QueueLinked {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }    
    node front=null;
    node rear=null;

    void enque(int data){
        node newnode=new node(data);
        if(front==null && rear==null){
           front=newnode;
           rear=newnode;
        }else{
            node ptr=front;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            rear=newnode;
            ptr.next=newnode;
        }
    }

    void deque(){
      if(front==null && rear==null){
          System.out.println("underflow");
      }else{
         front=front.next;
      }
    }

    void view(){
       node ptr=front;
       while(ptr!=null){
        System.out.print(ptr.data);
        ptr=ptr.next;
       }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        QueueLinked ql=new QueueLinked();
        int d;
        do{
           System.out.println("enter your choice");
           System.out.println("1. enque 2. deque 3. view");
           int ch=sc.nextInt();
           switch(ch){
              case 1:{
                 System.out.println("enter data");
                 int data=sc.nextInt();
                 ql.enque(data);
                 break;
              }
              case 2:{
                 ql.deque();
                 break;
              }

              case 3:{
                ql.view();
                break;
              }
           }System.out.println("more ? press 1");
           d=sc.nextInt();
        }while(d==1);
    }
}
