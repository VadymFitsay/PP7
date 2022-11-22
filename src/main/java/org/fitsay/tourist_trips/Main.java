package org.fitsay.tourist_trips;
import org.fitsay.tourist_trips.menu.OwnerInterface;

public class Main {
    public static void main(String[] args) {
        OwnerInterface ownerInterface = new OwnerInterface();
        ownerInterface.menu();
    }
}