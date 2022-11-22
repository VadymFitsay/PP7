package org.fitsay.tourist_trips.menu;

import org.fitsay.tourist_trips.Command.CommandsOwner;
import org.fitsay.tourist_trips.Orders.Orders;
import org.fitsay.tourist_trips.Vouchers.Offers;

import java.util.Scanner;
public class OwnerInterface {

    private final Scanner scanner2 = new Scanner(System.in);
    final Offers offers = new Offers();
    final Orders orders = new Orders();
    private final CommandsOwner commands = new CommandsOwner(offers,orders);
    public void menu(){
        String value;
        do {
            System.out.println("\nСписок команд:");
            System.out.println("1. Створити путівку");
            System.out.println("2. Видалити путівку");
            System.out.println("3. Показати список путівок");
            System.out.println("4. Показати список посортований за назвою путівки");
            System.out.println("5. Показати список посортований за країною");
            System.out.println("6. Показати список посортований за ціною путівки");
            System.out.println("7. Додати замовлення");
            System.out.println("8. Видалити замовлення");
            System.out.println("9. Показати список замовлень");
            System.out.println("10. Показати список замовлень посортованих за ім'ям клієнта");
            System.out.println("11. Вихід\n");
            value = scanner2.nextLine();
            switch (value) {
                case "1" -> commands.run(0);
                case "2" -> commands.run(1);
                case "3" -> commands.run(2);
                case "4" -> commands.run(3);
                case "5" -> commands.run(4);
                case "6" -> commands.run(5);
                case "7" -> commands.run(6);
                case "8" -> commands.run(7);
                case "9" -> commands.run(8);
                case "10" -> commands.run(9);
                case "11" -> System.exit(11);
            }
        } while (true);
    }
}
