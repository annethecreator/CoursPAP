package tp00;

import java.util.Scanner;

public class Exemples {
	/**
	 * Calcule la décision d'une note
	 * @param note entier entre 0 et 100
	 * @return Une décision refus, ajourné, réussite
	 */
	/// Ici on a creer une fonction, elle renvoie une chaine de caractere///
	///
	public static String calculDecision(int note) {
		String res = "Reussite";
		
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
