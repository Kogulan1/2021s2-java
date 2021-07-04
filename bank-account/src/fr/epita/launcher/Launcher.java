package fr.epita.bank.launcher;


import java.util.Scanner;

import fr.epita.bank.datamodel.Customer;
import fr.epita.bank.datamodel.SavingsAccount;

public class Launcher {

    public static void main(String[] args) {

        System.out.println("Hello, welcome to this application");
        System.out.println("please, create the customer account details");
        System.out.println("user name: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("address:" );
        String address = scanner.nextLine();

        Customer customer = new Customer(name, address);

        System.out.println("Intial Balance");
        int initialBalance = 0;
        System.out.println("Please Input the Interest rate");
        double initialInterestRate = 0.005;
        String rawBalance = scanner.nextLine();
        try {
            double initialBalance = Double.parseDouble(rawBalance);
        } catch ( Exception e) {
            e.printStackTrace();
        }

        if (initialBalance == 0) {
            return;
        }
        }




        SavingsAccount savingsAccount = new SavingsAccount(initialBalance, initialInterestRate);
        savingsAccount.withDraw(300);

        double interests = savingsAccount.computeInterests();

        System.out.println(interests);

    }
}
