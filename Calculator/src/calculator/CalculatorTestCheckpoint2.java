package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
CHECKPOINT 2 UNIT TESTS

To run these tests, just click somewhere inside this file (but NOT on the name of the test case!!), 
and click the Play button. The results will appear on the left, under JUnit tab.  Your code should pass all the tests
before submitting this checkpoint.

Stats should say: Runs: 32/32     Errors: 0       Failures: 0
 */
public class CalculatorTestCheckpoint2
{
    @Test public void testAdditionSimple1() {assertEquals("4", Calculator.produceAnswer("+1 + 3"));}
    @Test public void testAdditionSimple2() {assertEquals("3", Calculator.produceAnswer("5 + -2"));}
    @Test public void testAdditionSimple3() {assertEquals("0", Calculator.produceAnswer("-3 + 3"));}    
    @Test public void testAdditionSimple4() {assertEquals("-2", Calculator.produceAnswer("5 + -7"));}
    @Test public void testAdditionSimple5() {assertEquals("5", Calculator.produceAnswer(" 1 + 4 "));}

    @Test public void testSubtractionSimple1() {assertEquals("3", Calculator.produceAnswer("5 - 2"));}
    @Test public void testSubtractionSimple2() {assertEquals("-5", Calculator.produceAnswer("-3 - 2"));}
    @Test public void testSubtractionSimple3() {assertEquals("-4", Calculator.produceAnswer("1 - 5"));} 
    @Test public void testSubtractionSimple4() {assertEquals("5", Calculator.produceAnswer("+2 - -3"));}
    
    @Test public void testMultiplicationSimple1() {assertEquals("10", Calculator.produceAnswer("5 * 2"));}
    @Test public void testMultiplicationSimple2() {assertEquals("-6", Calculator.produceAnswer("-3 * 2"));}
    @Test public void testMultiplicationSimple3() {assertEquals("-15", Calculator.produceAnswer("3 * -5"));}    
    @Test public void testMultiplicationSimple4() {assertEquals("6", Calculator.produceAnswer("-2 * -3"));}

    @Test public void testDivisionSimple1() {assertEquals("5", Calculator.produceAnswer("10 / 2"));}
    @Test public void testDivisionSimple2() {assertEquals("-4", Calculator.produceAnswer("-8 / 2"));}
    @Test public void testDivisionSimple3() {assertEquals("-3", Calculator.produceAnswer("15 / -5"));}  
    @Test public void testDivisionSimple4() {assertEquals("1", Calculator.produceAnswer("-3 / -3"));}

    @Test public void testIdentityOperations1() {assertEquals("2", Calculator.produceAnswer("2 + 0"));}
    @Test public void testIdentityOperations2() {assertEquals("3", Calculator.produceAnswer("3 - 0"));}
    @Test public void testIdentityOperations3() {assertEquals("4", Calculator.produceAnswer("4 / 1"));}
    @Test public void testIdentityOperations4() {assertEquals("5", Calculator.produceAnswer("5 * 1"));}

    @Test public void testSuperfluousDigits1() {assertEquals("2", Calculator.produceAnswer("001 + 01"));}
    @Test public void testSuperfluousDigits2() {assertEquals("1", Calculator.produceAnswer("2 - 01"));}
    @Test public void testSuperfluousDigits3() {assertEquals("2", Calculator.produceAnswer("00010 / 05"));}
    @Test public void testSuperfluousDigits4() {assertEquals("6", Calculator.produceAnswer("3 * 000002"));}

    @Test public void testMinMax1() {assertEquals("2147483646", Calculator.produceAnswer("2147483647 - 1"));}
    @Test public void testMinMax2() {assertEquals("-2147483647", Calculator.produceAnswer("-2147483648 + 1"));}
    @Test public void testMinMax3() {assertEquals("-2147483648", Calculator.produceAnswer("-2147483648 - 0"));}
    @Test public void testMinMax4() {assertEquals("2147483647", Calculator.produceAnswer("2147483646 + 1"));}

    @Test public void testEdge1() {assertEquals("34", Calculator.produceAnswer("34"));}
    @Test public void testEdge2() {assertEquals("-3", Calculator.produceAnswer("-3"));}
    @Test public void testEdge3() {assertEquals("", Calculator.produceAnswer(""));}

}
