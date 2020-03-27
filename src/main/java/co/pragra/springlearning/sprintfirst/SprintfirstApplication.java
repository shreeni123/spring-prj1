package co.pragra.springlearning.sprintfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SprintfirstApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //SpringApplication.run(SprintfirstApplication.class, args);
        Car car =  context.getBean("car", Car.class);
        System.out.println(car);

//        Employee employee = context.getBean("employee", Employee.class);
//        System.out.println(employee);
//
        CarRating carRating = context.getBean("carRating", CarRating.class );
        System.out.println(carRating);
//
//        TempEmployee tempEmployee = context.getBean("tempEmployee", TempEmployee.class);
//        System.out.println();



    }

}
