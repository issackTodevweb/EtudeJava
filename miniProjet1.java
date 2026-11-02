// Format	Type de donnée	Exemple
// %s	Texte (String)	Emmanuel
// %d	Nombre entier (int)	20
// %f	Nombre décimal (float, double)	15.750000
// %.2f	Décimal avec 2 chiffres après le séparateur	15.75
// %n	Retour à la ligne	—

import java.util.Scanner;

public class miniProjet1 {
    public static void main(String[] args) {
        try(Scanner clavier = new Scanner(System.in)){
            System.out.println("nombre de note que vous souhaiter saisir: ");
            int nombreNotes = clavier.nextInt();

            if (nombreNotes < 0){
                System.out.println("le nombre de note doit etre positif");
            }else{
                double somme = 0;
                for (int i = 1; i <= nombreNotes; i++){
                    System.err.println("Entrer note " +i+ " :");
                    double note = clavier.nextDouble();
                    if (note < 0 || note > 20){
                        System.out.println("Erreur: entrer un note valide");
                    }
                    somme = somme + note;
                }
                double moyenne = somme / nombreNotes;
                
                System.out.printf(" La Moyenne : %.2f%n", moyenne);
                if (moyenne >= 10){
                    System.out.println("Admis");
                }else{
                    System.out.println("non Admis");
                }

            }
        }
    }
}
