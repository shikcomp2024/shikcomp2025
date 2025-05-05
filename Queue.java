import java.util.Scanner;
public class Queue {
Scanner sc=new Scanner(System.in);

int array[];
int size;

int front=-1;
int rear=-1;

void input(){
    System.out.println("enter size of array");
    size=sc.nextInt();
    array=new int[size];
}

void enqueue(){

    System.out.println("enter element ");
    int element=sc.nextInt();

    if(rear==(size-1)){
        System.out.println("overflow");
    }
    else if(front==-1 && rear==-1){
        
        front=front+1;
        rear=rear+1;
        array[rear]=element;

    }
    else {
        rear=rear+1;
        array[rear]=element;
    }
}

void dequeue(){
    if(front==-1 && rear==-1){
        System.out.println("underflow");
    }
    else{
        System.out.println("deleted element " + array[front]);
        front=front+1;
    }
}

void display(){
    for(int i=rear;i>=front;i--){
        System.out.print("|" + array[i] + "|");
    }
    System.out.println();
}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue ob=new Queue();

        ob.input();

        while (true){
            System.out.println("1-Enqueue|| 2-Dequeue|| 3-Display || 4-Exit");
            int option=sc.nextInt();

            switch (option){
                case 1:
                ob.enqueue();
                break;

                case 2:
                ob.dequeue();
                break;

                case 3:
                ob.display();
                break;

                case 4:
                System.exit(0);

            }
        }

        }
}
