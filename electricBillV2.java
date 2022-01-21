/* Assignment 1
     Software Development
     HDip: Computing
     Student Number: L00169779
     Name: John Byrne. 
*/

/*
LYIT Electric is an electricity supply company that has 2 types of customers:
Residential and Business. It issues an electric bill to its customers every month totalling the charges for the 
number of Units used plus a Standing charge fee. VAT is calculated on this total and added to the bill. 
LYIT electric applies the following rates to customers in calculating the bill
*/

import java.util.*;

public class electricBillV2 {
   public static void main(String args[]) {
   
//import Scanner class for user input. 
Scanner keyboard = new Scanner(System.in);

//Declaring Unit Variables
double units, years; //unit and year variable
char customer, meter;//customer and meter
 
 //Declare standing charge Variables.
//Residential Customers
double stand_urban = 17.50;
double stand_rural = 21.50;
double lowUnitPrice = 0.18;
double highUnitPrice = 0.23;
      
//Business Customer
double stand_bus = 20.00;
int BusNum;
double BusUnit = 0.25;
double total;

//Declaring VAT variable 
double vat = 0.13;

System.out.print("What type of customer are you Residential[R] or Business[B]: "); //asking user what type of customer they are.
customer = keyboard.next().charAt(0);

//Nested If statement
if(customer == 'R') {
  System.out.println("You are a Residential Customer");
  {
  //Units
  System.out.print("How many units have you used?: "); //asking user how many units they sold.
  units = keyboard.nextDouble();
  if(units > 200) //Units greater than 200
         System.out.println("Your usage price is: " + units * highUnitPrice);
  else if(units <= 200) //units less than equal to 200
         System.out.println("Your usage price is: " + units * lowUnitPrice);
   }
   {
   //Meter      
  System.out.print("What type of meter do you own Urban[U] or Rural[R]: ");//asking user if their meter is urban or rura
  meter = keyboard.next().charAt(0);
  if(meter == 'U') //Which meter are is the customer
         System.out.println("Your standing charge is " + stand_urban);
  else if(meter == 'R') //which meter is the customer
         System.out.println("Your standing charge is " + stand_rural);
   }
   {
   //Company Length      
  System.out.print("How long have you been with the company?: ");// asking user how long they have been with the comapny
  years = keyboard.nextDouble();
  if(years >=3){ //how long is customer with the company.
         if(units <=200)
         System.out.print("Your unit charge is zero this month ");
  else if( units > 200)
         System.out.println("First 200 units have no charge ");
         System.out.println("Your charge is: " + (units - 200) * highUnitPrice);
System.out.println("VAT 13%: " + (units + meter) * vat); 
System.out.println("*** Your Electrical Bill for this Month is ***");
System.out.println("Total: " + units + meter + vat); //Total

      }
   }
 }
   {
//if statement for business customers
   if(customer == 'B') {
         System.out.println("Business unit price is always 25 cents per unit");
         //Asking User how many business'es they have.
         System.out.print("How many businesses do you have registered to the electric supply: ");
         BusNum = keyboard.nextInt();
         //initializing variables for FOR loop.
         double sum = 0;
         int number;
         //For Loop
         for(number = BusNum; number >= 1; number--) //Quick note, with the help of stackoverflow i managed to get the loop to work.
         {
            System.out.print("Amount for Business: ");
            BusNum = keyboard.nextInt();
            sum = sum += BusNum; //Adding units together
         }
         //Sum of units and total price of units
          System.out.println("Total Units: " + sum);
          System.out.println("Total Unit price: " + sum * BusUnit);

         //Standing charge
         System.out.println("Standing Charge: " + stand_bus);
         total = (sum * BusUnit) + stand_bus;
         System.out.println("Vat: " + total * vat); //VAT
         System.out.println("Your Electrical Bill for this month is***");
         
         System.out.println("Total: " + total + vat); //Total
       }
       {     
        if(customer != 'R' && customer != 'B')
       System.out.println("This isn't an option"); //Option isn't there
     } 
    }
}
}
    
 

 
