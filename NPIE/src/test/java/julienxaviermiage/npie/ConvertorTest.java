package julienxaviermiage.npie;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ConvertorTest 
	extends TestCase {
	
	private Convertor cv;
	
	public ConvertorTest( String testName )
    {
        super( testName );
		cv = new Convertor();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ConvertorTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	// Convert 1 000 000 centimeter to kilometer and result must be 10
        assertEquals(new Double(10), new Double(cv.convert(1, 4, 1000000).toString()));
        
        // Convert metre by seconde to tone, result must be false cause they haven't the same categorie
        assertFalse(new Boolean(cv.convert(20, 28, 1).toString()));
        
        // Convert metric unite to imperial unite
        // 45,46 litre must done 10.0012 gallon
        assertEquals(new Double(10.0012), new Double(cv.convert(58, 67, 45.46).toString()));

        // Convert unite which not in the hashmap
        assertFalse(new Boolean(cv.convert(80, 2, 3).toString()));
    }
    
}
