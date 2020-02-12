package oca.chapter1.abstractity;

public class UserAccessImplementation extends UserAccess {
    @Override
    public void getAllUsers() {
        System.out.println("Getting all users");
    }

    @Override
    public void getUser(String name) {
        System.out.println("Getting a user with name " + name);
    }

    @Override
    public void addUser(String name, String data) {
        System.out.println("Add a user with name " + name);
    }

    @Override
    public void updateUser(String name, String data) {
        System.out.println("Updating a user with name " + name);
    }
}
