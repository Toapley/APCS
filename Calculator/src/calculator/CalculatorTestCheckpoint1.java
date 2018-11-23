package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
    CHECKPOINT 1 UNIT TESTS
    
To run these tests, just click somewhere inside this file (but NOT on the name of the test case!!), 
and click the Play button. The results will appear on the left, under JUnit tab.  Your code should pass all the tests
before submitting Checkpoint 1.

Stats should say: Runs: 12/12     Errors: 0       Failures: 0
 */
public class CalculatorTestCheckpoint1
{
    @Test public void test1() {assertEquals("", Calculator.produceAnswer(""));}
    @Test public void test2() {assertEquals("1", Calculator.produceAnswer("2 + 1"));}
    @Test public void test3() {assertEquals("5", Calculator.produceAnswer("3 - 5"));}
    @Test public void test4() {assertEquals("10002", Calculator.produceAnswer("99 * 10002"));}
    @Test public void test5() {assertEquals("12", Calculator.produceAnswer("200 / 12"));}
    @Test public void test6() {assertEquals("-22", Calculator.produceAnswer("-10 - -22"));}
    @Test public void test7() {assertEquals("-2", Calculator.produceAnswer("89 + -2"));}
    @Test public void test8() {assertEquals("-32", Calculator.produceAnswer("3 - 5 * 2 / -32"));}
    @Test public void test9() {assertEquals("20", Calculator.produceAnswer("20"));}
    @Test public void test10() {assertEquals("4", Calculator.produceAnswer(" 1 + 4 "));}
    
    @Test public void test11() {assertEquals("2147483646", Calculator.produceAnswer("32 - 3 * 2147483646"));}
    @Test public void test12() {assertEquals("-2147483647", Calculator.produceAnswer("34 * 3 - -2147483647"));}

}
