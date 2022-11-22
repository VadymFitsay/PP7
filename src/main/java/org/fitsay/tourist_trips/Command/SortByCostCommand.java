package org.fitsay.tourist_trips.Command;

import org.fitsay.tourist_trips.Vouchers.Offers;

public class SortByCostCommand implements Command{
    Offers offers;
    public SortByCostCommand(Offers offers) {
        this.offers = offers;
    }

    @Override
    public void execute() {
        offers.SortByCost();
    }
}
