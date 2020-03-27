package co.pragra.springlearning.sprintfirst;

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
