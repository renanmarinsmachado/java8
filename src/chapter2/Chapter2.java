package chapter2;

import java.util.Arrays;
import java.util.List;

public class Chapter2 {

    public static void main(String[] args) {

        User user1 = new User("name1", 43);
        User user2 = new User("name2", 98);
        User user3 = new User("name3", 76);

        List<User> users = Arrays.asList(user1, user2, user3);

        //for (chapter2.User user : users) {
        //    System.out.println(user);
        //}

        //users.forEach(new chapter2.Shower());

        //users.forEach((chapter2.User u) -> {
        //    System.out.println(u);
        //});

        users.forEach(u -> System.out.println(u));

        users.forEach(User::turnModerator);

        users.forEach(new Shower());
    }
}

