package se.addq.jenkins;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by simon on 2016-04-06.
 */
public class CalculatorTest {

    @Test public void testAdd(){
        int resultFromAdd = Calculator.add(2, 5);
        Assert.assertEquals("",7, resultFromAdd);
    }

    @Test public void testAddBroken(){
        int resultFromAdd = Calculator.addBroken(2, 5);
        Assert.assertEquals("",7, resultFromAdd);
    }
}
