import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Length:");
        int Length = scanner.nextInt();
        System.out.println("Your Length of the Rectangle is " + Length);
        System.out.print("Enter your Width:");
        int Width = scanner.nextInt();
        System.out.println("Your width of the rectangle is " + Width);

        int Area = Length * Width;
        System.out.println("Area of the rectangle is " + Area);

        scanner.close();
    }
}
