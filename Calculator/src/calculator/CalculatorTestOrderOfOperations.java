package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
EXTRA CREDIT: ORDER OF OPERATIONS UNIT TESTS

To run these tests, just click somewhere inside this file (but NOT on the name of the test case!!), 
and click the Play button. The results will appear on the left, under JUnit tab.  Your code should pass all the tests
before submitting this extra credit.

Stats should say: Runs:  20/20    Errors: 0       Failures: 0
 */
public class CalculatorTestOrderOfOperations 
{
    @Test public void testOrderMultiply1() {assertEquals("7", Calculator.produceAnswer("1 + 2 * 3"));}
    @Test public void testOrderMultiply2() {assertEquals("2", Calculator.produceAnswer("2 * 4 - 3 * 2"));}
    @Test public void testOrderMultiply3() {assertEquals("2", Calculator.produceAnswer("-2 * -4 - -3 * -2"));}
    @Test public void testOrderMultiply4() {assertEquals("-2", Calculator.produceAnswer("-2 * 4 - 3 * -2"));}
    @Test public void testOrderMultiply5() {assertEquals("-2", Calculator.produceAnswer("2 * -4 - -3 * 2"));}
    @Test public void testOrderMultiply6() {assertEquals("-3", Calculator.produceAnswer("-10 + 3 + 5 * 2 - 8 + 2"));}
    
    @Test public void testOrderDivide1() {assertEquals("0", Calculator.produceAnswer("4 / 2 - 6 / 3"));}
    @Test public void testOrderDivide2() {assertEquals("0", Calculator.produceAnswer("10 - 20 / 2"));}
    @Test public void testOrderDivide3() {assertEquals("20", Calculator.produceAnswer("10 - -20 / 2"));}
    @Test public void testOrderDivide4() {assertEquals("11", Calculator.produceAnswer("1 + 100 / 10"));}
    @Test public void testOrderDivide5() {assertEquals("0", Calculator.produceAnswer("-4 / -2 - 6 / 3"));}
    @Test public void testOrderDivide6() {assertEquals("0", Calculator.produceAnswer("4 / 2 - -6 / -3"));}
    @Test public void testOrderDivide7() {assertEquals("0", Calculator.produceAnswer("-4 / -2 - -6 / -3"));}     
    
    @Test public void testOrderMix1() {assertEquals("20", Calculator.produceAnswer("10 - 3 + 9 / 3 + 2 * 5"));}
    @Test public void testOrderMix2() {assertEquals("16", Calculator.produceAnswer("10 - 3 + 9 / 3 + 2 * 5 - 3 * 2 * 2 / 3"));}
    @Test public void testOrderMix3() {assertEquals("-6", Calculator.produceAnswer("-10 - -3 + -9 / -3 * -2 / -2 + -2"));}
    @Test public void testOrderMix4() {assertEquals("2", Calculator.produceAnswer("1 + 2 * 3 * 4 / 12 + 360 / 5 / 4 / 3 / 2 - 2 * 2"));}
    @Test public void testOrderMix5() {assertEquals("2", Calculator.produceAnswer("1 + -2 * -3 * -4 / -12 + -360 / -5 / -4 / -3 / 2 - -2 * -2"));}
    @Test public void testOrderMix6() {assertEquals("-2", Calculator.produceAnswer("-1 + -2 * -3 * -4 / 12 + -360 / -5 / -4 / -3 / -2 - -2 * 2"));}
    @Test public void testOrderMix7() {assertEquals("-8", Calculator.produceAnswer("1 + -2 * 3 * 4 / 12 + -360 / -5 / -4 / -3 / -2 - -2 * -2"));}	
}
