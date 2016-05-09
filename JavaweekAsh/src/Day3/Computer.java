package Day3;

import java.util.Comparator;

/**
 * Created by student on 05/05/2016.
 */
public class Computer implements Product {
    private int itemNumber = 0;
    private String name = "";
    private double price = 0;
    private int unitsInStock = 0;
    private String model;
    private String brand;
    Processor processor;
    Ram ram;
    DiskDrive diskDrive;
    double screenSize;

    //create comparator
    public static final Comparator<Computer> BY_UNITBYSTOCK = new Comparator<Computer>() {
        @Override
        public int compare(final Computer c1, final Computer c2) {
            return Double.compare(c1.getUnitsInStock(), c2.getUnitsInStock());
        }
    };


    public Computer(int itemNo, double price, String name, int unitsInStock, String brand, String model, Processor processor, Ram ram, DiskDrive diskDrive, double sz) {

        this.itemNumber = itemNo;
        this.price = price;
        this.name = name;
        this.unitsInStock = unitsInStock;
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.diskDrive = diskDrive;
        this.screenSize  = sz;

    }




    void setBrand(String brand) {this.brand = brand; }
    String getBrand() {return brand; }

    void setModel(String model) {this.model = model; }
    String getModel() {return model; }

    void setRam(Ram ram) {this.ram = ram; }
    Ram getRam() {return ram; }

    void setProcessor(Processor pc) {this.processor = pc; }
    Processor getProcessor() {return processor; }


    void setDiskDrive(DiskDrive disk) {this.diskDrive = disk; }
    DiskDrive getDiskDrive() {return diskDrive; }

    void setScreenSize(double sz) {this.screenSize = sz; }
    double getScreenSize() {return  screenSize;}


    @Override
    public void setItemNumber(int itemNo) {
        itemNumber = itemNo;


    }

    @Override
    public int getItemNumber() {
        return itemNumber;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;

    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;

    }

    @Override
    public int getUnitsInStock() {
        return unitsInStock;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "itemNumber=" + itemNumber +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", unitsInStock=" + unitsInStock +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", processor=" + processor +
                ", ram=" + ram +
                ", diskDrive=" + diskDrive +
                ", screenSize=" + screenSize +
                '}';
    }
}

enum Processor{INTEL, AMD}
enum Ram {FOUR, EIGHT, SIXTEEN, THIRTYTWO}
enum DiskDrive {HDD, SDD}