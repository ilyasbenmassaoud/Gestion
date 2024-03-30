package eservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.EDao;
import student.Etudiant;

@Service 
public class EService {
    private EDao mysqlEDao;
    private EDao memoireEDao;

    @Autowired 
    public EService(EDao mysqlEDao, EDao memoireEDao) {
        this.mysqlEDao = mysqlEDao;
        this.memoireEDao = memoireEDao;
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        mysqlEDao.persister(etudiant);
        memoireEDao.persister(etudiant);
    }
}
