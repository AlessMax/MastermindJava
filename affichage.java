//couche m�tier
import java.util.ArrayList;

public class affichage {
	
	//M�thode qui affiche la liste des couleurs disponibles ...
	public static void affichage()
	{
		ArrayList<Pion> LesPions = Pion.getLesPions();
		for(Pion unPion : LesPions)
		 {
			 System.out.println(unPion.getIdPion() + "  -  " + unPion.getCouleurPion());
		 }
	}

}
