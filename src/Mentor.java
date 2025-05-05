public class Mentor extends User implements Notifiable{
    public String department;


    public Mentor(String name, String department) {
        super(name);
        this.department = department;
    }

    @Override
    public String getUserRole(){
        return "Mentor";
    }

    public String getDepartment(){
        return department;
    }

    @Override
    public String toString() {
        return getUserRole() + "[ID=" + getId() + ", Name=" + getName() + ", Department=" + department + "]";
    }

    @Override
    public void notify(String message) {
        System.out.println("Notification for Mentor " + getName() + ": " + message);
    }

}
