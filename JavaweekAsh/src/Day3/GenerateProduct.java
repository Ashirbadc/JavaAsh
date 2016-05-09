package Day3;

import Day3.Swing.Supplier;

/**
 * Created by student on 05/05/2016.
 */
public class GenerateProduct {

    public static Computer macBookPro = new Computer(1, 2000, "Macbook Pro", 100, "Apple", "Macbook", Processor.INTEL, Ram.SIXTEEN, DiskDrive.SDD, 15.0);

    public static Computer lenovoThinkPad = new Computer(2, 1800, "Think Pad", 60, "Lennovo", "Carbon", Processor.INTEL, Ram.EIGHT, DiskDrive.HDD, 15.0);

    public static Computer dellAllenware = new Computer(2, 1800, "Think Pad", 60, "Allen Ware", "Alien", Processor.AMD, Ram.EIGHT, DiskDrive.HDD, 17.0);

    //generate supplier! BOOM

    public static Supplier alex = new Supplier("Alex Computer Supply BOOM");
    public static Supplier grant = new Supplier("Grant supply All");

    static {

        alex.getProducts().add(macBookPro);
        alex.getProducts().add(lenovoThinkPad);

        grant.getProducts().add(lenovoThinkPad);
    }

}
