package co.pragra.springlearning.sprintfirst;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements IEngine {
    @Override
    public String engineType() {
        return "PETROL ENGINE";
    }

    @Override
    public String toString() {
        return "PetrolEngine{"+ engineType()+"}";
    }
}
