import java.util.Scanner;
public class Weekend {
    public static void main(String[] args) {
      Scanner student=new Scanner(System.in);
        System.out.println("Students Detail Form");
        System.out.println("Enter Your Name");
        String name= student.nextLine();
        System.out.println("Enter Your RollNo:");
        int roll = student.nextInt();
        System.out.println("Enter Your Maths mark:");
        int math = student.nextInt();
        System.out.println("Enter Your Science mark:");
        int science = student.nextInt();
        System.out.println("Enter Your Social mark:");
        int social = student.nextInt();
        int total=math+science+social;
        int average=total/3;
        if(math>90){
            System.out.println("The grade of the math is A");
        }
        else{
            System.out.println("The grade of the math is B");
        }
        if(science>90){
            System.out.println("The grade  of the science is A");
        }
        else{
            System.out.println("The grade of the science is B");
        }
        if(social>90){
            System.out.println("The grade of the social is A");
        }
        else{
            System.out.println("The grade of the social is B");
        }
        System.out.println("The average is :"+average);
        System.out.println("The total of the 3 subject is:"+total);
        System.out.println("The maths mark is:"+math);
        System.out.println("The science mark is:"+science);
        System.out.println("The social mark is:"+social);
        System.out.println("Successfully finished");
      student.close();
    }
}
