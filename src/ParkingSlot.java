class ParkingSlot{

    int SlotNumber;
    boolean isOccupied;
    Vehicle vehicle;  // Store vehicle object

    ParkingSlot(int slotNumber) {
        this.SlotNumber = slotNumber;
        this.isOccupied = false;
        this.vehicle = null;  // Initialize vehicle to null
    }

    void parkVehicle(Vehicle vehicle) {
        if (!isOccupied) {
            this.vehicle = vehicle;  // Store the vehicle object
            this.isOccupied = true;
            System.out.println("Vehicle parked at slot"+ SlotNumber);
        } else {
            System.out.println("Slot " + SlotNumber + " is already occupied.");
        }
    }

    void removeVehicle(){
        if (isOccupied) {
            System.out.println("Vehicle removed from slot " + SlotNumber);
            this.vehicle = null;  // Clear the vehicle object
            this.isOccupied = false;
        } else {
            System.out.println("Slot " + SlotNumber + " is already empty.");
        }
    }

    void dispaySlot(){
        if (isOccupied) {
            System.out.println("Slot " + SlotNumber + " is occupied by vehicle : " + vehicle.vehicletype);
        } else {
            System.out.println("Slot " + SlotNumber + " is empty.");
        }
    }

}