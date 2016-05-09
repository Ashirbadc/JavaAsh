package Day4.UnitTestingDay4;

/**
 * Created by student on 06/05/2016.
 */
public enum CoffeeType {
    ESPRESSO(10, 0), LATTE(95,150), CAPPUCHINO(7, 100), FILTERCOFFEE(10,0);

    private final int requiredBeans;
    private final int requiredMilk;

    CoffeeType(int requiredBeans, int requiredMilk){

        this.requiredBeans = requiredBeans;
        this.requiredMilk = requiredMilk;
    }

    public int getRequiredBeans() {
        return requiredBeans;
    }

    public int getRequiredMilk() {
        return requiredMilk;
    }
}
