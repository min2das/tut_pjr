package mintu.spring.tut_pjr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public MyMessage message(){
        MyMessage myMessage= new MyMessage();
        return myMessage;
    }
}
