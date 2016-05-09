package Day2.AddressBook;
import java.io.File;
/**
 * Created by student on 04/05/2016.
 */
public class AddressBookProgram {

    public static void main(String[]args)
    {
        //load contact from our file
        System.out.println(System.getProperty("user.dir"));

        AddressBook addressBook = new AddressBook();

        try
        {
            addressBook.loadContactFromFile(new File("ContactDetails.txt"));
            System.out.println("We Boom it");

        }catch (Exception e)
        {
            System.out.println("Failed Man! not Boom");
        }
        addressBook.printAllContacts();

        //after sort
        addressBook.sortByLastName();
        addressBook.printAllContacts();

        System.out.println(addressBook.searchContactByLastName("Kennedy"));
    }




}

