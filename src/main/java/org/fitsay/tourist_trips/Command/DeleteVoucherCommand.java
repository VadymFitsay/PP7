package org.fitsay.tourist_trips.Command;

import org.fitsay.tourist_trips.Vouchers.Offers;


public class DeleteVoucherCommand implements Command{
    Offers offers;
    public DeleteVoucherCommand(Offers offers) {
        this.offers = offers;
    }

    @Override
    public void execute() {
        offers.DeleteVoucher();
    }
}
