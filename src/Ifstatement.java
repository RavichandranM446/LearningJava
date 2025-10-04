import java.util.Scanner;

public class Ifstatement {
    public static void main(String[] args) {
        Scanner vayasu = new Scanner(System.in);
        int age=-8;
        String name;
        System.out.println("Enter your name ");
name= vayasu.nextLine();
if(name.isEmpty()){
    System.out.println("you didnt enter your name:");
}
else{
    System.out.println("Hello"+name+"!");
}
       if(age > 18){
            System.out.println("You are an adult");
        } else if (age<0) {
            System.out.println("you are not yet born");

        } else{
            System.out.println("you are an child");
        }
       vayasu.close();
    }
}
