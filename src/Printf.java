public class Printf {
    public static void main(String[] args) {
        String name="Mass";
        char letter='s';
        int age=30;
        double height=90.5;
        boolean isEmployed=true;
        double price=3.44;
        System.out.printf("hi %s hello\n",name);
        System.out.printf("hi %c hello\n",letter);
        System.out.printf("hi %d hello\n",age);
        System.out.printf("hi %f hello\n",height);
        System.out.printf("hi %b hello\n",isEmployed);
        System.out.printf("hi i am %s i am %d years old\n",name,age);
        System.out.printf("%+.2f\n",price);
    }
}
