package chapter1.abstractity;

public abstract class UserAccess {
    public abstract void getAllUsers();

    public abstract void getUser(String name);

    public abstract void addUser(String name, String data);

    public abstract void updateUser(String name, String data);

//    public void getDescription() {
//        System.out.println("Getting description for UserAccess class");
//    }
}
