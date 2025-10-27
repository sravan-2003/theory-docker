/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adda.project.theory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author srava
 */
public class RailwayDatabase extends Main {
    private int databaseId;
    private String responseMessage;
    private ArrayList<Ticket> tickets;

    public RailwayDatabase(int databaseId, String responseMessage) {
        this.databaseId = databaseId;
        this.responseMessage = responseMessage;
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void showDatabaseRecords() {
        System.out.println("--- Railway Database Records ---");

        System.out.println("\n--- Ticket Details ---");
        for (Ticket t : tickets) {
            System.out.println("Ticket No: " + t.getTicketNo());
            System.out.println("From: " + t.getFrom());
            System.out.println("To: " + t.getTo());
            System.out.println("Passenger No: " + t.getPassengerNo());
            System.out.println("Amount: ₹" + t.getAmount());
            System.out.println();
        }

        System.out.println("--- Railway Database Info ---");
        System.out.println("Database ID: " + databaseId);
        System.out.println("Response: " + responseMessage);
        System.out.println("Total Tickets Stored: " + tickets.size());
    }
}
