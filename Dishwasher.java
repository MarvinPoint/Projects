
public class Dishwasher extends Appliance {
   
   private boolean undercounterInstallation;
   // Constructor to initialize Dishwasher with serial number, price, and undercounter installation flag
   public Dishwasher(double price, String serialNumber, boolean undercounterInstallation) {
       super(price, serialNumber);
       this.undercounterInstallation = undercounterInstallation;
   }
   @Override
   public String toString() {
       return "Dishwasher (Serial Number: " + serialNumber + ", Price: $" + price + ", Undercounter Installation: " + (undercounterInstallation ? "Yes" : "No") + ")";
   }
}
