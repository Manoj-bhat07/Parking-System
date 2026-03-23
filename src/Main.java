import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ParkingLot parkingLot = new ParkingLot(5); // Create a parking lot with 5 spaces
    int choice;
    while(true){
    System.out.print("\n--- Parking System Menu ---\n");
    System.out.println("1. Park a Vehicle");
    System.out.println("2. Remove Vehicle");
    System.out.println("3. Display Parking Lot Status");
    System.out.println("4. Exit");
    System.out.print("Enter your choice: ");
    choice = scanner.nextInt();
    switch(choice){
        case 1:
            System.err.print("Enter vehicle type (Car/Bike/Truck): ");
            String type = scanner.next();
            System.err.print("Enter the vehicle number: ");
            String number = scanner.next();
              Vehicle vehicle;
            if(type.equalsIgnoreCase("Car")){
                vehicle = new Car(number);
            } else if(type.equalsIgnoreCase("Bike")){
                vehicle = new Bike(number);
            } else {
               vehicle = new Truck(number);
            }
            parkingLot.parkVehicle(vehicle);

            break;
        case 2:
           System.err.println("Enter the slot number to remove the vehicle: ");
            int slotNumber = scanner.nextInt();
            parkingLot.removeVehicle(slotNumber);
            break;
        case 3:
            // Display parking lot status
            parkingLot.displayParkingLot();
            break;
        case 4:
            System.out.println("Exiting...");
            return;
        default:
            System.out.println("Invalid choice. Please try again.");
    }

    }
}
}