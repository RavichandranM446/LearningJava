import java.util.Scanner;
public class Madlibsgame {
    public static void main(String[] args) {
        // game
        Scanner mad=new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        System.out.println("Enter an adjective(description): ");
        adjective1= mad.nextLine();
        System.out.println("Enter a noun (animal or person):");
        noun1= mad.nextLine();
        System.out.println("Enter an adjective (description):");
        adjective2= mad.nextLine();
        System.out.println("Enter a verb with ing (action):");
        verb1= mad.nextLine();
        System.out.println("Enter a adjective (description):");
        adjective3= mad.nextLine();

        System.out.println("Today i went to a "+adjective1 +"zoo");
        System.out.println("In an exhibit,i saw a "+noun1+".");
        System.out.println(noun1+"was"+adjective2+"and"+verb1+"!");
        System.out.println("I was "+adjective3+"!");
        mad.close();
    }
}
