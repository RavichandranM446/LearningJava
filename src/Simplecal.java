import java.util.Scanner;
public class Simplecal {
    public static void main(String[] args) {
        Scanner cal=new Scanner(System.in);
        int number1;
        int number2;
        char op;
        double result;
        System.out.println("Enter a number1");
        number1= cal.nextInt();
        System.out.println("Enter a number2");
        number2= cal.nextInt();
        System.out.println("Enter the operator:");
        op=cal.next().charAt(0);
        if (op=='+'){
            result=number1+number2;
            System.out.println("The addition of the two number is "+result);
        }
        else if (op=='-'){
            result=number1-number2;
            System.out.println("The subtraction of the two number is "+result);
        }
        else if (op=='*'){
            result=number1*number2;
            System.out.println("The multiplication of the two number is "+result);
        }
        else if (op=='/'){
            if(number2!=0){
                result=number1/number2;
                System.out.println("The division of the two number is "+result);
            }
            else {
                System.out.println("It is not divided by 0");
            }
        }
        cal.close();

    }
}
