package Day2.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by student on 04/05/2016.
 */
public class Registration {

    // define a array of person of a arraylist
    private Person[] people = new Person[150];

    //arraylist
    private final ArrayList<Person> people2 = new ArrayList<>();
    Person russel = new Person("Russel", "Peter");
    Person jonathan = new Person("Jonathan", "Ross");

    //method to register
    public Person registerUser() {
        Scanner kb = new Scanner(System.in);
        Person p = new Person();
        //ask the name
        System.out.println("Enter the First Name: ");
        String fn = kb.nextLine();

        System.out.println("Enter the Last Name: ");
        String ln = kb.nextLine();
        p.setName(fn, ln);

        System.out.println("Enter your gender: ");
        char gn = kb.next().charAt(0);
        p.setGender(gn);


        System.out.println("Enter your age: ");
        int ag = Integer.parseInt(kb.nextLine());
        p.setAge(ag);


        System.out.println("Enter your height: ");
        double hg = Double.parseDouble(kb.nextLine());
        p.setHeight(hg);

        System.out.println("Smoker(true/false): ");
        boolean smk = kb.nextBoolean();
        p.setSmoker(smk);

        System.out.println("Available(true/false): ");
        boolean avb = kb.nextBoolean();
        p.setAvailable(avb);

        return p;
    }


    public Person[] generateSample()
    {
       // people[0] = new Person("Russel", "Peter", 'M', 30, 1.50, false);
        //people[1] = new Person("Jonathan", "Ross", 'M', 32, 1.80, false);
        return people;


    }

}









