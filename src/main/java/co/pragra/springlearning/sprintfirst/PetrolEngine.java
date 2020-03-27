package co.pragra.springlearning.sprintfirst;

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
