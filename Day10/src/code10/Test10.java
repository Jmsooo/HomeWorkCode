package code10;

public class Test10 {
    public static void main(String[] args) {
        Woman woman = new Woman();
        Man man = new Man();
        Person[] people = {woman,man};

        for (int i = 0; i < people.length; i++) {
            people[i].pee();
        }

    }
}
