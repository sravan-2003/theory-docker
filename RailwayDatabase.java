/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adda.project.theory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author srava
 */
public class RailwayDatabase extends Main {
    int id;
    String response;
    Map<Integer, Ticket> storedTickets = new HashMap<>();

    public void inputDatabaseInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Database ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Response Message: ");
        response = sc.nextLine();
        System.out.println("Database initialized successfully.\n");
    }

    public void addTicket(Ticket t) {
        storedTickets.put(t.ticketNo, t);
        System.out.println("Ticket " + t.ticketNo + " added to Railway Database.");
    }

    public void showAllTickets() {
        System.out.println("\n--- Railway Database Records ---");
        if (storedTickets.isEmpty()) {
            System.out.println("No records found.");
        } else {
            for (Ticket t : storedTickets.values()) {
                t.showTicketDetails();
            }
        }
    }

    public void showDatabaseInfo() {
        System.out.println("\n--- Railway Database Info ---");
        System.out.println("Database ID: " + id);
        System.out.println("Response: " + response);
        System.out.println("Total Tickets Stored: " + storedTickets.size());
    }
}
