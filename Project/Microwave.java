
public class Microwave extends Appliance {
   
	private int watts;
   // Constructor to initialize Microwave with serial number, price, and watt
   public Microwave(double price, String serialNumber, int watts) {
       super(price, serialNumber);
       this.watts = watts;
   }
   @Override
   public String toString() {
       return "Microwave (Serial Number: " + serialNumber + ", Price: $" + price + ", Watts: " + watts + ")";
   }
}
