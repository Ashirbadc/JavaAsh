package Day2;

/**
 * Created by student on 04/05/2016.
 */

import java.io.*;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");

        //read line input
        String str = input.nextLine();
        System.out.println("Using Scanner: " + str);


        //create a buffer reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str2 = "";
        try{
            str2 = br.readLine();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("Using inputStreamReader: " + str2);

        //write to a file
        System.out.println(System.getProperty("user.dir"));

        String fileName = "test.txt";
        try
        {

            FileWriter filew = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(filew);
            bw.write(str2);
            bw.close();
        }
        catch (IOException e)
        {
            System.out.println("Error writing to a file: " + fileName);
        }


    }

}
