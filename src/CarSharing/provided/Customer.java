package CarSharing.provided;
/**
 * 
 * A customer in the car sharing system.<br>
 * 
 * Skeleton implementation containing most basic members.
 * 
 *  @ProgrammingProblem.Hint provided
 */
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(Customer orig) {
        this.name = new String(orig.name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
//persondetails
}