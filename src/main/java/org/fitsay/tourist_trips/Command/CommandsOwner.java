package org.fitsay.tourist_trips.Command;

import lombok.SneakyThrows;
import org.fitsay.tourist_trips.Orders.Orders;
import org.fitsay.tourist_trips.Vouchers.Offers;

import java.util.ArrayList;
import java.util.List;

public class CommandsOwner {
    private final List<Command> commandList = new ArrayList<>();
    private final Offers offers;
    private final Orders orders;
    public CommandsOwner(Offers offers, Orders orders){
        this.offers = offers;
        this.orders = orders;
        addCommands();
    }
    public void addCommands() {
        commandList.add(new AddVoucherCommand(offers));
        commandList.add(new DeleteVoucherCommand(offers));
        commandList.add(new ShowOffersCommand(offers));
        commandList.add(new SortByNameCommand(offers));
        commandList.add(new SortByCountryCommand(offers));
        commandList.add(new SortByCostCommand(offers));
        commandList.add(new AddOrderCommand(orders,offers));
        commandList.add(new DeleteOrderCommand(orders));
        commandList.add(new ShowOrdersCommand(orders));
        commandList.add(new SortByNameCustomerCommand(orders));
    }
    public void run(int i){commandList.get(i).execute();}
}
