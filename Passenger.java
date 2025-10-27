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
public class Passenger extends Main {
    String name;
    String address;

    public void enterDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Passenger Name: ");
        name = sc.nextLine();
        System.out.print("Enter Passenger Address: ");
        address = sc.nextLine();
    }

    public void searchTrains() {
        System.out.println(name + " is searching available trains...");
    }

    public void viewSchedule() {
        System.out.println(name + " is viewing the train schedule...");
    }

    public void reserveSeat() {
        System.out.println(name + " reserved a seat successfully.");
    }

    public void purchaseTicket() {
        System.out.println(name + " purchased a ticket successfully.");
    }

    public void cancelTicket() {
        System.out.println(name + " cancelled a ticket successfully.");
    }

    public void makePayment(double amount) {
        Payment p = new Payment();
        p.processPayment(amount);
    }

    public void showPassengerInfo() {
        System.out.println("\n--- Passenger Info ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
