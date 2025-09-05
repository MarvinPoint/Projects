// Linked list for storing appliances
public class ApplianceList {
   protected ApplianceNode first;
   protected ApplianceNode last;
   protected int length;
  
   public ApplianceList() {
       this.first = new ApplianceNode(null);  // Head node
       this.last = first;
       this.length = 0;
   }
   // Append an appliance to the list
   public void append(Appliance appliance) {
       ApplianceNode newNode = new ApplianceNode(appliance);
       last.next = newNode;
       last = newNode;
       length++;
   }
}

