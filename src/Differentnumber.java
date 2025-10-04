import java.util.Random;
public class Differentnumber {
    public static void main(String[] args) {
        Random scanner=new Random();
        int number1;
        int number2;
        int number3;
        Boolean isHeads;
        number1=scanner.nextInt(1,7);
        number2=scanner.nextInt(1,10);
        number3=scanner.nextInt(1,20);
        isHeads=scanner.nextBoolean();
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
//        System.out.println(isHeads);
        if(isHeads){
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }
    }
}
