package co.pragra.springlearning.sprintfirst;

import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

public class AppConfig {

    @Bean
    public Car car(){
        return new Car(new PetrolEngine(), "Black");
    }

    @Bean
    public CarRating carRating(){
        Map<String,String> ratingMap = new HashMap<>();
        ratingMap.put("Honda","1");
        ratingMap.put("Toyota","2");
        return new CarRating(ratingMap);
    }
}
