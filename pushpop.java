import java.util.Scanner;
public class pushpop {
Scanner sc=new Scanner(System.in);

int size;


int array[];
int top=-1;

void input(){
    System.out.println("input the size of the array");
    size=sc.nextInt();
    array=new int [size];
}

int push(){
    
    if(top==(size)){
        System.out.println("overflow");
        return 1;
    }
    
    else {
        System.out.println("enter the element");
        int element =sc.nextInt();

        top=top+1;
        array[top]=element;
        return 2;
    }
}

int pop(){
    if(top==-1){
        System.out.println("underflow");
    }
    else if(top>=0){
        System.out.println("deleted element " + array[top]);
        top=top-1;
        
    }
    return 5;

}

void display(){
    for(int i=top;i>=0;i--){
        System.out.print("|" + array[i] + "|");
    }
    System.out.println();
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        pushpop ob=new pushpop();

        ob.input();

        while(true){
        System.out.println("1-Push 2-Pop 3-Display 4-Exit");
        int option=sc.nextInt();
        switch(option){

            case 1:
            ob.push();
            break;

            case 2:
            ob.pop();
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
