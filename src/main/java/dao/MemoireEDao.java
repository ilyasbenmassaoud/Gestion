package dao;
import org.springframework.stereotype.Component; // Importer l'annotation @Component
import student.Etudiant;
import dao.EDao;
import java.util.ArrayList;

@Component 
public class MemoireEDao implements EDao {
    private ArrayList<Etudiant> etudiants = new ArrayList<>();

    @Override
    public void persister(Etudiant etudiant) {
        etudiants.add(etudiant);
        System.out.println("Étudiant ajouté dans la liste avec succès");
    }
}
