package co.pragra.springlearning.sprintfirst;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private IEngine engine;

    @Value("${car.color}")
    private String color;

    public Car(@Qualifier("dEngine") IEngine engine) {
        this.engine = engine;
    }

    public void initMethod(){
        System.out.println("HURRAYY I M GOING TO DO SOMETHING");
    }
    public void destroyMethod(){
        System.out.println("ALL CLEANED UP NOW READY TO DIE");
    }



    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", color='" + color + '\'' +
                '}';
    }
}
