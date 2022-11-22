package org.fitsay.tourist_trips.Command;

import org.fitsay.tourist_trips.Vouchers.Offers;

public class ShowOffersCommand implements Command{
    Offers offers;
    public ShowOffersCommand(Offers offers){this.offers = offers;}
    @Override
    public void execute(){offers.ShowOffers();}
}
