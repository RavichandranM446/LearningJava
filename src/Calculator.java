import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner cal=new Scanner(System.in);
        double Number1;
        char operator;
        double Number2;
        double result=0;
        System.out.println("Enter the first number:");
        Number1= cal.nextDouble();
        cal.nextLine();
        System.out.println("Enter Your Operator:'+','-','*','/','^'");
        operator=cal.next().charAt(0);
        System.out.println("Enter the second Number:");
        Number2= cal.nextDouble();
        switch(operator){
            case'+' -> result=Number1+Number2;
            case'-' -> result=Number1-Number2;
            case'*' -> result=Number1*Number2;
            case'/' -> {
                if(Number2==0){
                    System.out.println("Cannot divided by zero");
                }
                else{
                    result=Number1/Number2;
                }
            }
            case'^' -> result=Math.pow(Number1,Number2);

        }
        System.out.println(result);
        cal.close();
    }
}
