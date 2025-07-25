import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 1
            /**
             * String firstName = "Minko"
             * String secondName = "Atanasov"
             * String lastName = "Vasilev"
             * System.out.printf("%s %s %s", firstname, secondName, lastName) || System.out.println(firstName + " " + secondName + " " + lastName) || printName("Minko","Atanasov","Vasilev");
             */
        //Task 2 *Нека предположим, че потребителят ще въведе три цели или три с десетична запетая, за да запазим задачата проста
            /**
             * System.out.println(triangleP(2,3,5));
             * System.out.println(triangleP(2.3,3.2,5.3));
             */
        //Task 3
            /**
             * System.out.println(triangleArea(3.0,5.0));
             */
        //Task 4
            /*for (int i = 1;i<=30;i++){
                for(int y = 30 - i; y >= 0; y--){
                    System.out.print(" ");
                }
                for(int j = 1; j<= i; j++){
                    System.out.print("*");
                }
                if(i!=1){
                for(int j = 1; j<= i; j++){
                    System.out.print("*");
                }}
                System.out.println();
            }*/
        //Task 5
            /*Scanner userInput = new Scanner(System.in);

            System.out.println("Lets get the perimeter:");
            System.out.print("Value for a: ");
            double a = userInput.nextDouble();
            System.out.print(" Value for b: ");
            double b = userInput.nextDouble();
            System.out.print(" Value for c: ");
            double c = userInput.nextDouble();

            System.out.println("The perimeter is "+triangleP(a,b,c));
            System.out.println("Lets get the area:");
            System.out.print("Base: ");
            double base = userInput.nextDouble();
            System.out.print(" Height: ");
            double height = userInput.nextDouble();
            System.out.println("The area is: " + triangleArea(base,height));
            */
        //Task 6
        Scanner userInput = new Scanner(System.in);
        System.out.println("Minutes :");
        double minutes = userInput.nextDouble();
        double days = Double.valueOf(minutes / 1440);
        double years = Double.valueOf(minutes / 525600);
        System.out.println(minutes + " minutes are " + days + " days and " + years + " years.");

    }
    //Task 1 method
    static void printName(String firstName, String secondName, String lastName){
        System.out.printf("Hello %s %s %s", firstName, secondName, lastName);
    }
    //Task 2 methods
    static Double triangleP(double a, double b, double c){
        return a + b + c;
    }
    static Double triangleP(int a, int b, int c){
        return Double.valueOf(a + b + c); //Нека се придържаме към това, резултатът винаги да е в double
    }
    //Task 3 method
    static Double triangleArea(double b, double h){

        return (b * h) / 2;
    }
}