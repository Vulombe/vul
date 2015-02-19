package za.ca.cput.chapter3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest  extends TestCase
{
    App a = new App();
    public void testMyApp() throws Exception
    {
        assertEquals("Vulombe", a.studentNames());
    }
}
