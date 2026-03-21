class ParkingLot{

    ParkingSlot[] Slots;
    ParkingLot(int size){
        Slots = new ParkingSlot[size];
        for(int i=0; i<size; i++){
            Slots[i] = new ParkingSlot(i+1);
        }
    }

    void parkVehicle(Vehicle vehicle){
        for(ParkingSlot slot : Slots){
            if(!slot.isOccupied){
                slot.parkVehicle(vehicle);
                return;
            }
        }
        System.out.println("No available slots to park the vehicle.");
    }
        void removeVehicle(int slotNumber){
            if(slotNumber > 0 && slotNumber <= Slots.length){
                Slots[slotNumber - 1].removeVehicle();
            } else {
                System.out.println("Invalid slot number.");
            }
        }

        void displayParkingLot(){
            for(ParkingSlot slot : Slots){
                slot.dispaySlot();
            }
        }
    }