package co.pragra.springlearning.sprintfirst;

public class Car {
    private IEngine engine;
    private String color;

    public Car(IEngine engine, String color) {
        this.engine = engine;
        this.color = color;
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
