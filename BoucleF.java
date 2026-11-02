
// 1. Initialisation (i = 1)
// On crée une variable entière i et on lui donne la valeur 1. C'est le point de départ du compteur.

// 2. Condition (i <= 5)
// Java vérifie si i est inférieur ou égal à 5. Tant que cette condition est vraie, la boucle continue.

// 3. Incrémentation (// i++)
// Après chaque répétition, i++ augmente i de 1. C'est équivalent à i = i + 1.

// public class BoucleF {
//     public static void main(String[] args) {
//         for (int i = 0; i <= 5; i++){
//             System.out.println(i);
//         }
//     }
// }

import java.util.Scanner;

public class BoucleF {
     public static void main(String[] args) {
        try(Scanner clavier = new Scanner(System.in)){
            int somme = 0; 
            for (int i = 1; i <= 3; i++){
                System.out.println("Entrer un nombre: ");
                int nombre = clavier.nextInt();
                somme = somme + nombre;
            }
            System.out.println("Somme total : " +somme);

        }
    }
}



// for (int i = 1; i <= 10; i++) {
//     if (i == 4) {
//         break; (break : arrêter la boucle)
//     }

//     System.out.println(i);
// }



// for (int i = 1; i <= 5; i++) {
//     if (i == 3) {
//         continue;  (continue : passer au tour suivant)
//     }

//     System.out.println(i);
// }