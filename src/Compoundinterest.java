import java.util.Scanner;
public class Compoundinterest {
    public static void main(String[] args) {
        Scanner compound=new Scanner(System.in);
        double principal;
        double rate;
        int times;
        int years;
        double amount;
        System.out.println("Enter the principal amount:");
        principal= compound.nextDouble();
        System.out.println("Enter the rate amount:");
        rate= compound.nextDouble()/100;
        System.out.println("Enter the time compound amount:");
        times= compound.nextInt();
        System.out.println("Enter the number of years:");
        years= compound.nextInt();
        amount=principal*Math.pow(1+rate/times,times*years);
        System.out.println(amount);
        compound.close();

    }
}
