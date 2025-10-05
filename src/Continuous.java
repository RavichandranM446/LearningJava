import java.util.Scanner;
public class Continuous {
    public static void main(String[] args) {
        Scanner cont=new Scanner(System.in);
        double a;
        double p;
        double e;
        double r;
        double t;
        System.out.println("Enter the p value:");
        p= cont.nextDouble();
        System.out.println("Enter the e value:");
        e= cont.nextDouble();
        System.out.println("Enter the r value:");
        r= cont.nextDouble();
        System.out.println("Enter the t value:");
        t= cont.nextDouble();
        a=p*Math.pow(e,r*t);
        System.out.println(a);
        cont.close();
    }
}
