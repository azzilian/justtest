package data;

import java.util.List;
import java.util.Random;

public class DataProviderUsers {
    private static List<User> userList;

    static {
        userList.add(new User());
    }
    public static User getValidUser() {
        return new User("Elena", "Isf","enail@dsa","Female","3232");
    }

    public static User gerRandomUser() {
        return userList.get(new Random().nextInt(userList.size() - 1));
    }
}
