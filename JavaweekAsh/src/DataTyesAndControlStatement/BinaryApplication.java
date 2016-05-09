package DataTyesAndControlStatement;

import java.util.Scanner;

/**
 * Created by student on 03/05/2016.
 */
public class BinaryApplication {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // get int of binary digits
        //String binary = input.nextLine();
       // BinaryConversion(binary);


    }

    static void BinaryConversion(String binary)
    {
       int result = 0, mult =1;
        for(int i=binary.length()-1; i >= 0; i--){

        if(binary .charAt(i) == '1'){
            result += mult;
        }
        mult = mult*2;
    }
        System.out.println("decimal value: " + result);
    }

    }




