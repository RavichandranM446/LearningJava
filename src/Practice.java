import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner funny=new Scanner(System.in);
       int number;
       Scanner odd=new Scanner(System.in);
        System.out.println("Enter your Number:");
        number= odd.nextInt();
        if(number%2==0){
            System.out.println("The given number is even"+number);
        }
        else {
            System.out.println("The given number is odd"+number);
        }
    }
}
