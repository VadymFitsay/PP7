package org.fitsay.tourist_trips.Orders;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OrdersTest {

    @Test
    @DisplayName("Testing vouchers sorting by name")
    void SortByNameCustomer(){
        Orders X = new Orders();
        Order x1 = new Order("Customer2","+380960608611");
        Order x2 = new Order("Customer1","+380680688371");
        X.getOrders().add(x1);
        X.getOrders().add(x2);
        X.SortByNameCustomer();
        assertEquals(x1,X.getOrders().get(1));
        assertEquals(x2,X.getOrders().get(0));
    }
    @Test
    @DisplayName("Testing delete orders")
    void DeleteOrder() {
        Orders X = new Orders();
        X.getOrders().add(new Order("Customer2","+380960608611"));
        X.deleteOrder(0);
        assertTrue(X.getOrders().isEmpty());
    }
}