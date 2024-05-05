package Project;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        System.out.println(address.createAddress("Poland", "Warsaw", "03-234", "Złota 44", 4));

        Multiplier m = new Multiplier();
        System.out.println(m.multiply(2, 2));

        Adder a = new Adder();
        System.out.println(a.add(4, 4));
    }
}
