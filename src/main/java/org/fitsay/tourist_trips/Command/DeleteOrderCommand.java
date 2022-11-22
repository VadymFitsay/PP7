package org.fitsay.tourist_trips.Command;

import org.fitsay.tourist_trips.Orders.Orders;

public class DeleteOrderCommand implements Command{
    Orders orders;
    public DeleteOrderCommand(Orders orders) {
        this.orders = orders;
    }

    @Override
    public void execute() {
        orders.deleteOrder();
    }
}
