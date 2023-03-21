import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Scientific_Calculator {

    private final static Logger logger = LogManager.getLogger(Scientific_Calculator.class);

    public static void main(String[] args)
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
                break;
            }
        }
    }

    public double sq_root(double num) {
        if(num < 0){
            logger.error("[ERROR - SQRT] - square root function is given -ve number");
            return -1;
        }
        double result;
        result = Math.sqrt(num);
        logger.info("[SQRT] - " + num);
        logger.info("[RESULT - SQRT] - " + result);
        return result;
    }

    public double fact(double num) {
        if(num < 0){
            logger.error("[ERROR - FACTORIAL] - factorial function does not work with -ve number");
            return -1;
        }
        int result = 1;
        for(int i = 1; i <= num; i++){
            result = result * i;
        }
        logger.info("[FACTORIAL] - " + num);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double nlog(double num) {
        if(num < 0){
            logger.error("[ERROR - LOG] - natural log function does not work with -ve number");
            return -1;
        }
        double result;
        result = Math.log(num);
        logger.info("[LOG] - " + num);
        logger.info("[RESULT - LOG] - " + result);
        return result;
    }

    public double power(double x, double y) {

        double result;
        result = Math.pow(x,y);
        logger.info("[POWER] - " + x + ", " + y);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }
}