package org.fitsay.tourist_trips.Vouchers;

public enum VoucherType {
    Excursion(2000),Ski(3000),Urban(2000),Exotic(3000),Beach(3500);
    private int price;

    VoucherType(int price){
        this.price = price;
    }

    public static VoucherType getTypeByInd(int ind) {
        for(VoucherType type : VoucherType.values()) {
            if(type.ordinal() == ind) {
                return type;
            }
        }
        return null;
    }

    public double getPrice() {
        return price;
    }
}