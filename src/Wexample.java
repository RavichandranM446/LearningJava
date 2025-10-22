import java.util.Scanner;
public class Wexample {
    public static void main(String[] args) {
        Scanner ex=new Scanner(System.in);
        int age=0;
        System.out.println("Enter Your Age");
        age=ex.nextInt();
        while(age<0){
            System.out.println("your age can't be negative");
            System.out.println("Enter Your Age");
            age=ex.nextInt();

        }
        System.out.println("you are" + age + "years old");
    }
}
