package main.ua.alvin.config;

import main.ua.alvin.service.TariffsTableService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("main.ua.alvin")
public class TablesServiceConfig {


    @Bean
    public TariffsTableService tariffsTableService(){
        return new TariffsTableService();
    }

}
