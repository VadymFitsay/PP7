package org.fitsay.tourist_trips.Command;

import org.fitsay.tourist_trips.Orders.Orders;

public class SortByNameCustomerCommand implements Command {
    Orders orders;
    public SortByNameCustomerCommand(Orders orders) {
        this.orders = orders;
    }

    @Override
    public void execute() {
        orders.SortByNameCustomer();
    }
}
