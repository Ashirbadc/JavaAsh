package Day3.Swing;



import java.util.ArrayList;
import java.util.List;

import Day3.Computer;

/**
 * Created by student on 06/05/2016.
 */
public class Supplier {

    private String name;
    private final List<Computer> products = new ArrayList<>();

    public Supplier(String name) {this.name = name; }

    public List<Computer> getProducts() {return products; }

    public String getName() {return name; }

    @Override
    public String toString() {return "Supplier {Name: " + name + "Product: " + products; }
}
