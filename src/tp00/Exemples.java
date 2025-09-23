package tp00;

import java.util.Scanner;

public class Exemples {
	/**
	 * Calcule la décision d'une note
	 * @param note entier entre 0 et 100
	 * @return Une décision refus, ajourné, reussite
	 */
	/// Ici on a creer une fonction, elle renvoie une chaine de caractere///
	///
	public static String calculDecision(int note) {
		
		assert note >=0 &&  note <=100;
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
	// par contre le prof a fait run puis -ea mais je vois pas ou je dois choisir le truc
}

