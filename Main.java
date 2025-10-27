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
        String dbName = args.length > 0 ? args[0] : "defaultDB";
    int port = args.length > 1 ? Integer.parseInt(args[1]) : 3306;
    Scanner sc = new Scanner(System.in);

        RailwayDatabase db = new RailwayDatabase();
        db.inputDatabaseInfo();

        TicketClerk clerk = new TicketClerk();
        clerk.inputClerkDetails();

        Passenger p = new Passenger();
        p.enterDetails();

        Train train = new Train();
        train.inputTrainDetails();

        while (true) {
            System.out.println("\n========= RAILWAY MANAGEMENT MENU =========");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. View Train Info");
            System.out.println("4. Show Clerk Info");
            System.out.println("5. Show Database Records");
            System.out.println("6. Exit");
             System.out.println("");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Ticket t = new Ticket();
                    t.enterTicketDetails();
                    t.paymentAmount();
                    clerk.reserveTicket(t);
                    clerk.receivePayment(t.paymentAmount);
                    db.addTicket(t);
                    System.out.println("Ticket booked successfully!");
                    break;

                case 2:
                    System.out.print("Enter Ticket No to Cancel: ");
                    int no = sc.nextInt();
                    Ticket cancelT = db.storedTickets.get(no);
                    if (cancelT != null) {
                        cancelT.cancelTicket();
                        clerk.cancelTicket(cancelT);
                        db.storedTickets.remove(no);
                    } else {
                        System.out.println("Ticket not found!");
                    }
                    break;

                case 3:
                    train.showTrainInfo();
                    break;

                case 4:
                    clerk.showClerkInfo();
                    break;

                case 5:
                    db.showAllTickets();
                    db.showDatabaseInfo();
                    break;

                case 6:
                    System.out.println("Exiting Railway System. Thank you!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
    }

