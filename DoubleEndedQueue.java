import java.util.Scanner;

public class DoubleEndedQueue {
    Scanner sc = new Scanner(System.in);
    int[] array;
    int size;
    int front = -1;
    int rear = -1;

    void input() {
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        array = new int[size];
    }

    void FrontInsertion() {
        System.out.println("Enter the element:");
        int element = sc.nextInt();

        if (front == 0 && rear == size - 1) {
            System.out.println("Overflow: Cannot insert from the front");
        } 
        else if (front == -1 && rear==-1) {
            front++;
            rear++;
            array[front] = element;
        } 
        else if (front > 0){
            front=front-1;
            array[front] = element;
            
        } 
        else {
            System.out.println("Insertion not possible at front");
        }
    
    }

    void FrontDeletion() {
        if (front == -1 || rear==-1) {
            System.out.println("Underflow: Deque is empty");
        } 
        else {
            System.out.println("Deleted element: " + array[front]);
            front=front+1;
            if (front > rear) {
                front = rear = -1;
            }
        }
    }

    void RearInsertion() {
        System.out.println("Enter the element:");
        int element = sc.nextInt();

        if (rear == size - 1) {
            System.out.println("Overflow: Cannot insert from the rear");
        } 
        else if (front == -1 && rear==-1) {
            front = rear = 0;
            array[rear] = element;
        } 
        else {
            rear++;
            array[rear] = element;
        }
    }

    void RearDeletion() {
        if (rear == -1 || front==-1) {
            System.out.println("Underflow: Deque is empty");
        } else 
        {
            System.out.println("Deleted element: " + array[rear]);
            rear=rear-1;
            if (front > rear) {
                front = rear = -1;
            }
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Deque is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print("|" + array[i] + "|");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleEndedQueue ob = new DoubleEndedQueue();

        ob.input();

        while (true) {
            System.out.println("1-Front Insertion || 2-Front Deletion ||");
            System.out.println("3-Rear Insertion || 4-Rear Deletion || 5-Display || 6-Exit");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    ob.FrontInsertion();
                    break;

                case 2:
                    ob.FrontDeletion();
                    break;

                case 3:
                    ob.RearInsertion();
                    break;

                case 4:
                    ob.RearDeletion();
                    break;

                case 5:
                    ob.display();
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
