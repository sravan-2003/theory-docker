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
    private String from;
    private String to;
    private int passengerNo;
    private double amount;

    public Ticket(int ticketNo, String from, String to, int passengerNo, double amount) {
        this.ticketNo = ticketNo;
        this.from = from;
        this.to = to;
        this.passengerNo = passengerNo;
        this.amount = amount;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getPassengerNo() {
        return passengerNo;
    }

    public double getAmount() {
        return amount;
    }
}
