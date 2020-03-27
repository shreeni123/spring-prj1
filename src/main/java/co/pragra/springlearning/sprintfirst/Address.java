package co.pragra.springlearning.sprintfirst;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String address;
    private String country;

    public Address(String address, String country) {
        this.address = address;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
