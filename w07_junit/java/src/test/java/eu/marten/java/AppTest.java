package eu.marten.java;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private static App app;
    private static String name;
    /**
     * Rigorous Test :-)
     */

    @BeforeClass
    public static void initiateApp() {
        name = "Marten";
        app = new App(name);
    } 

    @Test
    public void appHasCorrectName() {
         assertTrue("App name is Marten", app.getName() == name);
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void oneEqualsTwo() {
        assertEquals("One equals two", 1, 2);
    }

    @Test
    public void getMaxValue() {
        assertEquals("Get max value", 10, app.maxValue(4, 10));
    }
}
