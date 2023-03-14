package org.example;

import java.util.Scanner;

public class Scientific_Calculator {

    public static void main(String args[])
    {
        Scientific_Calculator calculator = new Scientific_Calculator();
        Scanner myObj = new Scanner(System.in);
        System.out.println("The user has started the Scientific Calculator");

        double result = 0;
        boolean exit = false;
        while(!exit)
        {

            System.out.println("Enter the key number for the operation."+'\n'+"  The following is index 1: Square Root, 2: Factorial, 3: Natural Log, 4: Power, 5: Exit the calculator");
            int key = myObj.nextInt();

            double x = 0;
            double y = 0;

            if (key == 1)
            {
                System.out.println("Enter the number");
                x = myObj.nextDouble();
                result = calculator.sq_root(x);
                System.out.println("The required result is :" + result);
            }
            else if (key == 2)
            {

                System.out.println("Enter the number");
                x = myObj.nextDouble();
                result = calculator.fact(x);
                System.out.println("The required result is :" + result);
            }
            else if (key == 3)
            {
                System.out.println("Enter the number");
                x = myObj.nextDouble();
                result = calculator.nlog(x);
                System.out.println("The required result is :" + result);
            }
            else if (key == 4)
            {
                System.out.println("Enter the first number");
                x = myObj.nextDouble();
                System.out.println("Enter the second number");
                y = myObj.nextDouble();
                result = calculator.power(x,y);
                System.out.println("The required result is :" + result);
            }

            else if(key == 5)
            {
                System.out.println("The user has closed the Scientific Calculator");
                exit = true;
                break;
            }

        }

    }

    public double sq_root(double num) {

        double result;
        result = Math.sqrt(num);
        return result;
    }

    public double fact(double num) {

        if (num == 0)
            return 1;
        else
            return(num * fact(num-1));
    }

    public double nlog(double num) {

        double result;
        result = Math.log(num);
        return result;
    }

    public double power(double x, double y) {

        double result;
        result = Math.pow(x,y);
        return result;
    }
}