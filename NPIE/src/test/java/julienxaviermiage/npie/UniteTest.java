package julienxaviermiage.npie;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class UniteTest extends TestCase {
		
	public UniteTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( UniteTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	this.createUniteTest();
    	this.setNomTest();
    	this.setCategorieTest();
    	this.setSystemeTest();
    }
    
    private void createUniteTest() {
    	Unite u = new Unite("UniteTest", Systeme.Metrique, Categorie.Densite);
    	
    	assertEquals(u.getNom(), "UniteTest");
    	assertEquals(u.getCategorie(), Categorie.Densite);
    	assertEquals(u.getSysteme(), Systeme.Metrique);
    }
    
    private void setNomTest() {
    	Unite u = new Unite("UniteName", Systeme.Metrique, Categorie.Densite);
    	u.setNom("TestSetNom");
    	assertEquals(u.getNom(), "TestSetNom");
    }
    
    private void setCategorieTest() {
    	Unite u = new Unite("UniteName", Systeme.Metrique, Categorie.Densite);
    	u.setCategorie(Categorie.Energie);
    	assertEquals(u.getCategorie(), Categorie.Energie);
    }
    
    private void setSystemeTest() {
    	Unite u = new Unite("UniteName", Systeme.Metrique, Categorie.Densite);
    	u.setSysteme(Systeme.Imperial);
    	assertEquals(u.getSysteme(), Systeme.Imperial);
    }
}
