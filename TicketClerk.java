/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adda.project.theory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author srava
 */
public class TicketClerk extends Main {

    public TicketClerk(String sravan, String hyderabad) {
    }
     String name;
    String location;
    List<Ticket> managedTickets = new ArrayList<>();

    public void inputClerkDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Clerk Name: ");
        name = sc.nextLine();
        System.out.print("Enter Location: ");
        location = sc.nextLine();
        System.out.println("Clerk registered successfully.\n");
    }

    public void reserveSeat(Ticket t) {
        managedTickets.add(t);
        System.out.println("Seat reserved successfully by Clerk " + name + " for Ticket " + t.ticketNo);
    }

    public void reserveTicket(Ticket t) {
        managedTickets.add(t);
        System.out.println("Ticket " + t.ticketNo + " reserved by Clerk " + name);
    }

    public void cancelTicket(Ticket t) {
        managedTickets.remove(t);
        System.out.println("Ticket " + t.ticketNo + " cancelled by Clerk " + name);
    }

    public void receivePayment(double amount) {
        System.out.println("Clerk " + name + " received payment of ₹" + amount + " at " + location);
    }

    public void showClerkInfo() {
        System.out.println("\n--- Clerk Info ---");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Tickets Managed: " + managedTickets.size());
    }
}
