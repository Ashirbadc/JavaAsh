package Day4.UnitTestingDay4;

/**
 * Created by student on 06/05/2016.
 */
public class Cafe {
    private int beansInStock = 0;
    private int milkInStock = 0;

    public void restockBeans(int beansInGrams)
    {

        beansInStock += beansInGrams;
    }
    public void restockMilk(int milkInMililetres)
    {

        milkInStock += milkInMililetres;
    }

    public int getBeansInStock() {
        return beansInStock;
    }

    public int getMilkInStock() {
        return milkInStock;
    }

    //method overloading
    public Coffee brewCoffee(CoffeeType coffeeType) {
        return brewCoffee(coffeeType, 1);
    }
    public Coffee brewCoffee(CoffeeType coffeeType, int quantity){

        int requiredBeans = coffeeType.getRequiredBeans() * quantity;
        int requiredMilk = coffeeType.getRequiredMilk() * quantity;

        if(requiredBeans > beansInStock || requiredMilk > milkInStock){

            throw new IllegalStateException("Not enough stock to brew man!");
        }

        beansInStock -= requiredBeans;
        milkInStock -= requiredMilk;

        return new Coffee(coffeeType, requiredBeans, requiredMilk);
    }
    public void requiredPositiveValue(int value){
        if(value < 1) throw new IllegalArgumentException();
    }
}
