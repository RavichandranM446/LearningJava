import java.util.Scanner;
public class Weightconverter {
    public static void main(String[] args) {
        Scanner weight=new Scanner(System.in);
        int edai;
        String kanaku;
        double result;
        System.out.println("Enter your weight");
        edai= weight.nextInt();
        weight.nextLine();
        System.out.println("Enter your Edai:");
        kanaku= weight.nextLine();
        if(kanaku.equals("gram")){
            result=edai*1000;
            System.out.println("Your weight in grams"+result);
        } else if (kanaku.equals("Pounds")) {
            result=edai*2.20462;
            System.out.println("Your weight in Pounds"+result);
        }
        else if (kanaku.equals("gramkg")) {
            result=edai/1000;
            System.out.println("Your weight in gramskg"+result);
        }
        else if (kanaku.equals("GramPounds")) {
            result=edai/2.20462;
            System.out.println("Your weight in GramsPounds"+result);
        }
        else {
            System.out.println("You given a wrong edai" + kanaku);
        }
        weight.close();
    }
}
