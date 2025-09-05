public class Refrigerator extends Appliance {
   private double cubicFeet;
   // Constructor to initialize Refrigerator with serial number, price, and cubic feet
   public Refrigerator(double price, String serialNumber, double cubicFeet) {
       super(price, serialNumber);
       this.cubicFeet = cubicFeet;
   }
   @Override
   public String toString() {
       return "Refrigerator (Serial Number: " + serialNumber + ", Price: $" + price + ", Cubic Feet: " + cubicFeet + ")";
   }
}

