package za.ca.cput.chapter3;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/19.
 */
public class ListTest
{
    private ListApp app;
    @Before
    public void setUp() throws Exception {
        app = new ListApp();

    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals("Vulombe",app.studentNames().get(0));


    }

    @After
    public void tearDown() throws Exception {


    }
}
