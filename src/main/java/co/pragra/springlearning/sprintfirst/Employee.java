package co.pragra.springlearning.sprintfirst;

import java.util.List;
import java.util.Set;

public class Employee {
    private Set<Address> addresses;
    private String name;

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "addresses=" + addresses +
                ", name='" + name + '\'' +
                '}';
    }
}
