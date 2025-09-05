import java.io.*;

public class Project2 {
   public static void main(String[] args) {
       SortedApplianceList applianceList = new SortedApplianceList(); // create the sorted list
       try {
           BufferedReader reader = new BufferedReader(new FileReader("p2input.txt")); // reads input file
           String line;
           while ((line = reader.readLine()) != null) {
               String[] parts = line.split(",");
              
               String serialNumber = parts[0];
               double price = Double.parseDouble(parts[1]);
               char type = serialNumber.charAt(0);
              
               // reads and organizes data
               switch (type) {
                   case 'R':  // Refrigerator
                       double cubicFeet = Double.parseDouble(parts[2]);
                       applianceList.add(new Refrigerator(price, serialNumber, cubicFeet));
                       break;
                   case 'D':  // Dishwasher
                       boolean undercounterInstallation = parts[2].equalsIgnoreCase("Y");
                       applianceList.add(new Dishwasher(price, serialNumber, undercounterInstallation));
                       break;
                   case 'M':  // Microwave
                       int watts = Integer.parseInt(parts[2]);
                       applianceList.add(new Microwave(price, serialNumber, watts));
                       break;
                   default:
                       System.out.println("Unknown appliance type for serial number: " + serialNumber);
               }
           }
           reader.close();
       } catch (IOException e) {
           System.out.println("Error reading file: " + e.getMessage());
       } catch (NumberFormatException e) {
           System.out.println("Error parsing number: " + e.getMessage());
       }
       // Launch the GUI to display the sorted appliance list
       ApplianceGUI gui = new ApplianceGUI(applianceList);
       gui.setVisible(true);
   }
}


