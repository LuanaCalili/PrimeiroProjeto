import java.util.Scanner;  

public class exemplo10 {
    public static void main(String[] args) {
        int op;  
        Scanner input = new Scanner(System.in);  
        System.out.print("Digite uma opção: "); 
        op = input.nextInt();  
        do{
            System.out.println("op vale " + op); 
            op ++; 
        }while(op <= 3);
    }
} 

