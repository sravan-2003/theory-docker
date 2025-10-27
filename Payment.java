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
    private double amount;
    private String mode;
    private String status;

    public Payment(double amount, String mode, String status) {
        this.amount = amount;
        this.mode = mode;
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public String getMode() {
        return mode;
    }

    public String getStatus() {
        return status;
    }
}
