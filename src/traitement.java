import java.util.ArrayList;

//couche m�tier
public class traitement 
{
	//Cette m�thode retourne le nombre de pions corrects mais pas for��ment bien plac�s
	public static Integer controleNoir(ArrayList<Pion> combinaisonSecrete, ArrayList<Pion> propositionJoueur)
	{
		Integer noir = 0;
		
		for(Pion lePionSecret : combinaisonSecrete )
		{
			for(Pion lePionJoueur : propositionJoueur)
			{
				if(lePionSecret.getIdPion() == lePionJoueur.getIdPion())
				{
					noir++;
				}
			}
		}
		return noir;
	}
	//Cette m�thode retourne le nombre de pions corrects et bien plac�s
	public static Integer controleBlanc(ArrayList<Pion> combinaisonSecrete, ArrayList<Pion> propositionJoueur)
	{
		Integer blanc = 0;
		
		for(int i =0; i<=3; i++)
		{
			if(combinaisonSecrete.get(i).equals(propositionJoueur.get(i)))
			{
				blanc++;
			}
		}
		return blanc;
	}
}
