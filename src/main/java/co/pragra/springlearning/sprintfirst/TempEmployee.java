package co.pragra.springlearning.sprintfirst;

import org.springframework.stereotype.Component;

@Component
public class TempEmployee {
    private Address address;

    public TempEmployee(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "TempEmployee{" +
                "address=" + address +
                '}';
    }
}
