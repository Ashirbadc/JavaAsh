package Day3;

/**
 * Created by student on 05/05/2016.
 */
public interface Product {

    //methods  get set products information
    void setItemNumber(int itemNo);
    int getItemNumber();

    void setName(String name);
    String getName();

    void setPrice(double price);
    double getPrice();

    void setUnitsInStock(int unitsInStock);
    int getUnitsInStock();


}
