package org.fitsay.tourist_trips.Vouchers;
import  java.time.LocalDate;
import java.util.Date;

public class Voucher {
    protected String VoucherName;
    protected VoucherType Type;
    protected String Country;
    protected String Hotel;
    protected LocalDate Date;
    protected TransportType Transport;

    protected int Duration;
    protected double price;

    public Voucher(String voucher, VoucherType typeP, TransportType typeT, int duration) {
        this.VoucherName = voucher;
        this.Type = typeP;
        this.Transport = typeT;
        this.Duration = duration;
        this.price =+ (Type.getPrice()*duration) + Transport.getPrice();
    }

    public Voucher(Voucher voucher ) {
        this.VoucherName = voucher.VoucherName;
        this.Type = voucher.Type;
        this.Transport = voucher.Transport;
        this.Duration = voucher.Duration;
        this.price = voucher.price;
        this.Hotel = voucher.Hotel;
        this.Date = voucher.Date;
        this.Country = voucher.Country;
    }
    @Override
    public String toString() {
        return "Voucher{" +
                "VoucherName='" + VoucherName + '\'' +
                ", Country='" + Country + '\'' +
                ", Hotel='" + Hotel + '\'' +
                ", Date='" + Date + '\'' +
                ", Duration=" + Duration +
                ", price=" + price +
                ", Type=" + Type +
                ", Transport=" + Transport +
                '}';
    }
    public String getVoucherName() {
        return VoucherName;
    }

    public void setVoucherName(String voucherName) {
        VoucherName = voucherName;
    }
    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getHotel() {
        return Hotel;
    }

    public void setHotel(String hotel) {
        Hotel = hotel;
    }



    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }
    public double getPrice() {
        return price;
    }
    public LocalDate getDate() {
        return Date;
    }
    public void setDate(LocalDate date) {
        Date = date;
    }
    public void setPrice() {
        this.price =+(Type.getPrice()*Duration) + Transport.getPrice();
    }
    public VoucherType getType() {
        return Type;
    }
    public void setType(VoucherType type) {
        Type = type;
    }
    public TransportType getTransport() {
        return Transport;
    }
    public void setTransport(TransportType transport) {
        Transport = transport;
    }
}
