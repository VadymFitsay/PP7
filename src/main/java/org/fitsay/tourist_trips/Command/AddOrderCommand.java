package org.fitsay.tourist_trips.Command;

import org.fitsay.tourist_trips.Orders.Orders;
import org.fitsay.tourist_trips.Vouchers.Offers;

public class AddOrderCommand implements Command {
    Orders orders;
    Offers offers;
    public AddOrderCommand(Orders orders,Offers offers) {
        this.orders = orders;
        this.offers = offers;
    }

    @Override
    public void execute() {
        orders.addOrder(offers);
    }
}
