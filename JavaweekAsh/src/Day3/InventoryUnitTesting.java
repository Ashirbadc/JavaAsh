package Day3;

/**
 * Created by student on 06/05/2016.
 */
import org.junit.*;
import org.hamcrest.*;

import static Day3.GenerateProduct.*;
import static org.hamcrest.Matchers.contains;


public class InventoryUnitTesting {

    private Inventory inventory = new Inventory(100);

    @Test
    public void canGetInventorySize()
    {
        inventory.computers.add(macBookPro);
        inventory.computers.add(lenovoThinkPad);

        //then
        Assert.assertEquals("Size not match", 2, inventory.getSize());
    }

    @Test
    public void shouldContainProduct(){
        inventory.computers.add(macBookPro);
        inventory.computers.add(lenovoThinkPad);

        //then
       MatcherAssert.assertThat(inventory.computers, contains(macBookPro, lenovoThinkPad));

    }
}
