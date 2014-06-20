package julienxaviermiage.npie;

import java.util.HashMap;

public class Unite {

    private String Nom;


    private Systeme Systeme;


    private Categorie Categorie;

    private HashMap <Unite, Convertion>Mappy;
    
    public Unite(String nom, Systeme sys, Categorie cat)
    {
    	this.setNom(nom);
    	this.setCategorie(cat);
    	this.setSysteme(sys);
    	this.Mappy = new HashMap<Unite, Convertion>();
    }

    public Systeme getSysteme() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Systeme;
    }


    public void setSysteme(Systeme value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Systeme = value;
    }


    public Categorie getCategorie() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Categorie;
    }


    public void setCategorie(Categorie value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Categorie = value;
    }


    public String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Nom;
    }


    public void setNom(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Nom = value;
    }
    
    public void setConvertion(Unite unit, double add, double mult, boolean... ordre)
    {
    	Convertion conv = new Convertion(mult, add, ordre);
    	this.Mappy.put(unit, conv);
    	if(ordre.length == 0)
    		unit.addConvertion(this, -add, 1/mult, false);
    	else
    		unit.addConvertion(this, -add, 1/mult, true);
    		
    }
    
    public void addConvertion(Unite unit, double add, double mult, boolean... ordre)
    {
    	this.Mappy.put(unit, new Convertion(mult, add, ordre));
    }

    // Function convert, use a reference unit to convert two unit.
    // Managed different category between two unit.
    public Object convert(Unite unite, double valeur, Unite ref)
    {
    	if(unite.getCategorie().equals(this.Categorie))
    	{
    		if(!unite.getNom().equals(this.Nom))
        	{
    	    	double resultatRef, resultat = 0;
    	    	if(this.Mappy.get(ref).getOrdre())
    	    		resultatRef = this.Mappy.get(ref).getCoefficient() * valeur + this.Mappy.get(ref).getConstante();
    	    	else
    	    		resultatRef = this.Mappy.get(ref).getCoefficient() * (valeur + this.Mappy.get(ref).getConstante());
    	    		
    	    	if(ref.Mappy.get(unite).getOrdre())
    	    		resultat = ref.Mappy.get(unite).getCoefficient() * resultatRef + ref.Mappy.get(unite).getConstante();
    	    	else
    	    		resultat = ref.Mappy.get(unite).getCoefficient() * (resultatRef + ref.Mappy.get(unite).getConstante());
    	    	
    	    	return (double)resultat;
        	}
        	return (double)valeur;
    	}
    	
    	return false;
    	
    }
}