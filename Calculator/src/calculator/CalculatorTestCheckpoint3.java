package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
CHECKPOINT 3 UNIT TESTS

To run these tests, just click somewhere inside this file (but NOT on the name of the test case!!), 
and click the Play button. The results will appear on the left, under JUnit tab.  Your code should pass all the tests
before submitting this checkpoint.

Stats should say: Runs: 60/60     Errors: 0       Failures: 0
 */
public class CalculatorTestCheckpoint3
{
    // ***********************************************************************************************************
    // ** Checkpoint 2 test cases
    //
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

    // ***********************************************************************************************************
    // ** Checkpoint 3 test cases
    //
    @Test public void testError1() {assertEquals("<ERROR> Invalid expression format.", Calculator.produceAnswer("2 -"));}   
    @Test public void testError2() {assertEquals("<ERROR> Invalid expression format.", Calculator.produceAnswer("1 *"));}
    @Test public void testError3() {assertEquals("<ERROR> Invalid expression format.", Calculator.produceAnswer("7 /"));}   
    @Test public void testError4() {assertEquals("<ERROR> Invalid operator encountered: %", Calculator.produceAnswer("3 % 4"));}
    @Test public void testError5() {assertEquals("<ERROR> Invalid operator encountered: ++", Calculator.produceAnswer("3 ++ 4"));}
    @Test public void testError6() {assertEquals("<ERROR> Invalid operator encountered: +=", Calculator.produceAnswer("3 += 4"));}
    @Test public void testError7() {assertEquals("<ERROR> Invalid operator encountered: |", Calculator.produceAnswer("3 | 4"));}
    @Test public void testError8() {assertEquals("<ERROR> Invalid operator encountered: -=", Calculator.produceAnswer("3 -= 4"));}
    @Test public void testError9() {assertEquals("<ERROR> Cannot divide by zero.", Calculator.produceAnswer("3 / 0"));}     
    @Test public void testError10() {assertEquals("<ERROR> Invalid value: 12x", Calculator.produceAnswer("3 + 12x"));}
    @Test public void testError11() {assertEquals("<ERROR> Invalid value: 3..9", Calculator.produceAnswer("3..9 + 1.2"));}
    @Test public void testError12() {assertEquals("<ERROR> Invalid value: 1@3d", Calculator.produceAnswer("3 + 1@3d"));}
    @Test public void testError13() {assertEquals("<ERROR> Invalid value: 3.2", Calculator.produceAnswer("3.2 - 1"));}
    @Test public void testError14() {assertEquals("<ERROR> Invalid operator encountered: %=", Calculator.produceAnswer("3 %= 4"));}
    @Test public void testError15() {assertEquals("<ERROR> Invalid operator encountered: /=", Calculator.produceAnswer("3 /= 4"));}
    @Test public void testError16() {assertEquals("<ERROR> Invalid operator encountered: \\", Calculator.produceAnswer("3 \\ 4"));}
    @Test public void testError17() {assertEquals("<ERROR> Invalid operator encountered: &", Calculator.produceAnswer("3 & 4"));}
    @Test public void testError18() {assertEquals("<ERROR> Invalid operator encountered: &&", Calculator.produceAnswer("3 && 4"));}
    @Test public void testError19() {assertEquals("<ERROR> Invalid operator encountered: ||", Calculator.produceAnswer("3 || 4"));}
    @Test public void testError20() {assertEquals("<ERROR> Invalid operator encountered: ^", Calculator.produceAnswer("3 ^ 4"));}
    @Test public void testError21() {assertEquals("<ERROR> Invalid value: true", Calculator.produceAnswer("3 * true"));}
    @Test public void testError22() {assertEquals("<ERROR> Invalid value: false", Calculator.produceAnswer("false || true"));}
    @Test public void testError23() {assertEquals("<ERROR> Invalid value: x", Calculator.produceAnswer("x + y"));}
    @Test public void testError24() {assertEquals("<ERROR> Invalid operator encountered: <=", Calculator.produceAnswer("3 <= y"));}
    @Test public void testError25() {assertEquals("<ERROR> Invalid operator encountered: +++", Calculator.produceAnswer("3 +++ y"));}
    @Test public void testError26() {assertEquals("<ERROR> Invalid operator encountered: +=+=", Calculator.produceAnswer("3 +=+= y"));}
    @Test public void testError27() {assertEquals("<ERROR> Invalid operator encountered: &", Calculator.produceAnswer("3 & 4"));}
    @Test public void testError28() {assertEquals("<ERROR> Invalid operator encountered: %", Calculator.produceAnswer("1 % 2"));}
 
}
