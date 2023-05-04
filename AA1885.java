//AA1885
package Tender;

import java.util.Scanner;

public class AA1885 {
/*
This programme developed using while loop and two arrays
if you enter 1, you can log in as a supplier using supplier name 
if you enter 2, you can log in as a organizer using organizer name
if you enter 3, as a organization you can pick a supplier 
if you enter 4, as a supplier you can give bids 
if you enter 5, you can exit from programme
if you click any number for loops are work continuesly,becouse you can type "quit" and return to main menu.
*/
    public static void main(String[] args) {
        int number = 0;
        int new_number;
        String   new_value;
        String supplier[] =	new String[25];// Array for assign suppliers
        String Organization[] =	new String[25]; // Array for assign Organizations
        
        while (number != 5) {
			Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to ABC Company");
            System.out.println("[1] Log in as Supplier");
            System.out.println("[2] Log in as Organization");
            System.out.println("[3] Call Tender");
            System.out.println("[4] Offer a Bid");
            System.out.println("[5] Exit");
            System.out.println("Enter [quit] to main menu");
       
            number = scan.nextInt();

            if (number == 1) {
            	
            	//In while loop Frist function design for reg for suppliers

                for (int i = 0; i < 25; i++) {
                    System.out.println("Please Enter Your Supplier Name:");
                    supplier[i] = scan.next();
                    if (supplier[i].toLowerCase().matches("quit")) {
                    	supplier[i] = null;
                        break;
                    } else {
                        System.out.println("Supplier Name is Submitted!");
                        System.out.println("Your Supplier ID is :" + i);
                    }

                }
            }
               
                
                
                else if (number == 2) {
                	
                	//In while loop second function design for reg for organizations

                    for (int x = 0; x < 25; x++) {
                        System.out.println("Please Enter Your Organization Name:");
                        Organization[x] = scan.next();
                        if (Organization[x].toLowerCase().matches("quit")) {
                        	Organization[x] = null;
                            break;
                        } else {
                            System.out.println("Organization Name is Submitted!");
                            System.out.println("Your Organization ID is :" + x);
                        }


                    }
                
                
                
            } else if (number == 3) {
            	//In while loop 3rd function design for pick availabele supplairs
            	
                System.out.println("Current Organization Available for Bid:");
                for (int i = 0; i < 25; i++) {
                    if (supplier[i] == null)
                        System.out.println("Supplier " + i + " : none");
                    else
                        System.out.println("Suplier " + i + " : " + supplier[i]);
                }
                
                
                
            } else if (number == 4) {
            	//In while loop 4th function design for assign values to supplair array indexes

                Scanner scan2 = new Scanner(System.in);
                System.out.print("Enter Your Supplair ID:");
                new_number = scan2.nextInt();
                System.out.print("Enter Your New bid:");
                new_value = scan2.next();
             
                System.out.println("After Assign Value : ");
                for (int i = 0; i < 25; i++) {
                    if (supplier[i] == null)
                        System.out.println("New Bid: " + i + " : none");
                    else
                        System.out.println("New Bid: " + i + " : " + supplier[i] + " "+ new_value);
                }


            } else// exit is only work for number 5
                continue;
        }
    }

}
