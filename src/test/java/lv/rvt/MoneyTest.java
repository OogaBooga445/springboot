package lv.rvt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rvt.Money;

public class MoneyTest {

    @Test
    public void isMoneySumCorrect() {
        Money a = new Money(10, 60);
        Money b = new Money(10, 60);
        Money c = a.plus(b);


        assertEquals(16, c.euros());
        assertEquals(20, c.cents());
    }



    @Test
    public void comparingworksgood() {

        Money a = new Money(10, 60);
        Money b = new Money(5, 60);

        // assertEquals(16, c.euros());
        // assertEquals(20, c.cents());
        
    }
}