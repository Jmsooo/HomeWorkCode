package code11;

public class Test11 {
    public static void main(String[] args) {
        Chinese chinese = new Chinese();
        American american = new American();
        Indian indian = new Indian();
        Person[] people = {chinese,american,indian};

        for (int i = 0; i < people.length; i++) {
            people[i].eat();
        }

    }
}
