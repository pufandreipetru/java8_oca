package oca.chapter1.abstractity;

public class UserAccessTest {
    public static void main(String[] args) {
        // UserAccess userAccess = new UserAccess();
        UserAccess userAccess = new UserAccessImplementation();
        userAccess.getAllUsers();
        userAccess.getUser("user1");
        userAccess.addUser("user2", "user2 data");
        userAccess.updateUser("user3", "user3 data");
    }
}
