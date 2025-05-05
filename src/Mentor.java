public class Mentor extends User{
    public String department;


    public Mentor(int id, String name, String department) {
        super(id, name);
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
}
