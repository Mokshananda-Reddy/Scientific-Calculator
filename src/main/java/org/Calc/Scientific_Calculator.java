package org.Calc;

import java.util.Scanner;

public class Scientific_Calculator {

    public static void main(String args[])
    {
        Scientific_Calculator calculator = new Scientific_Calculator();
        Scanner myObj = new Scanner(System.in);
        System.out.println("The user has started the Scientific Calculator");

        System.out.println("Enter the key number for the operation."+'\n'+"  The following is index 1: Square Root, 2: Factorial, 3: Natural Log, 4: Power, 5: Exit the calculator");
        int key = myObj.nextInt();

        System.out.println("Enter number of inputs");
        int n_inp = myObj.nextInt();

        double x = 0;
        double y = 0;

        if (n_inp == 1)
        {
            System.out.println("Enter the number");
            x = myObj.nextDouble();
        }

        else
        {
            System.out.println("Enter the first number");
            x = myObj.nextDouble();
            System.out.println("Enter the second number");
            y = myObj.nextDouble();
        }

        double result = 0;
        while(key != 5)
        {
            if (key == 1)
            {
                result = calculator.sq_root(x);
                System.out.println("The required result is :" + result);
            }
            else if (key == 2)
            {
                result = calculator.fact(x);
                System.out.println("The required result is :" + result);
            }
            else if (key == 3)
            {
                result = calculator.nlog(x);
                System.out.println("The required result is :" + result);
            }
            else if (key == 4)
            {
                result = calculator.power(x,y);
                System.out.println("The required result is :" + result);
            }

            System.out.println("Enter the key number for the operation");
            key = myObj.nextInt();

            if(key == 5)
            {
                System.out.println("The user has closed the Scientific Calculator");
                break;
            }

            System.out.println("Enter number of inputs");
            n_inp = myObj.nextInt();

            if (n_inp == 1)
            {
                System.out.println("Enter the number");
                x = myObj.nextDouble();
            }

            else
            {
                System.out.println("Enter the first number");
                x = myObj.nextDouble();
                System.out.println("Enter the second number");
                y = myObj.nextDouble();
            }

        }

    }

    // sq root, fact, natural log, x^y

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