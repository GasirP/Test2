package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
   /*     Integer number = 2;
        if (number == 0 ) {
            System.out.println("Zero");
        }
        else if (number == 1 ) {
            System.out.println("One");
        }
        else if (number == 2 ) {
            System.out.println("Two");
        }
        else if (number == 3 ) {
            System.out.println("Three");
        }
switch (number) {
    case 0:
        System.out.println("Zero");
        break;
    case 1:
        System.out.println("One");
        break;
    case 2:
        System.out.println("Two");
        break;
    case 3:
        System.out.println("Three");
    default:
        System.out.println("I dont know");
        break;
}
String massege =switch (number){
            case 1-> "One";
            case 0-> "Zero";
            case 2-> "dwa";
            case 3-> "trzy";
            default -> "I dont know";
};
        System.out.println(massege);

    */
        // 1. How to read text, whole number or real number, typed in by the user?
      /*  Scanner scanner = new Scanner(System.in); // Initialize scanner object

        System.out.println("Please write a line of text:");
        String userInput = scanner.nextLine(); // scan for String

        System.out.println("Please write an integer");
        Integer userInteger = scanner.nextInt(); // Scan for Integer

        System.out.println("Please write a real number");
        Double userDouble = scanner.nextDouble(); // Scan for Double

        System.out.println(userInput);
        System.out.println(userInteger);
        System.out.println(userDouble);

// 2. How to check whether the number is odd or even?
        if (userInteger % 2 == 0) { // Check divisibility by calculating modulo
            System.out.println(userInteger + " is an even number!");
        }
        else {
            System.out.println(userInteger + " is an odd number!");
        }

// 3. How to repeat a selected block of code several times?
        Integer count = 1;
        while (count <= 10) { // while-loop - "if which repeats itself"
            System.out.println("Repetition " + count);
            count++; // post-incrementation
            // count += 1; // additive assignment
            // count = count + 1; // assignment
        }
        System.out.println("End of the loop");

       */
  /*      Scanner scanner = new Scanner(System.in);
        System.out.println("please write your name");
        String userInput= scanner.nextLine();
        if (userInput == "") {
            System.out.println("empty!");
        }
        else {
            System.out.println("Hello " + userInput);
        }

        System.out.println("Please write an integer");
        Scanner scanner = new Scanner(System.in);
        Integer userInteger = scanner.nextInt();
        if (userInteger % 2 == 0) {
             System.out .println( "This is an even number!");
        }
        else {
            System.out .println( "This is an odd number!");
        }
   */
        // 1 Exponation by loop
    Scanner scanner = new Scanner(System.in);
    System.out.println( ("Exponation- Provide base number"));
        Integer x = scanner.nextInt();
        System.out.println( ("Exponation- Provide number"));
        Integer y = scanner.nextInt();
        Integer count = 1;
        Integer sum = x;
        while (count < y) {
            sum = sum * x;
            count +=1;
        }
        System.out.println(sum);
        // 2 factorial by loop
        System.out.println( ("Provide number to factorial"));
        Integer a = scanner.nextInt();
        Integer count2 = a-1;
        Integer sum2= a;
        while (count2 > 0) {
            sum2 = sum2 * count2;
            count2 -=1;
        }
        System.out.println(sum2);


    // 3. Counting  from 100 to 0 and add Fizz/Buzz depends on dividing by 3/5
        Integer b= 100;
        while (b >= 0) {
            if (b % 5 == 0 && b % 3 ==0 ) {
                System.out.println("FizzBuzz");
            }
            else if (b % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (b % 3 == 0) {
                System.out.println("Fizz");
            }
            else System.out.println(b);
            b -= 1;

        }

        //Fibonacci
        System.out.println("Number of Fibonacci lenght");
        Integer f = scanner.nextInt();
        Integer num1 = 1;
        Integer num2 = 0;
        Integer num3 = 0;

        if (f > 0) {
            System.out.println(num2);
            System.out.println(num1);
        }

        while (f > 0) {
            num3 = num2 + num1;
            f -= 1;
            num2 = num1;
            num1 = num3;
            System.out.println(num3);
        }


    }

}
