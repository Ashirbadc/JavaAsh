package Day4.UnitTestingDay4;

/**
 * Created by student on 06/05/2016.
 */
import org.junit.*;

public class CoffeeUnitTesting {

    private Cafe cafe = new Cafe();
    private static final int NOMILK = 0;
    private static final int NOBEANS = 0;

    @Test
    public void mustRestockBeans(){

        //GIVEN


        //WHEN
        cafe.restockBeans(100);
        //THEN
        Assert.assertEquals("Failed to restock beans", 100, cafe.getBeansInStock());
    }

    @Test
    public void canBrewCappuchino(){
        cafe.restockBeans(CoffeeType.CAPPUCHINO.getRequiredBeans());
        cafe.restockMilk(CoffeeType.CAPPUCHINO.getRequiredMilk());

        //WHEN
        Coffee coffee = cafe.brewCoffee(CoffeeType.CAPPUCHINO);
        //THEN
        //Assert.assertEquals("Not enough beans", 7, cafe.getBeansInStock());
        Assert.assertEquals("Wrong Coffee Type", CoffeeType.CAPPUCHINO, coffee.getType());
    }

    @Test
    public void canBrewEspresso(){
        cafe.restockBeans(CoffeeType.ESPRESSO.getRequiredBeans());

        //when
        Coffee coffee = cafe.brewCoffee(CoffeeType.ESPRESSO);

        //THEN
        Assert.assertEquals("Wrong Coffee Type", CoffeeType.ESPRESSO, coffee.getType());
    }

}
