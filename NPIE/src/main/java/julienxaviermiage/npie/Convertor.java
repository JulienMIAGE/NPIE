package julienxaviermiage.npie;


import java.util.HashMap;


public class Convertor {

	private HashMap<Integer, Unite> tab;

	public Convertor() {
		
		tab = new HashMap<Integer, Unite>();

		//Unite definition	
		
		//Length, Metric
		Unite metre = new Unite("metre", Systeme.Metrique, Categorie.Longueur);
		Unite centimetre = new Unite("centimetre", Systeme.Metrique, Categorie.Longueur);
		Unite millimetre = new Unite("millimetre", Systeme.Metrique, Categorie.Longueur);
		Unite kilometre = new Unite("kilometre", Systeme.Metrique, Categorie.Longueur);
		Unite decimetre = new Unite("decimetre", Systeme.Metrique, Categorie.Longueur);
		Unite micrometre = new Unite("micrometre", Systeme.Metrique, Categorie.Longueur);
		Unite nanometre = new Unite("nanometre", Systeme.Metrique, Categorie.Longueur);
		//Speed, Metric
		Unite ms = new Unite("metre/seconde", Systeme.Metrique, Categorie.Vitesse);
		Unite kms = new Unite("kilometre/seconde", Systeme.Metrique, Categorie.Vitesse);
		Unite mms = new Unite("milimetre/seconde", Systeme.Metrique, Categorie.Vitesse);
		Unite microms = new Unite("micrometre/seconde", Systeme.Metrique, Categorie.Vitesse);
		Unite kmh = new Unite("kilometre/heure", Systeme.Metrique, Categorie.Vitesse);
		//Mass, Metric
		Unite tonne = new Unite("tonne", Systeme.Metrique, Categorie.Poids);
		Unite kilonewton = new Unite("kilonewton", Systeme.Metrique, Categorie.Poids);
		Unite kilogramme = new Unite("kilogramme", Systeme.Metrique, Categorie.Poids);
		Unite hectogramme = new Unite("hectogramme", Systeme.Metrique, Categorie.Poids);
		Unite gramme = new Unite("gramme", Systeme.Metrique, Categorie.Poids);
		Unite carat = new Unite("carat", Systeme.Metrique, Categorie.Poids);
		Unite centigramme = new Unite("centigramme", Systeme.Metrique, Categorie.Poids);
		Unite milligramme = new Unite("milligramme", Systeme.Metrique, Categorie.Poids);
		Unite microgramme = new Unite("microgramme", Systeme.Metrique, Categorie.Poids);
		Unite nanogramme = new Unite("nanogramme", Systeme.Metrique, Categorie.Poids);
		//Area, Metric
		Unite km2 = new Unite("kilometre carre", Systeme.Metrique, Categorie.Superficie);
		Unite hectare = new Unite("hectare", Systeme.Metrique, Categorie.Superficie);
		Unite are = new Unite("are", Systeme.Metrique, Categorie.Superficie);
		Unite m2 = new Unite("metre carre", Systeme.Metrique, Categorie.Superficie);
		Unite dm2 = new Unite("decimetre carre", Systeme.Metrique, Categorie.Superficie);
		Unite cm2 = new Unite("centimetre carre", Systeme.Metrique, Categorie.Superficie);
		Unite mm2 = new Unite("millimetre carre", Systeme.Metrique, Categorie.Superficie);
		//volume, Metric
		Unite km3 = new Unite("kilometre cube",Systeme.Metrique, Categorie.Volume);
		Unite m3 = new Unite("metre cube",Systeme.Metrique, Categorie.Volume);
		Unite hl= new Unite("hectolitre",Systeme.Metrique, Categorie.Volume);
		Unite decal = new Unite("decalitre",Systeme.Metrique, Categorie.Volume);
		Unite litre = new Unite("litre",Systeme.Metrique, Categorie.Volume);
		Unite dm3 = new Unite("decimetre cube",Systeme.Metrique, Categorie.Volume);
		Unite dl = new Unite("decilitre",Systeme.Metrique, Categorie.Volume);
		Unite cl = new Unite("centilitre",Systeme.Metrique, Categorie.Volume);
		Unite cm3 = new Unite("centimetre cube",Systeme.Metrique, Categorie.Volume);
		Unite ml = new Unite("millilitre",Systeme.Metrique, Categorie.Volume);
		Unite mm3 = new Unite("millimetre cube",Systeme.Metrique, Categorie.Volume);
		//Temperature, Metric
		Unite degreC = new Unite("degre celsius", Systeme.Metrique, Categorie.Temperature);
		Unite degreF = new Unite("degre fareinheit", Systeme.Metrique, Categorie.Temperature);
		Unite degreK = new Unite("degre kelvin", Systeme.Metrique, Categorie.Temperature);

		//Length, British
		Unite ligue = new Unite("ligue", Systeme.Imperial, Categorie.Longueur);
		Unite mile = new Unite("mile", Systeme.Imperial, Categorie.Longueur);
		Unite furlong = new Unite("furlong", Systeme.Imperial, Categorie.Longueur);
		Unite chaine = new Unite("chaine", Systeme.Imperial, Categorie.Longueur);
		Unite tringle = new Unite("tringle", Systeme.Imperial, Categorie.Longueur);
		Unite yard = new Unite("yard", Systeme.Imperial, Categorie.Longueur);
		Unite pied = new Unite("pied", Systeme.Imperial, Categorie.Longueur);
		Unite lien = new Unite("lien", Systeme.Imperial, Categorie.Longueur);
		Unite main = new Unite("main", Systeme.Imperial, Categorie.Longueur);
		Unite pouce = new Unite("pouce", Systeme.Imperial, Categorie.Longueur);
		Unite ligne = new Unite("ligne", Systeme.Imperial, Categorie.Longueur);
		Unite mil = new Unite("mil", Systeme.Imperial, Categorie.Longueur);
		Unite thou = new Unite("thou", Systeme.Imperial, Categorie.Longueur);
	
		//Speed, British
		Unite miles = new Unite("mile/seconde", Systeme.Imperial, Categorie.Vitesse);
		Unite mileh = new Unite("mile/heure", Systeme.Imperial, Categorie.Vitesse);
		Unite pieds = new Unite("pied/seconde", Systeme.Imperial, Categorie.Vitesse);
		//Mass, British
		Unite tonnel = new Unite("tonne longue", Systeme.Imperial, Categorie.Poids);
		Unite tonnec = new Unite("tonne courte", Systeme.Imperial, Categorie.Poids);
		Unite cdll = new Unite("cent douze livres longue", Systeme.Imperial, Categorie.Poids);
		Unite cdlc = new Unite("cent douze livres courte", Systeme.Imperial, Categorie.Poids);
		Unite pierre = new Unite("pierre", Systeme.Imperial, Categorie.Poids);
		Unite livre = new Unite("livre", Systeme.Imperial, Categorie.Poids);
		Unite once = new Unite("once", Systeme.Imperial, Categorie.Poids);
		Unite drachme = new Unite("drachme", Systeme.Imperial, Categorie.Poids);
		Unite grain = new Unite("grain", Systeme.Imperial, Categorie.Poids);
		//Volume, British
		Unite baril = new Unite("baril", Systeme.Imperial, Categorie.Volume);
		Unite boisseau = new Unite("boisseau", Systeme.Imperial, Categorie.Volume);
		Unite picotin = new Unite("picotin", Systeme.Imperial, Categorie.Volume);
		Unite gallon = new Unite("gallon", Systeme.Imperial, Categorie.Volume);
		Unite litrei = new Unite("litre imperial", Systeme.Imperial, Categorie.Volume);
		Unite pinte = new Unite("pinte", Systeme.Imperial, Categorie.Volume);
		Unite ounzef = new Unite("ounze fluide", Systeme.Imperial, Categorie.Volume);
		
	//Converter
		//Length
		metre.setConvertion(metre, 0, 1);
		metre.setConvertion(centimetre, 0, 100);
		metre.setConvertion(millimetre, 0, 1000);
		metre.setConvertion(kilometre, 0, 0.001);
		metre.setConvertion(decimetre, 0, 10);
		metre.setConvertion(nanometre, 0, 1000000000);
		metre.setConvertion(micrometre, 0, 1000000);
		metre.setConvertion(thou, 0, 39370.08);
		metre.setConvertion(mil, 0, 3937.08);
		metre.setConvertion(ligne, 0, 393.7);
		metre.setConvertion(pouce, 0, 39.37);
		metre.setConvertion(main, 0, 9.84);
		metre.setConvertion(lien, 0, 4.97);
		metre.setConvertion(pied, 0, 3.28);
		metre.setConvertion(yard, 0, 1.09);
		metre.setConvertion(tringle, 0, 0.2);
		metre.setConvertion(chaine, 0, 0.05);
		metre.setConvertion(furlong, 0, 0.00497);
		metre.setConvertion(mile, 0, 0.000621);
		metre.setConvertion(ligue, 0, 0.000207);
		
		//Speed
		ms.setConvertion(kms, 0, 0.001);
		ms.setConvertion(ms, 0, 1);
		ms.setConvertion(kmh, 0, 3.6);
		ms.setConvertion(mms, 0, 1000);
		ms.setConvertion(microms, 0, 1000000);
		ms.setConvertion(miles, 0, 0.000621);
		ms.setConvertion(mileh, 0, 2.24);
		ms.setConvertion(pieds, 0, 3.28);
		
		//Mass
		gramme.setConvertion(tonne, 0, 0.000001);
		gramme.setConvertion(kilonewton, 0, 0.00000981);
		gramme.setConvertion(kilogramme, 0, 0.001);
		gramme.setConvertion(hectogramme, 0, 0.01);
		gramme.setConvertion(gramme, 0, 1);
		gramme.setConvertion(carat, 0, 5);
		gramme.setConvertion(centigramme, 0, 100);
		gramme.setConvertion(milligramme, 0, 1000);
		gramme.setConvertion(microgramme, 0, 1000000);
		gramme.setConvertion(nanogramme, 0, 1000000000);
		gramme.setConvertion(tonnel, 0, 0.000000984);
		gramme.setConvertion(tonnec, 0, 0.0000011);
		gramme.setConvertion(cdll, 0, 0.0000197);
		gramme.setConvertion(cdlc, 0, 0.000022);
		gramme.setConvertion(pierre, 0, 0.000157);
		gramme.setConvertion(livre, 0, 0.0022);
		gramme.setConvertion(once, 0, 0.04);
		gramme.setConvertion(drachme, 0, 0.56);
		gramme.setConvertion(grain, 0, 15.43);
		
		//Area
		m2.setConvertion(km2, 0, 0.000001);
		m2.setConvertion(hectare, 0, 0.0001);
		m2.setConvertion(are, 0, 0.01);
		m2.setConvertion(m2, 0, 1);
		m2.setConvertion(dm2, 0, 100);
		m2.setConvertion(cm2, 0, 10000);
		m2.setConvertion(mm2, 0, 1000000);
		
		//Volume
		litre.setConvertion(km3, 0, 0.0000000000001);
		litre.setConvertion(m3, 0, 0.001);
		litre.setConvertion(hl, 0, 0.01);
		litre.setConvertion(decal, 0, 0.1);
		litre.setConvertion(dm3, 0, 1);
		litre.setConvertion(litre, 0, 1);
		litre.setConvertion(dl, 0, 10);
		litre.setConvertion(cl, 0, 100);
		litre.setConvertion(cm3, 0, 1000);
		litre.setConvertion(ml, 0, 1000);
		litre.setConvertion(mm3, 0, 1000000);
		//litre.setConvertion(microm3, 0, 1000000000);
		litre.setConvertion(baril, 0, 0.01);
		litre.setConvertion(boisseau, 0, 0.03);
		litre.setConvertion(picotin, 0, 0.11);
		litre.setConvertion(gallon, 0, 0.22);
		litre.setConvertion(litrei, 0, 0.88);
		litre.setConvertion(pinte, 0, 1.76);
		litre.setConvertion(ounzef, 0, 35.2);
		
		//Temperature
		degreC.setConvertion(degreF, 32, 1.8);
		degreC.setConvertion(degreK, 273.150, 1);
		degreC.setConvertion(degreC, 0, 1);
		
		
		// Tab for store different unit
		// Length
		tab.put(1, centimetre);
		tab.put(2, metre);
		tab.put(3, millimetre);
		tab.put(4, kilometre);
		tab.put(5, decimetre);
		tab.put(6, micrometre);
		tab.put(7, nanometre);
		tab.put(8, thou);
		tab.put(9, mil);
		tab.put(10, ligne);
		tab.put(11, pouce);
		tab.put(12, main);
		tab.put(13, lien);
		tab.put(14, pied);
		tab.put(15, yard);
		tab.put(16, tringle);
		tab.put(17, chaine);
		tab.put(18, furlong);
		tab.put(19, mile);
		
		// Speed
		tab.put(20, ms);
		tab.put(21, kms);
		tab.put(22, kmh);
		tab.put(23, mms);
		tab.put(24, microms);
		tab.put(25, miles);
		tab.put(26, mileh);
		tab.put(27, pieds);
		
		// Mass
		tab.put(28, tonne);
		tab.put(29, kilonewton);
		tab.put(30, kilogramme);
		tab.put(31, hectogramme);
		tab.put(32, gramme);
		tab.put(33, carat);
		tab.put(34, centigramme);
		tab.put(35, milligramme);
		tab.put(36, microgramme);
		tab.put(37, nanogramme);
		tab.put(38, tonnel);
		tab.put(39, tonnec);
		tab.put(40, cdll);
		tab.put(41, cdlc);
		tab.put(42, pierre);
		tab.put(43, livre);
		tab.put(44, once);
		tab.put(45, drachme);
		tab.put(46, grain);
		
		// Area
		tab.put(47, km2);
		tab.put(48, hectare);
		tab.put(49, are);
		tab.put(50, m2);
		tab.put(51, dm2);
		tab.put(52, cm2);
		//tab.put(53, nm2);
		//tab.put(54, microm2);
		//tab.put(55, nm2);
		
		// Volume
		tab.put(53, km3);
		tab.put(54, m3);
		tab.put(55, hl);
		tab.put(56, decal);
		tab.put(57, dm3);
		tab.put(58, litre);
		tab.put(59, dl);
		tab.put(60, cl);
		tab.put(61, cm3);
		tab.put(62, ml);
		tab.put(63, mm3);
		//tab.put(64, microl);
		tab.put(64, baril);
		tab.put(65, boisseau);
		tab.put(66, picotin);
		tab.put(67, gallon);
		tab.put(68, litrei);
		tab.put(69, pinte);
		tab.put(70, ounzef);
		
		// Temperature
		tab.put(71, degreC);
		tab.put(72, degreK);
		tab.put(73, degreF);
		
	}
	
	public Object convert(int source, int target, double value) {
		if(tab.containsKey(source) && tab.containsKey(target)) {
			if(tab.get(source).getCategorie() == tab.get(target).getCategorie())
			{
				Unite ref = null;
				if(tab.get(source).getCategorie() == Categorie.Longueur) 
				{
					ref = tab.get(2);
				}
				else if(tab.get(source).getCategorie() == Categorie.Vitesse)
				{
					ref = tab.get(20);
				}
				else if(tab.get(source).getCategorie() == Categorie.Poids)
				{
					ref = tab.get(32);
				}
				else if(tab.get(source).getCategorie() == Categorie.Superficie)
				{
					ref = tab.get(50);
				}
				else if(tab.get(source).getCategorie() == Categorie.Volume)
				{
					ref = tab.get(58);
				}
				else if(tab.get(source).getCategorie() == Categorie.Temperature)
				{
					ref = tab.get(71);
				}
				else
					ref = tab.get(2);
				
				return new Double(tab.get(source).convert(tab.get(target), value, ref).toString());
			}
			return false;
		}
		return false;
	}

}