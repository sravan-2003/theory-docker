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
public class Payment extends Main {
    double amount;

    public void processPayment(double amt) {
        amount = amt;
        System.out.println("Processing payment of ₹" + amount + "...");
        System.out.println("Payment successful!");
    }

    public void inputAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Payment Amount (₹): ");
        amount = sc.nextDouble();
        System.out.println("Payment Recorded: ₹" + amount);
    }

    public void showPayment() {
        System.out.println("Payment Amount: ₹" + amount);
    }
}
