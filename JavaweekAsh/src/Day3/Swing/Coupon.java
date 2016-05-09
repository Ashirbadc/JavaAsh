package Day3.Swing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by student on 05/05/2016.
 */
public class Coupon {

    private String description;
    private double value;
    private Scanner fileReader;

    public double getValue() {
        return value;
    }

    public Coupon(String description, double value) {
        this.description = description;
        this.value = value;

    }

    @Override
    public String toString() {
        return "Coupon{" +
                "description='" + description + '\'' +
                ", value=" + value +
                '}';
    }

    public void loadInforFromFile()
    {
        Scanner fileReader = new Scanner(getClass().getResourceAsStream("input.text"));
    }
     public Scanner getFileReader(){

         return fileReader;
     }

    public String getDescription() {
        return description;
    }

    public void saveToAFile(String fileName) throws FileNotFoundException
     {
         File file = new File(fileName);
         PrintWriter pw = new PrintWriter(file);
         pw.println("Description: " + getDescription());
         pw.println("Value: £" + getValue());
         pw.close();
     }
}
