/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SENG560;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author michaelcole
 */
public class basicmathTest {
    
    public basicmathTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addToLong method, of class basicmath.
     */
    @Test
    public void testAddToLong_long_long() throws Exception {
        System.out.println("addToLong");
        long x = 1L;
        long y = 2L;
        basicmath instance = new basicmath();
        Long expResult = 3L;
        Long result = instance.addToLong(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of addToLong method, of class basicmath.
     */
    @Test
    public void testAddToLong_String_String() throws Exception {
        System.out.println("addToLong");
        String x = "0x1";
        String y = "0xA";
        basicmath instance = new basicmath();
        Long expResult = 11L;
        Long result = instance.addToLong(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of addToLong method, of class basicmath.
     */
    @Test
    public void testAddToLong_double_double() throws Exception {
        System.out.println("addToLong");
        double x = 1.0;
        double y = 2.0;
        basicmath instance = new basicmath();
        Long expResult = 3L;
        Long result = instance.addToLong(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addToDouble method, of class basicmath.
     */
    @Test
    public void testAddToDouble_double_double() throws Exception {
        System.out.println("addToDouble");
        double y = 1.0;
        double x = 2.0;
        basicmath instance = new basicmath();
        Double expResult = 3.0;
        Double result = instance.addToDouble(y, x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    /**
     * Test of subtractToLong method, of class basicmath.
     */
    @Test
    public void testSubtractToLong_long_long() throws Exception {
        System.out.println("subtractToLong");
        long x = 4L;
        long y = 3L;
        basicmath instance = new basicmath();
        Long expResult = 1L;
        Long result = instance.subtractToLong(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of subtractToLong method, of class basicmath.
     */
    @Test
    public void testSubtractToLong_String_String() throws Exception {
        System.out.println("subtractToLong");
        String x = "0xA";
        String y = "0x2";
        basicmath instance = new basicmath();
        Long expResult = 8L;
        Long result = instance.subtractToLong(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subtractToLong method, of class basicmath.
     */
    @Test
    public void testSubtractToLong_double_double() throws Exception {
        System.out.println("subtractToLong");
        double x = 5.0;
        double y = 3.0;
        basicmath instance = new basicmath();
        Long expResult = 2L;
        Long result = instance.subtractToLong(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplyToLong method, of class basicmath.
     */
    @Test
    public void testMultiplyToLong_long_long() throws Exception {
        System.out.println("multiplyToLong");
        long x = 2L;
        long y = 3L;
        basicmath instance = new basicmath();
        Long expResult = 6L;
        Long result = instance.multiplyToLong(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplyToLong method, of class basicmath.
     */
    @Test
    public void testMultiplyToLong_String_String() throws Exception {
        System.out.println("multiplyToLong");
        String x = "0x2";
        String y = "0x3";
        basicmath instance = new basicmath();
        Long expResult = 6L;
        Long result = instance.multiplyToLong(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divideToLong method, of class basicmath.
     */
    @Test
    public void testDivideToLong_long_long() throws Exception {
        System.out.println("divideToLong");
        long x = 6L;
        long y = 2L;
        basicmath instance = new basicmath();
        Long expResult = 3L;
        Long result = instance.divideToLong(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of divideToLong method, of class basicmath.
     */
    @Test
    public void testDivideToLong_String_String() throws Exception {
        System.out.println("divideToLong");
        String x = "0x6";
        String y = "0x3";
        basicmath instance = new basicmath();
        Long expResult = 2L;
        Long result = instance.divideToLong(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divideToLong method, of class basicmath.
     */
    @Test
    public void testDivideToLong_double_double() throws Exception {
        System.out.println("divideToLong");
        double x = 6.0;
        double y = 2.0;
        basicmath instance = new basicmath();
        Long expResult = 3L;
        Long result = instance.divideToLong(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divideToDouble method, of class basicmath.
     */
    @Test
    public void testDivideToDouble() throws Exception {
        System.out.println("divideToDouble");
        double x = 8.0;
        double y = 2.0;
        basicmath instance = new basicmath();
        Double expResult = 4.0;
        Double result = instance.divideToDouble(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of squareRootToLong method, of class basicmath.
     */
    @Test
    public void testSquareRootToLong_long() throws Exception {
        System.out.println("squareRootToLong");
        long x = 9L;
        basicmath instance = new basicmath();
        Long expResult = 3L;
        Long result = instance.squareRootToLong(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of squareRootToLong method, of class basicmath.
     */
    @Test
    public void testSquareRootToLong_String() throws Exception {
        System.out.println("squareRootToLong");
        String x = "0x9";
        basicmath instance = new basicmath();
        Long expResult = 3L;
        Long result = instance.squareRootToLong(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of squareRootToLong method, of class basicmath.
     */
    @Test
    public void testSquareRootToLong_double() throws Exception {
        System.out.println("squareRootToLong");
        double x = 9.0;
        basicmath instance = new basicmath();
        Long expResult = 3L;
        Long result = instance.squareRootToLong(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of squareRootToDouble method, of class basicmath.
     */
    @Test
    public void testSquareRootToDouble_double() throws Exception {
        System.out.println("squareRootToDouble");
        double x = 9.0;
        basicmath instance = new basicmath();
        Double expResult = 3.0;
        Double result = instance.squareRootToDouble(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of squareRootToDouble method, of class basicmath.
     */
    @Test
    public void testSquareRootToDouble_long() throws Exception {
        System.out.println("squareRootToDouble");
        long x = 9L;
        basicmath instance = new basicmath();
        Double expResult = 3.0;
        Double result = instance.squareRootToDouble(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    /**
     * Test of exponentToLong method, of class basicmath.
     */
    @Test
    public void testExponentToLong_long_long() throws Exception {
        System.out.println("exponentToLong");
        long x = 3L;
        long power =2L;
        basicmath instance = new basicmath();
        Long expResult = 9L;
        Long result = instance.exponentToLong(x, power);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of exponentToLong method, of class basicmath.
     */
    @Test
    public void testExponentToLong_String_String() throws Exception {
        System.out.println("exponentToLong");
        String x = "0x3";
        String power = "0x2";
        basicmath instance = new basicmath();
        Long expResult = 9L;
        Long result = instance.exponentToLong(x, power);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of exponentToDouble method, of class basicmath.
     */
    @Test
    public void testExponentToDouble_double_double() throws Exception {
        System.out.println("exponentToDouble");
        double x = 3.0;
        double power = 2.0;
        basicmath instance = new basicmath();
        Double expResult = 9.0;
        Double result = instance.exponentToDouble(x, power);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
