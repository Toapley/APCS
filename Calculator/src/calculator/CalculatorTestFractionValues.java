package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
EXTRA CREDIT: FRACTION VALUES UNIT TESTS

To run these tests, just click somewhere inside this file (but NOT on the name of the test case!!), 
and click the Play button. The results will appear on the left, under JUnit tab.  Your code should pass all the tests
before submitting this extra credit.

Stats should say: Runs: 88/88     Errors: 0       Failures: 0
 */
public class CalculatorTestFractionValues
{
    @Test public void testAdditionSimple1() {assertEquals("2/5", Calculator.produceAnswer("1/5 + 1/5"));}
    @Test public void testAdditionSimple2() {assertEquals("4/5", Calculator.produceAnswer("3/5 + 1/5"));}     
    
    @Test public void testAdditionReduce1() {assertEquals("5/3", Calculator.produceAnswer("11/9 + 4/9"));}
    @Test public void testAdditionReduce2() {assertEquals("3/2", Calculator.produceAnswer("3/4 + 3/4"));}
    @Test public void testAdditionReduce3() {assertEquals("1/4", Calculator.produceAnswer("1/8 + 1/8"));}
    
    @Test public void testAdditionWholeNumbers1() {assertEquals("1", Calculator.produceAnswer("2/5 + 3/5"));}
    @Test public void testAdditionWholeNumbers2() {assertEquals("3", Calculator.produceAnswer("4/2 + 2/2"));}
    @Test public void testAdditionWholeNumbers3() {assertEquals("2", Calculator.produceAnswer("3/4 + 5/4"));}
     
    @Test public void testAdditionWithNegatives1() {assertEquals("2/5", Calculator.produceAnswer("3/5 + -1/5"));}          
    @Test public void testAdditionWithNegatives2() {assertEquals("-1/4", Calculator.produceAnswer("-3/4 + 2/4"));}
    @Test public void testAdditionWithNegatives3() {assertEquals("-5/4", Calculator.produceAnswer("-2/4 + -3/4"));}
    
    //  test different denominators
    @Test public void testAdditionDifferntDenominator1() {assertEquals("17/6", Calculator.produceAnswer("20/8 + 1/3"));}
    @Test public void testAdditionDifferntDenominator2() {assertEquals("21/20", Calculator.produceAnswer("4/5 + 2/8"));}
    @Test public void testAdditionDifferntDenominator3() {assertEquals("22/21", Calculator.produceAnswer("3/9 + 5/7"));}
    
    // combined whole numbers and fractions
    @Test public void testAdditionCombined1() {assertEquals("-45173/5", Calculator.produceAnswer("-9035 + 2/5"));}
    @Test public void testAdditionCombined2() {assertEquals("-320/3", Calculator.produceAnswer("64/3 + -128"));}
    @Test public void testAdditionCombined3() {assertEquals("-427/4", Calculator.produceAnswer("-98 + -35/4"));}
    @Test public void testAdditionCombined4() {assertEquals("543/19", Calculator.produceAnswer("0 + 543/19"));}     
        
    @Test public void testSubtractionSimple1() {assertEquals("1/5", Calculator.produceAnswer("3/5 - 2/5"));}
    @Test public void testSubtractionSimple2() {assertEquals("0", Calculator.produceAnswer("1/5 - 1/5"));}
    @Test public void testSubtractionSimple3() {assertEquals("0", Calculator.produceAnswer("9/2 - 9/2"));}
              
    @Test public void testSubtractionReduce1() {assertEquals("4/5", Calculator.produceAnswer("9/10 - 1/10"));}
    @Test public void testSubtractionReduce2() {assertEquals("1/5", Calculator.produceAnswer("5/10 - 3/10"));}   
    @Test public void testSubtractionReduce3() {assertEquals("53/96", Calculator.produceAnswer("75/32 - 43/24"));}
    @Test public void testSubtractionReduce4() {assertEquals("407/24", Calculator.produceAnswer("75/4 - 43/24"));}
    
    @Test public void testSubtractionWithNegatives1() {assertEquals("-2/5", Calculator.produceAnswer("2/5 - 4/5"));}
    @Test public void testSubtractionWithNegatives2() {assertEquals("-7/8", Calculator.produceAnswer("23/4 - 53/8"));}
    @Test public void testSubtractionWithNegatives3() {assertEquals("-5/4", Calculator.produceAnswer("-15/4 - -10/4"));}
    @Test public void testSubtractionWithNegatives4() {assertEquals("-13/8", Calculator.produceAnswer("9/2 - 49/8"));}
    @Test public void testSubtractionWithNegatives5() {assertEquals("-9/8", Calculator.produceAnswer("15/4 - 39/8"));}
    @Test public void testSubtractionWithNegatives6() {assertEquals("-25/4", Calculator.produceAnswer("-15/4 - 10/4"));}         
    
    // combined whole numbers and fractions
    @Test public void testSubtractionCombined1() {assertEquals("23/4", Calculator.produceAnswer("5 - -6/8"));}
    @Test public void testSubtractionCombined2() {assertEquals("128/7", Calculator.produceAnswer("-12/7 - -20"));}
    @Test public void testSubtractionCombined3() {assertEquals("-763/16", Calculator.produceAnswer("-75/16 - 43/1")); }     
    
    @Test public void testMultiplicationBasic1() {  assertEquals("3", Calculator.produceAnswer("3/2 * 2"));}
    @Test public void testMultiplicationBasic2() {assertEquals("6/25", Calculator.produceAnswer("3/5 * 2/5"));}
    @Test public void testMultiplicationBasic3() {assertEquals("8", Calculator.produceAnswer("12/3 * 2/1"));}
    @Test public void testMultiplicationBasic4() {assertEquals("2", Calculator.produceAnswer("16 * 1/8"));}
    @Test public void testMultiplicationBasic5() {assertEquals("2", Calculator.produceAnswer("3 * 2/3"));}
    @Test public void testMultiplicationBasic6() {assertEquals("3/2", Calculator.produceAnswer("6 * 1/4"));}
    @Test public void testMultiplicationBasic7() {assertEquals("378/943", Calculator.produceAnswer("27/41 * 14/23"));}
        
    @Test public void testMultiplicationWithNegatives1() {assertEquals("-8", Calculator.produceAnswer("12/3 * -2/1"));}
    @Test public void testMultiplicationWithNegatives2() {assertEquals("-8", Calculator.produceAnswer("-12/3 * 2/1"));}
    @Test public void testMultiplicationWithNegatives3() {assertEquals("8", Calculator.produceAnswer("-12/3 * -2/1"));}
    @Test public void testMultiplicationWithNegatives4() {assertEquals("-110/7", Calculator.produceAnswer("-11/3 * 30/7"));}
    @Test public void testMultiplicationWithNegatives5() {assertEquals("-110/7", Calculator.produceAnswer("11/3 * -30/7"));}
    @Test public void testMultiplicationWithNegatives6() {assertEquals("110/7", Calculator.produceAnswer("-11/3 * -30/7"));}
     
    @Test public void testMultiplicationByZero1() {assertEquals("0", Calculator.produceAnswer("0 * 4/5"));}
    @Test public void testMultiplicationByZero2() {assertEquals("0", Calculator.produceAnswer("0 * 0"));}
    @Test public void testMultiplicationByZero3() {assertEquals("0", Calculator.produceAnswer("25/26 * 0"));}
    @Test public void testMultiplicationByZero4() {assertEquals("0", Calculator.produceAnswer("-24/3 * 0"));}
    
    // combined whole numbers and fractions
    @Test public void testMultiplicationCombined1() {assertEquals("1376/21", Calculator.produceAnswer("-32 * -43/21"));}
    @Test public void testMultiplicationCombined2() {assertEquals("-9520/41", Calculator.produceAnswer("68/41 * -140"));}
    @Test public void testMultiplicationCombined3() {assertEquals("4", Calculator.produceAnswer("3 * 4/3"));}
    
    // with fractions, there shouldn't be integer division truncation 
    @Test public void testDivisionBasic1() {assertEquals("9/16", Calculator.produceAnswer("3/4 / 4/3"));}
    @Test public void testDivisionBasic2() {assertEquals("9/4", Calculator.produceAnswer("3/2 / 2/3"));}      
    @Test public void testDivisionBasic3() {assertEquals("4/9", Calculator.produceAnswer("4 / 9"));}
    @Test public void testDivisionBasic4() {assertEquals("1", Calculator.produceAnswer("23 / 23"));}
    @Test public void testDivisionBasic5() {assertEquals("20/7", Calculator.produceAnswer("20 / 7"));}
    @Test public void testDivisionBasic6() {assertEquals("13/24", Calculator.produceAnswer("13/12 / 2"));}
    @Test public void testDivisionBasic7() {assertEquals("1", Calculator.produceAnswer("3/4 / 3/4"));}
           
    @Test public void testDivisionWithNegatives1() {assertEquals("13/8", Calculator.produceAnswer("-13 / -8"));}
    @Test public void testDivisionWithNegatives2() {assertEquals("45/32", Calculator.produceAnswer("-15/4 / -8/3"));}
    @Test public void testDivisionWithNegatives3() {assertEquals("-45/32", Calculator.produceAnswer("-15/4 / 8/3"));}
    @Test public void testDivisionWithNegatives4() {assertEquals("-45/32", Calculator.produceAnswer("15/4 / -8/3"));}
    
    @Test public void testDivisionWithZero1() {assertEquals("0", Calculator.produceAnswer("-0 / 2/3"));}
    @Test public void testDivisionWithZero2() {assertEquals("0", Calculator.produceAnswer("-0 / -2/3"));}      
    @Test public void testDivisionWithZero5() {assertEquals("0", Calculator.produceAnswer("0 / 46/27"));}
    @Test public void testDivisionWithZero6() {assertEquals("0", Calculator.produceAnswer("0/24 / 1/46"));}
    @Test public void testDivisionWithZero7() {assertEquals("0", Calculator.produceAnswer("0/11 / 6/7"));}     
    
    // combined whole numbers and fractions
    @Test public void testDivisionCombined1() {assertEquals("4/3", Calculator.produceAnswer("16/4 / 3"));}
    @Test public void testDivisionCombined2() {assertEquals("-4/3", Calculator.produceAnswer("16/4 / -3"));}
    @Test public void testDivisionCombined3() {assertEquals("-111/4", Calculator.produceAnswer("3 / -4/37"));}    

    // multiple operators
    @Test public void multipleOps1() {assertEquals("20/3", Calculator.produceAnswer("5/3 + 5/4 + 25/4 - 10/4"));}
    @Test public void multipleOps2() {assertEquals("227/60", Calculator.produceAnswer("20/8 + 10/3 - 4/5 - 5/4"));}
    @Test public void multipleOps3() {assertEquals("0", Calculator.produceAnswer("0 * 0 / 1 / 4/6 / 11/4"));}
    @Test public void multipleOps4() {assertEquals("-1", Calculator.produceAnswer("1/5 + 1/5 + 1/5 + 1/5 + 1/5 - 2"));}
    @Test public void multipleOps5() {assertEquals("9/2", Calculator.produceAnswer("16/4 / 3/2 * 3/2 + 1/2"));}
    @Test public void multipleOps6() {assertEquals("7", Calculator.produceAnswer("23/4 - -56/8 - 23/4"));}
    @Test public void multipleOps7() {assertEquals("4", Calculator.produceAnswer("2 * 3 - 6 + 3/2 + 1/2 - 1/2 - 1/2 + 3"));}
    @Test public void multipleOps8() {assertEquals("-4", Calculator.produceAnswer("2 * 3 - 6 + -3/2 + -1/2 - -1/2 - -1/2 - 3"));}
 
    // errors
    @Test public void testError1() {assertEquals("<ERROR> Invalid value: 1/2@3", Calculator.produceAnswer("1/2@3 - 4"));}
    @Test public void testError2() {assertEquals("<ERROR> Invalid value: 1_2/5", Calculator.produceAnswer("1_2/5 * 3/7"));}
    @Test public void testError3() {assertEquals("<ERROR> Invalid value: 2/0", Calculator.produceAnswer("2/0 + 1/3"));}
    @Test public void testError4() {assertEquals("<ERROR> Invalid value: 1.3/4", Calculator.produceAnswer("1.3/4 + 2/3"));}
    @Test public void testError5() {assertEquals("<ERROR> Cannot divide by zero.", Calculator.produceAnswer("1/2 / 0"));}
    @Test public void testError6() {assertEquals("<ERROR> Cannot divide by zero.", Calculator.produceAnswer("5 / 0/3"));}
    @Test public void testError7() {assertEquals("<ERROR> Cannot divide by zero.", Calculator.produceAnswer("5/7 / 0/3"));}

}
