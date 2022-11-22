package org.fitsay.tourist_trips.Command;

import org.fitsay.tourist_trips.Vouchers.Offers;


public class AddVoucherCommand implements Command{
    Offers offers;
    public AddVoucherCommand(Offers offers) {
        this.offers = offers;
    }

    @Override
    public void execute() {
        offers.addVoucher();
    }
}
