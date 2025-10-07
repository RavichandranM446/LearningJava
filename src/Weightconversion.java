import java.util.Scanner;
public class Weightconversion {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      double weight;
      double newweight;
      int choice;
        System.out.println("Weight conversion Program");
        System.out.println("1: converts lbs to kgs");
        System.out.println("2: converts kgs to lbs");
        System.out.print("choose an option");
        choice=scanner.nextInt();
        if (choice==1){
            System.out.println("Enter the weight in lbs");
            weight=scanner.nextDouble();
            newweight=weight*0.453592;
            System.out.printf("The new weight in kgs is :%.2f",newweight);
        }
         else if (choice==2){
            System.out.println("Enter the weight in kgs");
            weight=scanner.nextDouble();
            newweight=weight*2.20462;
            System.out.printf("The new weight in lbs is :%.2f",newweight);
        }
         else {
            System.out.println("Invalid choice will be entered");
        }
         scanner.close();
    }
}
