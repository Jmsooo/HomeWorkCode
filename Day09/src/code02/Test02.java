package code02;

public class Test02 {
    public static void main(String[] args) {
        new Child("mike");
    }
}

class People {
    private String name;

    public People() {
        System.out.print("1");
    }

    public People(String name) {
        System.out.print("2");
        this.name = name;
    }
}

class Child extends People {
    People father;

    public Child(String name) {
        System.out.print("3");
        father = new People(name + " F");
    }

    public Child() {
        System.out.print("4");
    }
}