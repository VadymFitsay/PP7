package org.fitsay.tourist_trips.Vouchers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VoucherTypeTest {
    @Test
    @DisplayName("Test getTypeByOrdinal")
    void getTypeByOrdinal() {
        assertEquals(VoucherType.Excursion,VoucherType.getTypeByInd(0));
        assertEquals(VoucherType.Ski,VoucherType.getTypeByInd(1));
        assertEquals(VoucherType.Urban,VoucherType.getTypeByInd(2));
        assertEquals(VoucherType.Exotic,VoucherType.getTypeByInd(3));
        assertEquals(VoucherType.Beach,VoucherType.getTypeByInd(4));
    }
}