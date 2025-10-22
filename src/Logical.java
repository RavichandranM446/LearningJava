import java.util.Scanner;
public class Logical {
    public static void main(String[] args) {
        Scanner logi=new Scanner(System.in);
     String username;
     int password;
        System.out.println("Enter the username:");
        username=logi.nextLine();
        System.out.println("Enter Your Password:");
        password= logi.nextInt();
        if(username.equals("RAVI")&& password==1234){
            System.out.println("Successfully Login");
        }
        else{
            System.out.println("Access denied");
        }
        logi.close();
    }
}
