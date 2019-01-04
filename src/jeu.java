import java.util.ArrayList;

public class jeu {
	
	public static int jeu()
	{
		boolean trouve = false;
		int essais = 10;
		
		ArrayList<Integer> code = aleatoire.generationCode();
		ArrayList<Pion> combinaisonSecrete = aleatoire.combinaisonSecr�te(code); //combi secrete
		affichage.ModeTriche(combinaisonSecrete);
		while(!trouve && essais > 0)
		{
			
			ArrayList<Pion> saisieJoueur = Saisie.saisieCombinaison(); //propo du joueur
			int blanc = traitement.controleBlanc(combinaisonSecrete, saisieJoueur);
			int noir = traitement.controleNoir(combinaisonSecrete, saisieJoueur);
			System.out.println(" pion Blancs :  " + blanc);
			System.out.println("pion Noirs  :  " + noir);
			essais--;
			if(blanc ==4)
			{
				trouve = true; 
				System.out.println(" ------------------------------------------------------------- ");
				System.out.println("Vous avez trouv� en  " + (essais+ 1) + " essais ");
				System.out.println(" ------------------------------------------------------------- ");
				System.out.println("Bien jou� ");
			}
			else
			{
				System.out.println("il vous reste " + essais + " chances ");
			}
		}
		return 0;
		}
	
	
	
	
	

	
}
