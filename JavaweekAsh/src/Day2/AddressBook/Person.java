package Day2.AddressBook;

/**
 * Created by student on 04/05/2016.
 */
public class Person {

    private String firstName;
    private String lastName;
    char gender;
    int age;
    double height;
    boolean smoker;
    boolean available;

    public Person()
    {
        available = true;
    }

    public Person(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public Person(String fn, String ln, char gn, int ag, double hg, boolean smk, boolean avb) {
        this();
        this.firstName = fn;
        this.lastName = ln;
        this.gender = gn;
        this.age = ag;
        this.height = hg;
        this.smoker = smk;
        this.available = avb;
    }

    public void setName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(char gn) {
        this.gender = gn;
    }

    public int getGender() {
        return gender;
    }

    public void setAge(int ag) {
        this.age = ag;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(double hg) {
        this.height = hg;
    }

    public double getHeight() {
        return height;
    }

    public void setSmoker(boolean smk) {
        this.smoker = smk;
    }

    public boolean getSmoker() {
        return smoker;
    }

    public void setAvailable(boolean avb) {
        this.available = avb;
    }

    public boolean getAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return  "FirstName: " + firstName + "LastName: " + lastName;
}

}





