package fr.olivier.test1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.categories.Category;

public class MyJunitCanvasTest {

    public MyJunitCanvasTest() {
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
     * Test of method1 method, of class MyJunitCanvas.
     */
    @Test
    @Category(IntegrationTest.class)
    public void testMethod1Fail() {
        assertTrue("INTEGRATION test PASSED successfully !", true);
    }

    @Test
    @Category(UnitTest.class)
    public void testMethod1Success() {
        assertTrue("UNIT test PASSED successfully !", true);
    }
}
