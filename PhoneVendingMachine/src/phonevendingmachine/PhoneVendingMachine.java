package phonevendingmachine;
import javax.swing.*;
public class PhoneVendingMachine {
 
    public static int phone1stock = 0; //declares phone1stock as a variable
    public static int phone2stock = 0; //declares phone2stock as a variable
    public static int phone3stock = 0; //declares phone3stock as a variable
    public static int phone4stock = 0; //declares phone4stock as a variable
       
    
    public static void main(String[] args) {
                 
    int users =10; //Assigns the amount of users to 10
    int i;        //Declares the i variable for the loop
    int x = 0; // declares x as 0
    JOptionPane.showMessageDialog(null, "Hello and welcome to the Phone Vending Machine v1.0"); //Displays a joption pane with this message
    String phones1 = JOptionPane.showInputDialog(null, "Please enter the first phone  you wish to stock "); //Asks them to input the first phone in a joptionpane dialog box
    String phones2 = JOptionPane.showInputDialog(null, "Please enter the second phone you wish to stock "); //Asks them to input the second phone in a joptionpane dialog box
    String phones3 = JOptionPane.showInputDialog(null, "Please enter third phone you wish to stock "); // Asks them to input the third phone in a joption dialog box
    String phones4 = JOptionPane.showInputDialog(null, "Please enter fourth phone you wish to stock "); // Asks them to input the fourth phone in a joption dialog box
                                       
   
    for(i=0; i < users; i ++){ // Starts a for loop
   
     
   
 
    int phonetype = Integer.parseInt( JOptionPane.showInputDialog(null, "Please enter 1-4 for the phone you want to buy " //declares phonetype as a int and opens a joptionpane dialog box
            + "\n 1. " +phones1  
            + "\n 2. " +phones2
            + "\n 3. " +phones3
            + "\n 4. " +phones4));
     
     switch (phonetype){ // starts a switch
         case 1: // first switch of 4
        JOptionPane.showMessageDialog(null, "You picked " +phones1 ); // shows a dialog box for the first phone
             phones1(x); // calls the phones1 method
             break; // stops it after being called
         case 2: //second switch of 4
             JOptionPane.showMessageDialog(null, "You picked " +phones2 ); // shows a dialog box for the second phone
             phones2(x); //calls the phones2 method
             break; // stops it after being called
         case 3: // third switch of 4
             JOptionPane.showMessageDialog(null, "You picked " +phones3); // shows a dialog box for the third phone
             phones3(x); //calls the phones3 method
             break; // stops it after being called
         case 4: // fourth switch of four (instead of if using switch)
             JOptionPane.showMessageDialog(null, "You picked " +phones4); // shows a dialog box for the fourth phone
             phones4(x); // calls the fourth phone
             break; // stops it after being called
         default: // the default message if nothing is called or if something  not on the list is called
             JOptionPane.showMessageDialog(null, "Please enter 1-4 ONLY "); // shows a joptionpane dialog box
       
             
 
     }   
     }
     JOptionPane.showMessageDialog(null, "Your total stock is now "
             
             + "\n 1. " + phones1
             + phone1stock
             + "\n 2. " + phones2
             + phone2stock
             + "\n 3. " + phones3
             + phone3stock
             + "\n 4. " + phones4
             + phone4stock
     );

     
     
   
     
    }
   
    public static void phones1(int x){ // new phones1 method
         int phonereceipt1 = 0; //declares phonesreceipt1 as a int and stores it as 0
         int phone1price = 200; //declares phone1price as 200
         phone1stock = Integer.parseInt( JOptionPane.showInputDialog (null, "Please enter the stock for this phone" )); // declares phone1stock as a int and opens a joptionpane dialog box
         JOptionPane.showMessageDialog(null, "This phones stock is " +phone1stock); //shows a joption message dialog box
         JOptionPane.showMessageDialog(null, "This phones price is " +phone1price); // shows a joption message dialog box
         int cash1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your cash to purchase this phone "  )); // declares cash1 as a int and opens a joption dialog box
         if (cash1 == phone1price)
                 JOptionPane.showMessageDialog(null, "Enjoy your new phone ");
         else{
                 JOptionPane.showMessageDialog(null, "Please input the right cash ");
                 }
   
         
         phonereceipt1 = cash1 - phone1price; // calculates the price of the receipt
         JOptionPane.showMessageDialog(null, "Your receipt is " +phonereceipt1); // shows  a joption message dialog box
         // shows a joption dialog message box was here 
         phone1stock--; //takes one away from the global variable phone1stock
    }
    public static void phones2 (int x){
         int phonereceipt2 = 0; // declares phonerecipt2 as a int and stores it as a 0
         int phone2price = 300; //declares phone2price as a int and stores it as 300
         phone2stock = Integer.parseInt( JOptionPane.showInputDialog (null, "Please enter the stock for phone ")); // //uses the global phon2stock to save the input the user types
         JOptionPane.showMessageDialog(null, "This phones stock is " +phone2stock); //shows a message dialog with the phone2stock
         JOptionPane.showMessageDialog(null, "This phone price is " +phone2price); //shows a message dialog with phone2price
         int cash2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your cash to purchase this phone" )); //declares cash 2 as a int for the user input
         
         if (cash2 == phone2price)
                 JOptionPane.showMessageDialog(null, "Enjoy your new phone ");
         else{
                 JOptionPane.showMessageDialog(null, "Please input the right cash ");
                 }
   
         phonereceipt2 = cash2 - phone2price; //does the receipt for phone2price
         JOptionPane.showMessageDialog(null, "Your receipt is " +phonereceipt2); //shows a message dialog 
         //shows a message dialog
         phone2stock--; //takes one away from the global variable phone2stock
    }
    public static void phones3 (int x){
         int phonereceipt3 = 0; //declares phonesreceipt3 as a int and 0
         int phone3price = 400; //declares phones3price as a int and declares it as 400
         phone3stock = Integer.parseInt( JOptionPane.showInputDialog (null, "Please enter the stock for this phone ")); //uses the global phon3stock to save the input the user types
         JOptionPane.showMessageDialog(null, "This phones stock is " +phone3stock); //shows a message dialog with the phone3stock
         JOptionPane.showMessageDialog(null, "This phone price is "+phone3price); //shows a message dialog with phone3price
         int cash3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your cash to purchase this phone" )); // declares cash3 as a int for the user input 
          if (cash3 == phone3price)
                 JOptionPane.showMessageDialog(null, "Enjoy your new phone ");
         else{
                 JOptionPane.showMessageDialog(null, "Please input the right cash ");
                 }
         phonereceipt3 = cash3 - phone3price; //does the receipt for phones3price
         JOptionPane.showMessageDialog(null, "Your receipt is " +phonereceipt3); //shows a message dialog
      
         phone3stock--;  //takes one away from the global variable phone3stock
    }
    public static void phones4 (int x){
         int phonereceipt4 = 0; //declares phonesreceipt4 as a int and 0
         int phone4price = 500; //declares  phon4price as a int and declares it as 500
         phone4stock = Integer.parseInt( JOptionPane.showInputDialog (null, "Please enter the stock for this phone ")); //uses the global phon4stock to save the input the user types
         JOptionPane.showMessageDialog(null, "This phones stock is " +phone4stock); // shows a message dialog with the phones4stock
         JOptionPane.showMessageDialog(null, "This phones price is " +phone4price) ; // shows a message dialog with the phones4price
         int cash4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your cash to purchase this phone" )); // declares cash4 as a int for the user input
         if (cash4 == phone4price)
                 JOptionPane.showMessageDialog(null, "Enjoy your new phone ");
         else{
                 JOptionPane.showMessageDialog(null, "Please input the right cash ");
                 }
         phonereceipt4 = cash4 - phone4price; //does the receipt for phones4price
         JOptionPane.showMessageDialog(null, "Your receipt is " +phonereceipt4); // shows a message dialog
          // shows a message dialog
         phone4stock--; //takes one away from the global variable phone4stock
    }
    }
 
       
 
       
    
