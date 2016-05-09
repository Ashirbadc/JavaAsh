package DataTyesAndControlStatement;

import java.util.Scanner;

/**
 * Created by student on 03/05/2016.
 */
public class ControlStatement {

    public static void main(String[] args) {
        WhileLoopInfinite();
        SimpleIf();

    }

    static void SimpleIf() {

        System.out.println("Enter a number: ");

        Scanner scan = new Scanner(System.in);
        char number = scan.next().charAt(0);

        // check for a character or number
        //if character - check upper or lower case
        // if number check where its > 5 or not

        if (Character.isLetter(number) || Character.isDigit(number)) {
            if (Character.isUpperCase(number))
                System.out.println("Your char is upper case");
            else if (Character.isLowerCase(number))
                System.out.println("Your char is lower case");
            else if (Character.isDigit(number) && number > 5)
                System.out.println("Your char is a digit or more than 5");
        } else
            System.out.println("Your char is not a number or character");
    }

    static void WhileLoopInfinite()
    {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        boolean keepgoing = true;

        while (keepgoing) {
            System.out.println("Enter a number: ");
            num = scan.nextInt();
            if (num == 20) {
                keepgoing = false;
                System.out.println("You found 20!");
            }


        }
    }
}








