package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import dao.EDao;
import dao.MemoireEDao;
import dao.MysqlEDao;
import idgenerator.AutoIncrId;
import idgenerator.PrefixeGenId;
import idgenerator.TimeStumpId;
import eservice.EService;

@Configuration
@ComponentScan(basePackages = {"eservice", "dao", "idgenerator", "student"})
public class AppConfig {
    
    @Bean
    public EDao mysqlEDao() {
        return new MysqlEDao();
    }

    @Bean
    public EDao memoireEDao() {
        return new MemoireEDao();
    }

    @Bean
    public AutoIncrId autoIncrIdGenerateur() {
        return new AutoIncrId();
    }

    @Bean
    public TimeStumpId timeStumpId() {
        return new TimeStumpId();
    }

    @Bean
    public PrefixeGenId prefixeGenId() {
        return new PrefixeGenId();
    }

    

}
