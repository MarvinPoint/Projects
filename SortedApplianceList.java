
// sorted linked list that keeps appliances in sorted order by serial number
public class SortedApplianceList extends ApplianceList {
	// Constructor for an empty sorted list
   public SortedApplianceList() {
       super();
   }
   public void add(Appliance appliance) {
       ApplianceNode newNode = new ApplianceNode(appliance);
       ApplianceNode current = first;
       // Find the correct position to insert based on serial number order
       while (current.next != null && current.next.data.getSerialNumber().compareTo(appliance.getSerialNumber()) < 0) {
           current = current.next;
       }
       newNode.next = current.next;
       current.next = newNode;
       if (newNode.next == null) {
           last = newNode;
       }
       length++;
   }
}

