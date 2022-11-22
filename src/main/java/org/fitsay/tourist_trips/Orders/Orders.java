package org.fitsay.tourist_trips.Orders;
import org.fitsay.tourist_trips.Vouchers.Offers;
import org.fitsay.tourist_trips.Vouchers.TransportType;
import org.fitsay.tourist_trips.Vouchers.Voucher;

import java.util.*;

public class Orders {
    protected  List<Order> orders = new ArrayList<>();
    public void addOrder(Offers offers){
        System.out.println("AddOrder");
        Scanner scanner = new Scanner(System.in);
        Order tmp;
        System.out.print("\nІм'я: ");
        String name = scanner.nextLine();
        while(name.equals("") || name.equals(" ")){
            System.out.println("Неправильне значення!");
            name = scanner.nextLine();
        }
        System.out.println("\nНомер телефону:");
        String number = scanner.nextLine();
        while(number.equals("") || number.equals(" ")){
            System.out.println("Неправильне значення!");
            number = scanner.nextLine();
        }
        tmp = new Order(name, number);
        System.out.println("\nОберіть путівку:");
        offers.ShowOffers();
        int in = scanner.nextInt();
        tmp.CustomVoucher = new Voucher(offers.getVouchers().get(in-1));
        String value = "0";
        while (!value.equals("3")){
            System.out.println("1. Змінити тривалість");
            System.out.println("2. Змінити транспорт");
            System.out.println("3. Створити замовлення");
            scanner.nextLine();
            value = scanner.nextLine();
            switch (value) {
                case "1" -> {
                    System.out.println("\nОберіть тривалість в діапазоні 1-7 днів");
                    int duration = scanner.nextInt();
                    System.out.println("");
                    while(duration<0 || duration > 8){
                        System.out.println("Неправильне значення!");
                        duration = scanner.nextInt();
                    }
                    tmp.CustomVoucher.setDuration(duration);
                    tmp.CustomVoucher.setPrice();
                }
                case "2" -> {
                    System.out.println("\nВиберіть транспорт:\n1. Літак\n2. Автобус\n3. Поїзд\n");
                    int transport = scanner.nextInt();
                    System.out.println("");
                    while(transport<0 || transport > 3){
                        System.out.println("Неправильне значення!");
                        transport = scanner.nextInt();
                    }
                    tmp.CustomVoucher.setTransport(TransportType.getTypeByInd(transport));
                    tmp.CustomVoucher.setPrice();
                }
                case "3" -> {
                    orders.add(tmp);
                }
            }
        }
    }
    public void ShowListOrders(List<Order> x){
        x.forEach(System.out::println);
    }
    public void ShowOrders(){
        System.out.println("ShowOffers");
        if (orders.isEmpty()){
            System.out.println("Список пустий");
        }
        else {ShowListOrders(orders);}
    }
    public void deleteOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("DeleteOrder");
        System.out.print("Введіть номер замовлення яке ви хочете видалити: ");
        int index = scanner.nextInt() - 1;
        if (index > orders.size()||index < 0)
            throw new IllegalArgumentException("Ви ввели неправильне значення");
        System.out.println(orders.get(index));
        System.out.println(orders.remove(index));
    }
    public void deleteOrder(int ind){
        if (ind > orders.size()||ind < 0)
            throw new IllegalArgumentException("Ви ввели неправильне значення");
        System.out.println(orders.get(ind));
        System.out.println(orders.remove(ind));
    }
    public void SortByNameCustomer(){
        System.out.println("SortByNameCustomer");
        List<Order> orders2 = orders;
        Collections.sort(orders2, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.getNameCustomer().compareTo(o2.getNameCustomer());
            }
        });
        ShowListOrders(orders2);
    }
    public List<Order> getOrders() {
        return orders;
    }
}
