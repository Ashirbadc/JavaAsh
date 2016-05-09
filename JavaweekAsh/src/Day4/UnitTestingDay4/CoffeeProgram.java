package Day4.UnitTestingDay4;

/**
 * Created by student on 06/05/2016.
 */
public class CoffeeProgram {
    static Cafe cafe = new Cafe();

    public static void main(String[] args){

        cafe.restockBeans(CoffeeType.CAPPUCHINO.getRequiredBeans());
        cafe.restockMilk(CoffeeType.CAPPUCHINO.getRequiredMilk());

        Coffee coffee = cafe.brewCoffee(CoffeeType.CAPPUCHINO);
        System.out.println(coffee.toString());
    }
}
