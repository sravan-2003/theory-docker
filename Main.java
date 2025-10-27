/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package adda.project.theory;

import java.util.Scanner;

/**
 *
 * @author srava
 */
public class Main {

    public static void main(String[] args) {
       
        // Auto initialize database
        RailwayDatabase db = new RailwayDatabase(1, "Auto-Initialized Database");

        // Auto create objects
        TicketClerk clerk = new TicketClerk("Sravan", "Hyderabad");
        Passenger passenger = new Passenger("Srav1", "Secunderabad");
        Train train = new Train("001", "SuperFast Express");
        Ticket ticket = new Ticket(1, "Hyderabad", "Vellore", 234, 2000.0);
        Payment payment = new Payment(2000.0, "UPI", "Paid Successfully");

        // Log process
        System.out.println("Database initialized successfully.");
        System.out.println("Clerk registered successfully.");
        System.out.println("Passenger and Train info added.");
        System.out.println("Payment recorded: ₹" + payment.getAmount());
        System.out.println("Ticket booked successfully!");
        System.out.println();

        // Add ticket to database
        db.addTicket(ticket);

        // Display database records
        db.showDatabaseRecords();
    }
    }

