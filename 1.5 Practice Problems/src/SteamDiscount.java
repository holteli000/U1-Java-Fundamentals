public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */

    public static void main(String[] args) {

        double price = 60.00;
        double discount = 20.00;

        double total = price * (1 - discount/100 );

        System.out.println("the price is: " + total);
    }
}
