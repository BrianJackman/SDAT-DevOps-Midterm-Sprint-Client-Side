package com.keyin.client;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService();
        try {
            System.out.println(clientService.getCities());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}