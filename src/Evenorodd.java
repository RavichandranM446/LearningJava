import java.util.Scanner;
public class Evenorodd {
    public static void main(String[] args) {
        Scanner ternary=new Scanner(System.in);
        System.out.println("Enter the Number");
        int number=ternary.nextInt();
        String evenorodd=(number%2==0)?"Even":"Odd";
        System.out.println(evenorodd);
    }


}
