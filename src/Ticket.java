class Ticket{
        static int count = 1;
    int ticketid;
    String vehicleNumber;
    int slotNumber;
    long entryTime;

     Ticket(String vehicleNumber, int slotNumber) {
        this.ticketid = count++;                   // Auto-increment ticket ID
        this.vehicleNumber = vehicleNumber;
        this.slotNumber = slotNumber;
        this.entryTime = System.currentTimeMillis(); // Capture the entry time in milliseconds
     }
        void displayTicket() {
            System.out.println("Ticket ID: " + ticketid);   
            System.out.println("Vehicle Number: " + vehicleNumber);
            System.out.println("Slot Number: " + slotNumber);
            System.out.println("Entry Time: " + entryTime);
        }
}