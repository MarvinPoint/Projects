public abstract class Appliance {
   protected double price;
   protected String serialNumber;
   // constructor for price and serial number
   public Appliance(double price, String serialNumber) {
       this.price = price;
       this.serialNumber = serialNumber;
   }
   public String getSerialNumber() {
       return serialNumber;
   }
   @Override
   public abstract String toString();
}
