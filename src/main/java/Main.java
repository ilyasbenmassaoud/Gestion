import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import eservice.EService; // Assurez-vous que la classe EService est importée depuis le bon package
import student.Etudiant;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EService eService = context.getBean(EService.class); // Utilisez EService.class au lieu de eService.class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer le nom de l'étudiant : ");
        String nom = scanner.nextLine();

        System.out.println("Veuillez entrer le prénom de l'étudiant : ");
        String prenom = scanner.nextLine();

        System.out.println("Veuillez entrer l'ID de l'étudiant : ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Lire la nouvelle ligne après le prochain entier

        Etudiant etudiant = new Etudiant(nom, prenom, id);
        eService.ajouterEtudiant(etudiant);

        context.close();
    }
}
