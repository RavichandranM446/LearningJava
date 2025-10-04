
import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args) {
        //HYPOTENUSE math.sqrt(a2+b2)
        Scanner hypo=new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Enter the length of the side A");
        a= hypo.nextDouble();
        System.out.println("Enter the length of the side B");
        b= hypo.nextDouble();
        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("The hypotenuse is"+c);
        hypo.close();
    }
}
