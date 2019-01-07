import java.util.ArrayList;

public class jeu {
	

	
	public static int jeu()
	{
		
		// Proposer choix type d'affichage sur Jeu - Graphique ou Console
		int choixModeJeu = Saisie.choixModeJeu();
		switch(choixModeJeu)
		{
		case 1 : 
			System.out.println("vous avez choisi le mode console ==== >");
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
					System.out.println("Vous avez trouv� en  " + (10-(essais)) + " essais ");
					System.out.println(" ------------------------------------------------------------- ");
					System.out.println("Bien jou� ");
				}
				else
				{
					System.out.println("il vous reste " + essais + " chances ");
				}
			}
	
			break;
		
		case 2:
			System.out.println("vous avez choisi le mode graphique [-----]");
			Window win = new Window("MasterMind",400,700);
			
			ArrayList<Integer> codeWindow = aleatoire.generationCode();
			ArrayList<Pion> combinaisonSecreteWindow = aleatoire.combinaisonSecr�te(codeWindow); //combi secrete
			break;
			
			
		default: 
			System.out.println("erreur");
			break;
			
		}
		
		
		return 0;
	
	
	}
			
}
