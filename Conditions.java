import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        try(Scanner clavier = new Scanner(System.in)){
            System.out.println("Entrer votre nom : ");
            String nom = clavier.nextLine();

            System.out.println("note 1 : ");
            double note1 = clavier.nextDouble();

            System.out.println("note 1 : ");
            double note2 = clavier.nextDouble();

            if (note1<0 || note1>20 || note2<0 || note2>20){
                System.out.println("Erreur: ecrire un note positive");
            }else{
                double moyenne = (note1 + note2) / 2 ;
                System.out.printf("%s, Votre moyenne est : %.2f%n", nom, moyenne);
                if (moyenne >= 16) {
                    System.out.println("Appreciation : Tres bien.");
                } else if (moyenne >= 14) {
                    System.out.println("Appreciation : Bien.");
                } else if (moyenne >= 12) {
                    System.out.println("Appreciation : Assez bien.");
                } else if (moyenne >= 10) {
                    System.out.println("Resultat : Admis.");
                } else {
                    System.out.println("Resultat : Ajourne.");
                }
            } 
        }

    }
}
