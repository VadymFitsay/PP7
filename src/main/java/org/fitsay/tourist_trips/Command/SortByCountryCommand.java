package org.fitsay.tourist_trips.Command;

import org.fitsay.tourist_trips.Vouchers.Offers;

public class SortByCountryCommand implements Command {
    Offers offers;
    public SortByCountryCommand(Offers offers) {
        this.offers = offers;
    }

    @Override
    public void execute() {
        offers.SortByCountry();
    }
}
