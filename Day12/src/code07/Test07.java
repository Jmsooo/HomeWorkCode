package code07;

public class Test07 {
    public static void main(String[] args) {
        User[] users = new User[15];
        for (int i = 0; i < users.length; i++) {
            users[i] = new User(null, i + 1);
        }

        Receptionist r1 = new Receptionist(new Filter() {
            @Override
            public void filterUser(User user) {
                user.setType("v1");
            }
        });
        for (int i = 0; i < 5; i++) {
            r1.recept(users[i]);
        }

        Receptionist r2 = new Receptionist(new Filter() {
            @Override
            public void filterUser(User user) {
                user.setType("v2");
            }
        });
        for (int i = 5; i < 10; i++) {
            r2.recept(users[i]);
        }

        Receptionist r3 = new Receptionist(new Filter() {
            @Override
            public void filterUser(User user) {
                user.setType("A");
            }
        });
        for (int i = 10; i < 15; i++) {
            r3.recept(users[i]);
        }

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }
    }
}
