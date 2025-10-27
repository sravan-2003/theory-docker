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
public class Train extends Main {
    String model;
    int trainId;

    public void inputTrainDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Train Model: ");
        model = sc.nextLine();
        System.out.print("Enter Train ID: ");
        trainId = sc.nextInt();
    }

    public void showTrainInfo() {
        System.out.println("\n--- Train Information ---");
        System.out.println("Train ID: " + trainId);
        System.out.println("Model: " + model);
    }

    public void viewSchedule() {
        System.out.println("Train " + trainId + " (" + model + ") schedule displayed.");
    }
}
