package idgenerator;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;
import idgenerator.generateurid;

@Component
public class AutoIncrId implements generateurid {
    private int cpt = 0;

    @Override
    public String genererId() {
        cpt++;
        return Integer.toString(cpt); 
    }
}
