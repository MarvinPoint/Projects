import javax.swing.*;
import java.awt.*;

//Main GUI class for displaying appliances
public class ApplianceGUI extends JFrame {
   private JTextArea displayArea;
   // Constructor to set up the GUI window
   public ApplianceGUI(SortedApplianceList appliances) {
       setTitle("Sorted Appliance List");
       setSize(400, 400);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       displayArea = new JTextArea();
       displayArea.setEditable(false);
       add(new JScrollPane(displayArea), BorderLayout.CENTER);
       // Display each appliance in the sorted list
       ApplianceNode current = appliances.first.next;  // Skip the head node
       while (current != null) {
           displayArea.append(current.data.toString() + "\n");
           current = current.next;
       }
   }
}
