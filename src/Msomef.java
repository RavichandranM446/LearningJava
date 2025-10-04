import java.util.Scanner;
public class Msomef {
    public static void main(String[] args) {
      Scanner some=new Scanner(System.in);
      double radius;
      double circumference;
      double area;
      double volume;
        System.out.println("Enter the radius: ");
        radius= some.nextDouble();
        circumference=2*Math.PI*radius;
        System.out.printf("The circumference is: %.1fcm\n",circumference);
        area=Math.PI*Math.pow(radius,2);
        System.out.printf("The area is:  %.1fcm\n",area);
        volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);
        System.out.printf("The volume is:  %.1fcm\n",volume);
        some.close();
    }
}
