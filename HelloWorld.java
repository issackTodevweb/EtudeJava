import java.util.Scanner;
// import java.util.Locale;


public class HelloWorld {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        // clavier.useLocale(Locale.US);

        System.out.println("Entrer votre note num 1 : ");
        double note1 = clavier.nextDouble();

        System.out.println("Entrer votre note num 2 : ");
        double note2 = clavier.nextDouble();
        clavier.nextLine();
        
        System.out.println("Entrer votre nom : ");
        String nom = clavier.nextLine();

        double moyenne = (note1 + note2) / 2;
        
        System.out.printf("%s, votre moyenne est : %.2f/20%n", nom, moyenne);
        clavier.close();

    }
}
