// La boucle do-while
// Cette boucle ressemble à while, mais possède une différence importante :
// do-while exécute le bloc au moins une fois, même si la condition est fausse dès le départ.

// Java exécute d'abord le bloc do.
// Il affiche 10.
// Il augmente i à 11.
// Il vérifie i <= 5.
// La condition est fausse, donc la boucle s'arrête.


public class BoucleDoW {
    public static void main(String[] args) {
        int i = 10;

        do{
            System.out.println(i);
            i++;
        } while(i <= 5);
    }
}
