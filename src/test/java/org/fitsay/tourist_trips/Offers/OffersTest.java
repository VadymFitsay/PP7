package org.fitsay.tourist_trips.Offers;

import org.fitsay.tourist_trips.Vouchers.Offers;
import org.fitsay.tourist_trips.Vouchers.TransportType;
import org.fitsay.tourist_trips.Vouchers.Voucher;
import org.fitsay.tourist_trips.Vouchers.VoucherType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
class OffersTest {
    @Test
    @DisplayName("Testing vouchers sorting by name")
    void sortbyname(){
        Offers X = new Offers();
        Voucher x1 = new Voucher("A", VoucherType.Beach, TransportType.Bus,3);
        Voucher x2 = new Voucher("B", VoucherType.Ski, TransportType.Bus,3);
        X.getVouchers().add(x2);
        X.getVouchers().add(x1);
        X.SortByName();
        assertEquals(x1,X.getVouchers().get(0));
        assertEquals(x2,X.getVouchers().get(1));
    }
    @Test
    @DisplayName("Testing vouchers sorting by country")
    void sortbycountry(){
        Offers X = new Offers();
        Voucher x1 = new Voucher("A", VoucherType.Beach, TransportType.Bus,3);
        Voucher x2 = new Voucher("B", VoucherType.Ski, TransportType.Bus,3);
        x1.setCountry("BB");
        x2.setCountry("AA");
        X.getVouchers().add(x1);
        X.getVouchers().add(x2);
        X.SortByCountry();
        assertEquals(x1,X.getVouchers().get(1));
        assertEquals(x2,X.getVouchers().get(0));
    }
    @Test
    @DisplayName("Testing vouchers sorting by price")
    void sortbyprice(){
        Offers X = new Offers();
        Voucher x1 = new Voucher("A", VoucherType.Beach, TransportType.Bus,7);
        Voucher x2 = new Voucher("B", VoucherType.Ski, TransportType.Bus,1);
        X.getVouchers().add(x2);
        X.getVouchers().add(x1);
        X.SortByCost();
        assertEquals(x1,X.getVouchers().get(1));
        assertEquals(x2,X.getVouchers().get(0));
    }
    @Test
    @DisplayName("Testing random date")
    void createRandomDate(){
        Offers X = new Offers();
        LocalDate x1 = X.createRandomDate();
        LocalDate x2 = X.createRandomDate();
        System.out.println(x1);
        System.out.println(x2);
        assertFalse(x1.equals(x2));
    }
    @Test
    @DisplayName("Testing delete offers")
    void DeleteOffer() {
        Offers X = new Offers();
        X.getVouchers().add(new Voucher("A", VoucherType.Beach, TransportType.Bus,7));
        X.DeleteVoucher(0);
        assertTrue(X.getVouchers().isEmpty());
    }
}
