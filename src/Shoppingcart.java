import java.util.Scanner;
public class Shoppingcart {
    public static void main(String[] args) {
        //SHOPPING CART PROGRAM
        Scanner shop =new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency='$';
        double total;
        System.out.println("What would you like to buy:");
        item= shop.nextLine();
        System.out.println("What is the price of the each?:");
        price=shop.nextDouble();
        System.out.println("How many would you like to buy:");
        quantity= shop.nextInt();
        total=price*quantity;
        System.out.println("\n you have bought " +quantity+ " " +item+ "/s");
        System.out.println("Total of the cost is:"+currency+total);
        shop.close();
    }
}
