package julienxaviermiage.npie;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ConvertionTest extends TestCase {
	
	public ConvertionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ConvertionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	this.createConvertionTest();
    	this.setOrdreTest();
    	this.setCoefficientTest();
    	this.setConstanteTest();
    }
    
    private void createConvertionTest() {
    	Convertion c = new Convertion(10, 15, false);
    	
    	assertEquals(c.getCoefficient(), new Double(10));
    	assertEquals(c.getConstante(), new Double(15));
    	assertFalse(c.getOrdre());
    }
    
    private void setOrdreTest() {
    	Convertion c = new Convertion(10, 15, false);
    	c.setOrdre(true);
    	assertTrue(c.getOrdre());
    }
    
    private void setCoefficientTest() {
    	Convertion c = new Convertion(10, 15, false);
    	c.setCoefficient(25);
    	assertEquals(c.getCoefficient(), new Double(25));
    }
    
    private void setConstanteTest() {
    	Convertion c = new Convertion(10, 15, false);
    	c.setConstante(30);
    	assertEquals(c.getConstante(), new Double(30));
    }
}
