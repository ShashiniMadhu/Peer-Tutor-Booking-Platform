public abstract class User {
    private int id;
    public String name;
    private static int nextId = 1;

    public User(int id, String name) {
        this.id = nextId++;
        this.name = name;
    }

    //getter for User id
    public int getId() {
        return id;
    }

    //getter for User name
    public String getName() {
        return name;
    }

    //setter for User name
    public void setName(String name) {
        this.name = name;
    }

    //abstract method for get User role
    public abstract String getUserRole();

    @Override
    public String toString(){
        return getUserRole() + "[ID=" + id + ", Name=" + name + "]";
    }
}
