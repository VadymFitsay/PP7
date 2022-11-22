package org.fitsay.tourist_trips.Command;

import org.fitsay.tourist_trips.Vouchers.Offers;

public class SortByNameCommand implements Command{
    Offers offers;
    public SortByNameCommand(Offers offers) {
        this.offers = offers;
    }

    @Override
    public void execute() {
        offers.SortByName();
    }
}
