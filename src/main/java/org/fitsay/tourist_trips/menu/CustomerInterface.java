package org.fitsay.tourist_trips.menu;

import org.fitsay.tourist_trips.Command.CommandsCustomer;
import org.fitsay.tourist_trips.Orders.Orders;
import org.fitsay.tourist_trips.Vouchers.Offers;

import java.util.Scanner;

public class  CustomerInterface {
    private final Scanner scanner2 = new Scanner(System.in);
    final Offers offers = new Offers();
    final Orders orders = new Orders();
    private final CommandsCustomer commands = new CommandsCustomer(offers,orders);
    public void menu(){
        String value;
        while (true){
            System.out.println("\nСписок команд:");
            System.out.println("1. Показати список путівок");
            System.out.println("2. Показати список посортований за назвою путівки");
            System.out.println("3. Показати список посортований за країною");
            System.out.println("4. Показати список посортований за ціною путівки");
            System.out.println("5. Додати замовлення");
            System.out.println("6. Вихід\n");
            value = scanner2.nextLine();
            switch (value) {
                case "1" -> commands.run(0);
                case "2" -> commands.run(1);
                case "3" -> commands.run(2);
                case "4" -> commands.run(3);
                case "5" -> commands.run(4);
                case "6" -> System.exit(0);
            }
        }
    }
}
