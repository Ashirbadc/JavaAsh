package Day3;

import java.util.ArrayList;
import java.util.List;

import static Day3.GenerateProduct.*;


/**
 * Created by student on 05/05/2016.
 */
public class InventorySystem {

    public  static void main(String[] args)
    {

        Inventory inventory = new Inventory(500);
        List<Computer> computers = new ArrayList<>();

        //inventory.addProduct();

        //for(int i=0; i<inventory.computers.size(); i++)
       // {
       //     computers.add(inventory.getProduct(i));
           // System.out.println(computers.get(i));
       // }


        inventory.isSuppliedBy(alex);
        inventory.isSuppliedBy(grant);

        System.out.println(alex);

        inventory.replaceProduct(lenovoThinkPad, dellAllenware);
        inventory.prepareProducts();

        for(int i=0; i<inventory.computers.size(); i++) {

            System.out.println(inventory.computers.get(i));
        }
        }




}
