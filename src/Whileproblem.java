import java.util.Scanner;
public class Whileproblem {
    public static void main(String[] args) {
        Scanner pro=new Scanner(System.in);
        int number=0;
        while (number<1||number>10){
            System.out.println("Enter a number between 1-10:");
            number= pro.nextInt();
        }
        System.out.println("You picked 70" + number);
    }
}
