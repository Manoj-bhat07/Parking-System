 class Vehicle {
  String vehiclenumber;
  String vehicletype;

   Vehicle(String vehiclenumber, String vehicletype){
    this.vehiclenumber=vehiclenumber;
    this.vehicletype=vehicletype;
   }
    void display(){
        System.out.println("Vehicle Number: "+vehiclenumber);
        System.out.println("Vehicle Type: "+vehicletype);
    }
 }