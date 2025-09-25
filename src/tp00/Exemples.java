package tp00;

import java.util.Scanner;

public class Exemples {
	/** Ici debut la javadoc
	 * Calcule la décision d'une note
	 * @param note entier entre 0 et 100
	 * @return Une décision refus, ajourné, reussite
	 */ 
	//Ici termine la javadoc, juste en dessous mais voila
	/// Ici on a creer une fonction, elle renvoie une chaine de caractere
	///
	public static String calculDecision(int note) {
		
		assert note >=0 &&  note <=100;  // *voir note en bas pour l'assertion
			String res;
		if(note<30)
			res = "refus";
		else if (note < 50)
			res = "Ajourné";
		else
			res = "reussite";	
		return res;
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrez une note: ");
		int note = scan.nextInt();
		
		String decision = calculDecision(note);
		System.out.println("La decision est: "+decision);
		scan.close();
  }
}
	// par contre le prof a fait run puis -ea , il a run puis ensuite il a fait clique droit et choisi en dessous de run un truc genre ea 

//*assertion Le prof a dit que les assertions servent que quand l'user entre un nombre, s'il rentre pas le nombre qu'il faut, le programme s'arrete, le programme va pourvoir continuer si 
//SEULEMENT l'user rentre le bon nombre