package base.passBy;

public class Dog {
    private String name;

    Dog(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    String getObjectAddress() {
        return super.toString();
    }
}
