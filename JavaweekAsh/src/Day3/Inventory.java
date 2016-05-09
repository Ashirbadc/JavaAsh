package Day3;

import Day3.Swing.Supplier;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import static Day3.Computer.BY_UNITBYSTOCK;



/**
 * Created by student on 05/05/2016.
 */
public class Inventory implements Iterator<Computer> {

    List<Computer> computers = new ArrayList<>();
    private final int maxSize;
    private int size;
    private static final int ProductDoesNotExist = 0;

    public Inventory(int maxSize)
    {
        this.maxSize = maxSize;
        //this.size = 0;
    }

    public int getSize() {return computers.size(); }

   // public void addProduct()
   // {
       // computers.add(macBookPro);
       // computers.add(lenovoThinkPad);
   // }

    public Computer getProduct(int index)
    {
        return computers.get(index);
    }

public void replaceProduct(Computer oldComputer, Computer newComputer){

    final int index = computers.indexOf(oldComputer);
    if (index != ProductDoesNotExist) {
        computers.set(index, newComputer);

    }
}
    public void prepareProducts(){

        //sort the product
        computers.sort(BY_UNITBYSTOCK);
    }
    public void isSuppliedBy(Supplier supplier){

        computers.addAll(supplier.getProducts());
    }

public Iterator<Computer> iterator() {return computers.iterator(); }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Computer next() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer<? super Computer> action) {

    }
}
