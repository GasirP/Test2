package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Integer number = 2;
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
        break;
}

    }

}
