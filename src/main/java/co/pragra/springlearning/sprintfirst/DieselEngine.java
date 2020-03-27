package co.pragra.springlearning.sprintfirst;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements IEngine {
    @Override
    public String engineType() {
        return "DIESEL ENGINE";
    }
}
