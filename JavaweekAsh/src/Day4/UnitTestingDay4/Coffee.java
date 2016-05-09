package Day4.UnitTestingDay4;

/**
 * Created by student on 06/05/2016.
 */
public class Coffee {

    private final CoffeeType type;
    private final int beans;
    private final int milk;

    public Coffee(CoffeeType cType, int beans, int milk)
    {
        this.type = cType;
        this.beans = beans;
        this.milk = milk;
    }

    public CoffeeType getType() {
        return type;
    }

    public int getBeans() {
        return beans;
    }

    public int getMilk() {
        return milk;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type=" + type +
                ", beans=" + beans +
                ", milk=" + milk +
                '}';
    }
}

