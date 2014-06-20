package julienxaviermiage.npie;

public class Convertion {

    private double Coefficient;


    private double Constante;
    
    private boolean ordre;

    public Convertion(double coef, double cons, boolean... ordre)
    {
    	this.setCoefficient(coef);
    	this.setConstante(cons);
    	if(ordre.length == 0)
    		this.setOrdre(true);
    	else
    		this.setOrdre(false);
    }

    public boolean getOrdre()
    {
    	return this.ordre;
    }
    
    public void setOrdre(boolean value)
    {
    	this.ordre = value;
    }
    
    public double getCoefficient() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Coefficient;
    }


    public void setCoefficient(double value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Coefficient = value;
    }


    public double getConstante() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Constante;
    }


    public void setConstante(double value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Constante = value;
    }

}