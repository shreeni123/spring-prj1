package co.pragra.springlearning.sprintfirst;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import java.util.HashMap;
import java.util.Map;

@PropertySource("classpath:application.properties")
@PropertySource("classpath:data.properties")
@ComponentScan(basePackages = "co.pragra.springlearning.sprintfirst" )
public class AppConfig {

    @Value("${car.color: RED}")
    private String color;
    @Value( "${application.type}")
    private String rating;

    @Bean
    public Address address(){
        return new Address("Brampton","Canada");
    }

    @Bean
    public CarRating carRating(){
        Map<String,String> ratingMap = new HashMap<>();
        ratingMap.put("Honda","1");
        ratingMap.put("Toyota","2");
        return new CarRating(ratingMap);
    }
}
