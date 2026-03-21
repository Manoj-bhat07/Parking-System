public class Main {
public static void main(String[] args) {
   Vehicle car = new Car("KA16TG4433");
   Vehicle bike = new Bike("KA16TG4488");
   // Vehicle truck = new Truck("KA16TG4499");
    //car.display();
  //  bike.display();
    //truck.display(); 

   // ParkingSlot slot1 = new ParkingSlot(1);
   // slot1.parkVehicle(car);
    //slot1.dispaySlot();

    //slot1.removeVehicle();
    //slot1.dispaySlot();

    ParkingLot parkingLot = new ParkingLot(3);
    
    parkingLot.parkVehicle(car);
    parkingLot.parkVehicle(bike);

    parkingLot.displayParkingLot();
    parkingLot.removeVehicle(1);
    parkingLot.displayParkingLot();
}
}