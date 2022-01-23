package africa.semicolon.chapterEight.stockClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockClassTest {
    @Test
    void testThatClassIsNotNull(){
        StockClass stockClass = new StockClass("01", "Start");
        assertNotNull(stockClass);
    }

    @Test
    void testTheChangePercent(){
        StockClass stockClass = new StockClass("ORCL", "Oracle Corporation");
        double currentPrice = 10.0;
        double previousPrice = 5.0;
        double changePercent =  stockClass.getChangePercent(currentPrice, previousPrice);
        assertEquals(50.0, changePercent);

    }
}