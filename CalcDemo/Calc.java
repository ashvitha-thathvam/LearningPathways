package CalcDemo;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        char operation;
        double num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the operation (Add, Sub, Multiply, Divide)");
        operation = input.next().charAt(0);
        System.out.println("Enter the two numbers :");
        num1 = input.nextDouble();
        num2 = input.nextDouble();

        input.close();

        switch (operation) {
            case '+':
                System.out.printf("%.2f+%.2f = %.2f",num1,num2,(num1+num2));
                break;
            case '-':
                System.out.printf("%.2f-%.2f = %.2f",num1,num2,(num1-num2));
                break;
            case '*':
                System.out.printf("%.2f*%.2f = %.2f",num1,num2,(num1*num2));
                break;
            case '/':
                if (num2 != 0)
                    System.out.printf("%.2f+%.2f = %.2f",num1,num2,(num1/num2));
                else
                    System.out.println("Not possible");

                break;

        
            default:

                System.out.printf("Not a valid operation");
                System.out.printf("none of the conditions are satisfied");                


        }

  }
}
        
   


