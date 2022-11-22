package org.fitsay.tourist_trips.Command;
import org.fitsay.tourist_trips.Orders.Orders;


public class ShowOrdersCommand implements Command{
    Orders orders;
    public ShowOrdersCommand(Orders orders){this.orders = orders;}
    @Override
    public void execute(){orders.ShowOrders();}
}
