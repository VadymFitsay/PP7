package org.fitsay.tourist_trips.Orders;

import org.fitsay.tourist_trips.Vouchers.Voucher;
import org.fitsay.tourist_trips.Vouchers.VoucherType;

public class Order {
    private String NameCustomer;
    private String PhoneNumber;
    protected Voucher CustomVoucher;
    private int OrderID;
    public static int NumOrders;
    public Order(String name, String number) {
        this.NameCustomer = name;
        this.PhoneNumber = number;
        NumOrders++;
        OrderID = NumOrders;
    }
    @Override
    public String toString() {
        return "Order{" +
                "OrderID=" + OrderID +' '+
                "NameCustomer='" + NameCustomer + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", CustomVoucher=" + CustomVoucher +
                '}';
    }
    public String getNameCustomer() {
        return NameCustomer;
    }
    public void setNameCustomer(String nameCustomer) {
        NameCustomer = nameCustomer;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    public static void setNumOrders(int numOrders) {
        NumOrders = numOrders;
    }
}
