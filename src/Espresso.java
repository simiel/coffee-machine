public class Espresso extends Coffee {
    int numberOfShots;
    public Espresso(String name, String roast, double price, int numberOfShots){
        super(name, roast, price);
        super.setCaffeineLevel();
        this.numberOfShots = numberOfShots;
    }

    public void printEspressoDetails(int servings){
        System.out.println("You asked for 3 servings! Every serving of Espresso costs 2.5$. Your total bill is " + servings*2.5 + "$");
    }
}
