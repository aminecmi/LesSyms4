package Cases;

import Etats.EtatPersonnageKO;
import Etats.EtatPersonnageOK;
import Objets.ObjetAbstrait;
import Person.Personnage;

import java.util.HashMap;

public abstract class CaseAbstraite {

	protected Personnage occupant;
    protected ObjetAbstrait objetOccupant;


    HashMap<PointsCardinaux, CaseAbstraite> voisins;

    Coordonnees coord;

    public CaseAbstraite(int vert, int hor) {
        coord = new Coordonnees(vert, hor);

        // peupler ici ?
        voisins = new HashMap<PointsCardinaux, CaseAbstraite>();

        occupant = null;
        objetOccupant= null;
    }

    public void ajouterVoisin(PointsCardinaux p, CaseAbstraite c) {
        voisins.put(p, c);
    }

    public void ajouterOccupant(Personnage occ) {
        this.occupant = occ;
    }
    
    public void ajouterObjet(ObjetAbstrait objet) {
        this.objetOccupant = objet;
    }

    public Personnage getOccupant() {
        return occupant;
    }
    
    public ObjetAbstrait getObjetOccupant() {
  		return objetOccupant;
  	}

  	public void setObjetOccupant(ObjetAbstrait objetOccupant) {
  		this.objetOccupant = objetOccupant;
  	}

  	public void setOccupant(Personnage occupant) {
  		this.occupant = occupant;
  	}
  	
	public HashMap<PointsCardinaux, CaseAbstraite> getVoisins() {
		return voisins;
	}

	public void setVoisins(HashMap<PointsCardinaux, CaseAbstraite> voisins) {
		this.voisins = voisins;
	}
    
    public ObjetAbstrait rechercheObjetProche(){
    	ObjetAbstrait objetDeLaCase = null;
    	
    	for (PointsCardinaux mapKey : voisins.keySet()) {
    		if (voisins.get(mapKey).getObjetOccupant() != null)
    		{
    			objetDeLaCase = voisins.get(mapKey).getObjetOccupant();
    		}
    	}
    	if (objetDeLaCase != null)
    	{
        	for (PointsCardinaux mapKey : voisins.keySet()) {
        		switch(mapKey)
        		{
        			case N:
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.N) != null){
        					objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.N).getObjetOccupant();
        				}
        				break;
        			case NE:
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.N) != null){
        					objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.N).getObjetOccupant();
        				}
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.NE) != null){
        					objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.NE).getObjetOccupant();
        				}
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.E) != null){
        					objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.E).getObjetOccupant();
        				}
        				break;
        			case E:
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.E) != null){
        					objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.E).getObjetOccupant();
        				}
        				break;
        			case SE:
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.E) != null){
        					objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.E).getObjetOccupant();
        				}
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.SE) != null){
        					objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.SE).getObjetOccupant();
        				}
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.S) != null){
        					objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.S).getObjetOccupant();
        				}
        				break;
        			case S:
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.S) != null){
        					objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.S).getObjetOccupant();
        				}
        				break;
        			case SW:
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.S) != null){
        					objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.S).getObjetOccupant();
        				}
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.SW) != null){
        					objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.SW).getObjetOccupant();
        				}
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.W) != null){
        					objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.W).getObjetOccupant();
        				}
        				break;
        			case W:
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.W) != null){
        					objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.W).getObjetOccupant();
        				}
        				break;
        			case NW:
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.W) != null){
        					objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.W).getObjetOccupant();
        				}
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.NW) != null){
        					objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.NW).getObjetOccupant();
        				}
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.N) != null){
        					objetDeLaCase = voisins.get(mapKey).getVoisins().get(PointsCardinaux.N).getObjetOccupant();
        				}
        				break;
        		default:
        			break;
        		
        		}
        	}	
    	}
    	return objetDeLaCase;
    }
    
    public Personnage rechercheJoueur(){
    	Personnage personne = null;
    	
    	for (PointsCardinaux mapKey : voisins.keySet()) {
    		if (voisins.get(mapKey).getOccupant() != null)
    		{
    			personne = voisins.get(mapKey).getOccupant();
    		}
    	}
    	if (personne != null)
    	{
        	for (PointsCardinaux mapKey : voisins.keySet()) {
        		switch(mapKey)
        		{
        			case N:
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.N) != null){
        					personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.N).getOccupant();
        				}
        				break;
        			case NE:
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.N) != null){
        					personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.N).getOccupant();
        				}
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.NE) != null){
        					personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.NE).getOccupant();
        				}
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.E) != null){
        					personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.E).getOccupant();
        				}
        				break;
        			case E:
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.E) != null){
        					personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.E).getOccupant();
        				}
        				break;
        			case SE:
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.E) != null){
        					personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.E).getOccupant();
        				}
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.SE) != null){
        					personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.SE).getOccupant();
        				}
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.S) != null){
        					personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.S).getOccupant();
        				}
        				break;
        			case S:
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.S) != null){
        					personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.S).getOccupant();
        				}
        				break;
        			case SW:
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.S) != null){
        					personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.S).getOccupant();
        				}
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.SW) != null){
        					personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.SW).getOccupant();
        				}
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.W) != null){
        					personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.W).getOccupant();
        				}
        				break;
        			case W:
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.W) != null){
        					personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.W).getOccupant();
        				}
        				break;
        			case NW:
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.W) != null){
        					personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.W).getOccupant();
        				}
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.NW) != null){
        					personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.NW).getOccupant();
        				}
        				if (voisins.get(mapKey).getVoisins().get(PointsCardinaux.N) != null){
        					personne = voisins.get(mapKey).getVoisins().get(PointsCardinaux.N).getOccupant();
        				}
        				break;
        		default:
        			break;
        		
        		}
        	}	
    	}
    	return personne;
    }
}