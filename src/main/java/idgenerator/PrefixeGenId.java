package idgenerator;
import idgenerator.generateurid;
import java.util.Date;


public class PrefixeGenId implements generateurid {
    private String prefix;
    private long compteur;
    @Override
    public String genererId() {
        return prefix + compteur++;
    }
}
