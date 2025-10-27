/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adda.project.theory;

import java.util.Scanner;

/**
 *
 * @author srava
 */
public class Ticket extends Main {
     int ticketNo;
    String startingLocation;
    String destinationLocation;
    int passengerNo;
    double paymentAmount;

    public void enterTicketDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ticket No: ");
        ticketNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Starting Location: ");
        startingLocation = sc.nextLine();
        System.out.print("Enter Destination Location: ");
        destinationLocation = sc.nextLine();
        System.out.print("Enter Passenger No: ");
        passengerNo = sc.nextInt();
    }

    public void paymentAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Payment Amount (₹): ");
        paymentAmount = sc.nextDouble();
        System.out.println("Payment Recorded: ₹" + paymentAmount);
    }

    public void cancelTicket() {
        System.out.println("Ticket " + ticketNo + " has been cancelled successfully.");
    }

    public void showTicketDetails() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Ticket No: " + ticketNo);
        System.out.println("From: " + startingLocation);
        System.out.println("To: " + destinationLocation);
        System.out.println("Passenger No: " + passengerNo);
        System.out.println("Amount: ₹" + paymentAmount);
    }
}
