import java.util.Objects;

// Inherit from Coffee using the extends keyword
public class Latte extends Coffee {
    // Declare two attributes to store the milk type and syrup flavor (String)
    String milkType;
    String syrupFlavor;

    // Constructor to initialize all attributes
    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) {
        // Use super to call the Coffee constructor
        super(name, roast, price);

        // Initialize milkType and syrupFlavor using this
        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }

    // TODO 11: Override the grindBeans() method
    @Override
    public void grindBeans(){
        System.out.println("Grinding coffee beans coarsely for a latte (medium grind)");
    }
    // TODO 12: Override the brewCoffee() method to simulate brewing coffee for latte, and all the other preparation steps
    @Override
    public void brewCoffee() {
        System.out.println("Brewing espresso for your latte...");
        if (syrupFlavor != null && !syrupFlavor.isEmpty()) {
            System.out.println("Adding " + syrupFlavor + " syrup...");
        }
        System.out.println("Steaming " + milkType + "...");
        System.out.println("Combining espresso with steamed milk...");
        System.out.println("Adding a layer of foam on top.");
    }
    // TODO 13: Override the printInfo() method to print the common and specific details of espresso including the bill
    @Override
    public void printInfo() {
        // TODO 14: Call the printInfo() method from the Coffee class using super
        super.printInfo();
        // TODO 15: Cut the print statements from the printLatteDetails() method and paste them here
        System.out.println("Your latte has " + milkType + " milk and " + syrupFlavor + " flavor.");
        System.out.println("Your total bill is " + price + "$.");
    }

    // TODO 16: Delete this method because it is not needed anymore

}
