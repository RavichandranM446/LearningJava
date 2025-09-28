import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name=scanner.nextLine();
        System.out.println("Hello "+name);
        int age=scanner.nextInt();
        System.out.println("My age is"+age);
        double gpa=scanner.nextDouble();
        System.out.println("The gpa is "+gpa);
        System.out.println("Are You a student (true/false)");
        boolean isStudent =scanner.nextBoolean();
        System.out.println("I am a student:"+isStudent);
        if(isStudent){
            System.out.println("you are enrolled as a student");
        }
        else{
            System.out.println("yOu are not enrolled as a student");
        }
     scanner.close();
    }
}
