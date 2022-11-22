package org.fitsay.tourist_trips.Vouchers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransportTypeTest {
    @Test
    @DisplayName("Test getTypeByOrdinal")
    void getTypeByOrdinal() {
        assertEquals(TransportType.Plane,TransportType.getTypeByInd(0));
        assertEquals(TransportType.Bus,TransportType.getTypeByInd(1));
        assertEquals(TransportType.Train,TransportType.getTypeByInd(2));
    }
}
