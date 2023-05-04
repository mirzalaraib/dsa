import java.io.*;
import java.util.Scanner;

public class Queue {
    int front=-1;
    int rear=-1;

    void enque(int data, int a[], int size){
        if(rear == size-1){
            System.out.println("overflow condition");
        }else if(front==-1 && rear==-1){
            front ++;
            rear ++;
            a[rear]=data;
        }else{
            rear ++;
            a[rear]=data;
            System.out.println();
        }
    }

    void deque(){
       if(front ==-1 && rear ==-1){
          System.out.println("underflow");
       }else{
          front=front+1;
       }
    }

    void view(int a[]){
        for(int i=front; i<=rear; i++){
           System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue qu=new Queue();
        int d;
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int a[]=new int[size];
        do{
        System.out.println("enter your choice");
        System.out.println("1. enque 2. deque 3. view");
        int ch=sc.nextInt();
        switch(ch){
            case 1:{
                System.out.println("enter data");
                int data=sc.nextInt();
                qu.enque(data,a,size);
                break;
            }

            case 2:{
                qu.deque();
                break;
            }

            case 3 :{
                qu.view(a);
                break;
            }
        }System.out.println("more ? , press 1");
         d=sc.nextInt();
        }while(d==1);
    }
}
