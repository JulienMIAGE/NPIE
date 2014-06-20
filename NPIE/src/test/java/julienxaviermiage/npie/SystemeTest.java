package julienxaviermiage.npie;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SystemeTest extends TestCase {

	public SystemeTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SystemeTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	assertTrue(Systeme.values().length > 0);
    }
}
