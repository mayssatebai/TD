// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Etudiant e1= new Etudiant(1,"mayssa","tebai");
        Etudiant e2=new Etudiant(2,"riahb","kefi");

        System.out.println(e1.getId());
        e1.setId(30);
        System.out.println(e1.getId());

        System.out.println(e1.Equals(e2));
        System.out.println(e1.toString());
        System.out.println(e2.toString());

        University espritVector = new EspritVector();
        espritVector.ajouterEtudiant(e1);
        espritVector.ajouterEtudiant(e2);
        System.out.println("Liste d'étudiants avant le tri par nom :");
        espritVector.displayEtudiants();

        espritVector.trierEtudiantsParNom();
        System.out.println("Liste d'étudiants après le tri par nom :");
        espritVector.displayEtudiants();
    }
}