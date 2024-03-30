package dao;
import org.springframework.stereotype.Component; // Importer l'annotation @Component
import student.Etudiant;
import dao.EDao;

@Component 
public class MysqlEDao implements EDao {
    @Override
    public void persister(Etudiant etudiant) {       
        System.out.println("Vous êtes ajouté à Mysql avec succès ");
    }
}
