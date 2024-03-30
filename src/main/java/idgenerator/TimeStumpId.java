package idgenerator;
import  idgenerator.generateurid;
import java.util.Date;


public class TimeStumpId implements generateurid  {

	
	public String genererId() {
	Date date=new Date();
    long millisecond=date.getTime();
        return Long.toString(millisecond);	
	}
	
	
}
