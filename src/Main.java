import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the CO2 Calculator, Here you will know how much co2 you will emit during your trip");
        String userChoice="0";
        Vehicle vehicle = null;

        do {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your journey in km");
            String userKm = input.nextLine();

            System.out.println("Means of transport: ");
            System.out.println("1.Plane");
            System.out.println("2.Train");
            System.out.println("3.Car");
            System.out.println("4.Bicycle");

            System.out.println("Enter a marker (number)");
            int userMarker = input.nextInt();

            System.out.println("You choose " + userMarker + " to do " + userKm);
            if (userMarker == 3) {
                vehicle= new Car();
            } else if (userMarker == 4) {
                vehicle=new Bicycle();
            } if (userMarker == 1){
                vehicle=new Plane();
            } else if (userMarker == 2) {
                vehicle=new Train();
            }
            System.out.println(vehicle);
            System.out.println("You are going to issue : "+ vehicle.calculateCo2(Integer.parseInt(userKm))+"grams of co2");
            
            Scanner console = new Scanner(System.in);
            System.out.println("Do you want to enter a new trip (yes,no)");
            userChoice = console.next();


        } while (userChoice.equals("yes"));
        System.out.println("Bye!");

    }
}