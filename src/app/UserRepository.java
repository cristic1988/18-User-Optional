package app;

import java.util.*;


public class UserRepository {


    public List<User> getData() {
        return Arrays.asList(
                new User(25478, "Alice", "alice@mail"),
                new User(54895, "Den", "den@mail"),
                new User(25897, "Rosa", "rosa@mail"),
                new User(35974, "Will", "will@mail"),
                new User(89452, "Lisa", "lisa@mail"));
    }
}
