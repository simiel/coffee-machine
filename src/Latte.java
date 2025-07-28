public class Latte extends Coffee{
    String milkType;
    String syrupFlavor;

    public Latte(String name, String roast, double price, String milkType, String syrupFlavor){
        super(name, roast, price);
        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }

    public void printLatteDetails(int servings){
        System.out.println("Your latte has "+ milkType+" and "+syrupFlavor+" flavor. Your total bill is "+ this.price* servings+"$");
    }
}
