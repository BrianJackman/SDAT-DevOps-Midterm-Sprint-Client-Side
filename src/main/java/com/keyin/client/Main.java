package com.keyin.client;

import java.util.Scanner;
import java.util.logging.LogManager;

public class Main {
    public static void main(String[] args) {
        
        try {
            LogManager.getLogManager().readConfiguration(Main.class.getResourceAsStream("/logging.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        ClientService clientService = new ClientService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. What airports are in what cities?");
            System.out.println("2. List all aircraft passengers have travelled on?");
            System.out.println("3. Which airports can aircraft take off from and land at?");
            System.out.println("4. What airports have passengers used?");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.println(clientService.getAirportsInCities());
                        break;
                    case 2:
                        System.out.println(clientService.getAircraftPassengersTravelledOn());
                        break;
                    case 3:
                        System.out.println(clientService.getAirportsForAircraft());
                        break;
                    case 4:
                        System.out.println(clientService.getAirportsUsedByPassengers());
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.err.println("An error occurred: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}