import java.util.Scanner;
public class Nested {
    public static void main(String[] args) {
        Scanner nes=new Scanner(System.in);
        int marks;
        System.out.println("Enter your mark:");
        marks= nes.nextInt();
        if(marks>0){
            if(marks>90){
                System.out.println("Grade A");
            } else if (marks>75) {
                System.out.println("Grade b");
            } else {
                System.out.println("grade c");
            }
        }
        else{
            System.out.println("No grade ");
        }
        nes.close();
    }
}
