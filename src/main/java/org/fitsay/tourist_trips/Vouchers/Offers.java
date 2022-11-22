package org.fitsay.tourist_trips.Vouchers;
import java.util.*;
import java.lang.Double;
import java.util.Collections;
import java.time.LocalDate;
import java.util.Scanner;

import java.util.concurrent.ThreadLocalRandom;

public class Offers {
    protected List<Voucher> vouchers = new ArrayList<>();
    public void addVoucher() {
        System.out.println("AddVoucher");
        Scanner scanner = new Scanner(System.in);
        Voucher tmp;
        System.out.print("\nВведіть назву путівки: ");
        String name = scanner.nextLine();
        while(name.equals("") || name.equals(" ")){
            System.out.println("Неправильне значення!");
            name = scanner.nextLine();
        }
        System.out.println("\nВиберіть транспорт:\n1. Літак\n2. Автобус\n3. Поїзд\n");
        int transport = scanner.nextInt();
        while(transport<0 || transport > 3){
            System.out.println("Неправильне значення!");
            transport = scanner.nextInt();
        }

        System.out.println("\nОберіть тривалість в діапазоні 1-7 днів");
        int duration = scanner.nextInt();
        while(duration<0 || duration > 8){
            System.out.println("Неправильне значення!");
            duration = scanner.nextInt();
        }

        System.out.println("\nОберіть тип путівки:\n1. Екскурсія\n2. Лижний\n3. Тур по місту\n4. Пляжний\n5. Екзотичний\n");
        int value = scanner.nextInt();
        while(value<0 || value > 5){
            System.out.println("Неправильне значення!");
            value = scanner.nextInt();
        }
        switch (value){
            case 1 -> tmp = new Voucher(name,VoucherType.Excursion,TransportType.getTypeByInd(transport),duration);
            case 2 -> tmp = new Voucher(name,VoucherType.Ski,TransportType.getTypeByInd(transport),duration);
            case 3 -> tmp = new Voucher(name,VoucherType.Urban,TransportType.getTypeByInd(transport),duration);
            case 4 -> tmp = new Voucher(name,VoucherType.Beach,TransportType.getTypeByInd(transport),duration);
            default -> tmp = new Voucher(name,VoucherType.Exotic,TransportType.getTypeByInd(transport),duration);
        };
        String str;
        scanner.nextLine();
        System.out.print("Enter country: ");
        str = scanner.nextLine();
        while(str.equals("") || str.equals(" ")){
            System.out.println("Неправильне значення!");
            str = scanner.nextLine();
        }
        tmp.setCountry(str);
        System.out.print("\nHotel: ");
        str = scanner.nextLine();
        while(str.equals("") || str.equals(" ")){
            System.out.println("Неправильне значення!");
            str = scanner.nextLine();
        }
        tmp.setHotel(str);
        tmp.setDate(createRandomDate());
        vouchers.add(tmp);
    }
    public void DeleteVoucher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Оберіть номер путівки яку ви хочете видалити: ");
        ShowOffers();
        int ind = scanner.nextInt() - 1;
        if (ind > vouchers.size()||ind < 0){throw new IllegalArgumentException("Ви ввели неправильне значення");}
        System.out.println(vouchers.remove(ind));
    }
    public void DeleteVoucher(int ind) {
        if (ind > vouchers.size()||ind < 0){throw new IllegalArgumentException("Ви ввели неправильне значення");}
        System.out.println(vouchers.remove(ind));
    }
    public void ShowOffers(){
        System.out.println("ShowOffers");
        if (vouchers.isEmpty()){
            System.out.println("Список пустий");
        }
        else ShowListVoucher(vouchers);
    }
    public void ShowListVoucher(List<Voucher> x){
        x.forEach(System.out::println);
    }
    public void SortByCountry(){
        System.out.println("SortByCountry");
        Collections.sort(vouchers, new Comparator<Voucher>() {
            public int compare(Voucher o1, Voucher o2) {
                return o1.getCountry().compareTo(o2.getCountry());
            }
        });
        ShowListVoucher(vouchers);
    }
    public void SortByName(){
        System.out.println("SortByName");
        Collections.sort(vouchers, new Comparator<Voucher>() {
            public int compare(Voucher o1, Voucher o2) {
                return o1.getVoucherName().compareTo(o2.VoucherName);
            }
        });
        ShowListVoucher(vouchers);
    }
    public void SortByCost(){
        System.out.println("SortByCost");
        Collections.sort(vouchers, new Comparator<Voucher>() {
            public int compare(Voucher o1, Voucher o2) {
                return Double.compare(o1.price,o2.price);
            }
        });
        ShowListVoucher(vouchers);
    }

    public  LocalDate createRandomDate() {
        LocalDate startDate = LocalDate.now();
        long start = startDate.toEpochDay();

        LocalDate endDate = LocalDate.of(2023, 12, 31);
        long end = endDate.toEpochDay();

        long randomEpochDay = ThreadLocalRandom.current().nextLong(start, end);
        return LocalDate.ofEpochDay(randomEpochDay);
    }

    public List<Voucher> getVouchers() {
        return vouchers;
    }
}
