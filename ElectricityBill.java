import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);

      

       System.out.println("Enter number of units consumed:");
       int units = sc.nextInt();

       double CurrentBill = 0;
       double TransmissionCharge = units*(1.17);
       double FixedCharge = 138.00;
       int UnpaidBill = 0;
       
        
       int x = -1;
       while (x != 0 && x != 1) {
           System.out.println("Was last month's electricity bill paid? (1 for yes, 0 for no):");
           x = sc.nextInt();
       
           if (x == 1) {
               System.out.println("Thanks for paying.");
           } else if (x == 0) {
               System.out.println("Enter last month's unpaid electricity bill amount:");
               UnpaidBill = sc.nextInt();
           } else {
               System.out.println("Invalid input. Please enter 1 for yes or 0 for no.");
           }
       }
       
        
       if(units<=100){
          CurrentBill = units*(4.71); 
          
       }
       else if(units>100){
          CurrentBill = units*(5.71);
       }


       double bill = FixedCharge + CurrentBill + TransmissionCharge + UnpaidBill;

       System.out.println("Total Electricity Bill:"+bill+ "rs");


       System.out.println("You can pay Electricity Bill on our official website! or by UPI app");

    }
}
