package julienxaviermiage.npie;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CategorieTest extends TestCase {
	
	public CategorieTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CategorieTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	assertTrue(Categorie.values().length > 0);
    }
    
}
