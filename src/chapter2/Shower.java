package chapter2;

import java.util.function.Consumer;

public class Shower implements Consumer<User> {
    @Override
    public void accept(User user) {
        System.out.println(user);
    }
}
