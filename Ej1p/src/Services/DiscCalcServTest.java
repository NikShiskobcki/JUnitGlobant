package Services;

import Models.DiscountCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class DiscCalcServTest {

    @Test
    public void testInstDiscountPropertyNotNull() {
        assertNotNull(DiscCalcServ.inst(100,50).getDiscount());
    }

    @Test
    public void TestInstProdPricePropertyNotNull(){
        assertNotNull(DiscCalcServ.inst(100,50).getProdPrice());
    }


    @Test
    public void TestDiscount() {
        DiscountCalculator calc = new DiscountCalculator(100,25);
        assertEquals(75, DiscCalcServ.discount(calc));
    }

    @Test
    public void TestTotalDiscount(){
        DiscountCalculator calc = new DiscountCalculator(100, 100);
        assertEquals(0,DiscCalcServ.discount(calc));
    }

    @Test
    public void TestNoDiscount(){
        DiscountCalculator calc = new DiscountCalculator(100, 0);
        assertEquals(100, DiscCalcServ.discount(calc));
    }


}